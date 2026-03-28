package com.devsuperior.crud_clientes.dto;


import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.Instant;

@JsonPropertyOrder({"timestamp", "status", "path", "message"})
public class CustomErrorDTO {

    private Instant timestamp;
    private Integer status;
    private String message;
    private String path;

    public CustomErrorDTO(Instant timestamp, Integer status, String message, String path) {
        this.timestamp = timestamp;
        this.status = status;
        this.message = message;
        this.path = path;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public Integer getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }

    public String getPath() {
        return path;
    }
}
