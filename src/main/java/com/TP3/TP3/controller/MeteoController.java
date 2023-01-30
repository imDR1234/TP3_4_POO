package com.TP3.TP3.controller;

import com.TP3.TP3.model.records.ResponseGeo;
import com.TP3.TP3.model.records.ResponseMeteo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;


@Controller
public class MeteoController {

    @Autowired
    RestTemplate restTemplate;

    public ResponseGeo getGeo(String address) {
        return restTemplate.getForObject(
                "https://api-adresse.data.gouv.fr/search/?q="+address, ResponseGeo.class);
    }

    public ResponseMeteo getMeteo(String address) {
        ResponseGeo rs = getGeo(address);
        String cityCode = rs.features()[0].properties().citycode();
        Double coordonnees[] = rs.features()[0].geometry().coordinates();
        HttpHeaders headers = new HttpHeaders();
        headers.set("Authorization", "Bearer 92cd4a3d28532ba36faf9307d3e862d4096cf9ce071270b3347da818440de007");
        HttpEntity<ResponseMeteo> request = new HttpEntity<>(headers);
        return restTemplate.exchange("https://api.meteo-concept.com/api/forecast/daily?latlng="+coordonnees[1]+"%2C"+coordonnees[0]+"&insee="+cityCode, HttpMethod.GET, request, ResponseMeteo.class).getBody();
    }



    @RequestMapping(value = "/meteo", method = RequestMethod.POST)
    public String afficherMeteo(@RequestParam(name = "address") String addressGET, Model model) {
        ResponseMeteo rpsmeto = getMeteo(addressGET);
        model.addAttribute("address", addressGET);
        model.addAttribute("cityName", rpsmeto.city().name());
        return "meteo";
    }

}
