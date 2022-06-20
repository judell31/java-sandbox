package com.judell.playground.api_connection;

import java.util.List;

public class WordDefinitionModel {
    private String word;
    private String pronunciation;
    private List<DefinitionListModel> definitions;

    public String getWord() {
        return word;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public List<DefinitionListModel> getDefinitions() {
        return definitions;
    }
}
