package com.example.carapibackend.enums;

import com.fasterxml.jackson.annotation.JsonValue;

public enum TransmissionType {
    AUTOMATIC("Automatic"),
    MANUAL("Manual");

    private final String type;

    TransmissionType(String value){
        this.type = value;
    }

    @JsonValue
    public String getValue(){
        return type;
    }
}
