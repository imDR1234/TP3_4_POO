package com.TP3.TP3.model.records;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Feature(String type, Geometry geometry, Properties properties) {

}
