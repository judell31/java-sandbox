package com.judell.playground.api_connection;

import lombok.Data;

import java.util.List;

@Data
public class WordDefinitionModel {
    private String word;
    private String pronunciation;
    private List<DefinitionListModel> definitions;
}
