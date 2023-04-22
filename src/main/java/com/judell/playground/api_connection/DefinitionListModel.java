package com.judell.playground.api_connection;

import lombok.Data;

@Data
public class DefinitionListModel {
    private String type;
    private String definition;
    private String example;
    private String image_url;
    private String emoji;
}
