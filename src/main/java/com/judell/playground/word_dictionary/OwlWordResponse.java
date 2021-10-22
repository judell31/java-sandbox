package com.judell.playground.word_dictionary;

import java.util.List;

public class OwlWordResponse {
    public String word;
    public String pronunciation;
    public List<OwlDefinition> owlDefinitions;
    
    public OwlWordResponse(OwlWordModel owlWordModel) {
        this.word = owlWordModel.getWord();
        this.owlDefinitions = owlWordModel.getDefinitions();
        this.pronunciation = owlWordModel.getPronunciation();
    }
}
