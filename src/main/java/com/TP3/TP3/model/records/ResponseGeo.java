package com.TP3.TP3.model.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ResponseGeo(String type, String version, Feature[] features) {
    
}
