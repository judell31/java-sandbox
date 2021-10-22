package com.judell.playground.word_dictionary;

import java.util.List;

public class OwlWordModel {
    private String word;
    private String pronunciation;
    private List<OwlDefinition> owlDefinitions;

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getPronunciation() {
        return pronunciation;
    }

    public void setPronunciation(String pronunciation) {
        this.pronunciation = pronunciation;
    }

    public List<OwlDefinition> getDefinitions() {
        return owlDefinitions;
    }

    public void setDefinitions(List<OwlDefinition> owlDefinitions) {
        this.owlDefinitions = owlDefinitions;
    }
}
