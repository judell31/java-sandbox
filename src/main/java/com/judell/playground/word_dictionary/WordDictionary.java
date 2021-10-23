package com.judell.playground.word_dictionary;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

public class WordDictionary {

    public static void main(String[] args) throws JsonProcessingException {
        owlDictionary("potato");
        owlDictionary("ham");
        owlDictionary("garfunkle");
//        freeDictionary("hello");
    }

    private static void owlDictionary(String word) {
        String previousWord = "hush";

        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        HttpEntity<OwlWordModel> httpEntity = new HttpEntity<>(headers);

        headers.set("Authorization", "Token 51fd1edd0479b71faea8a096e460b5e687c4e9da");

        String lastCharPrevWord = previousWord.substring(previousWord.length() - 1);
        String firstLetterCurrentWord = String.valueOf(word.charAt(0));

        try {
            ResponseEntity<OwlWordModel> response = restTemplate.exchange(
                    "https://owlbot.info/api/v4/dictionary/" + word,
                    HttpMethod.GET,
                    httpEntity,
                    OwlWordModel.class
            );

            if (lastCharPrevWord.equalsIgnoreCase(firstLetterCurrentWord) && word.equalsIgnoreCase(response.getBody().getWord())) {
                System.out.println(word + " is a Correct");
            } else {
                System.out.println(word + " does not begin with" + " " + lastCharPrevWord);
            }
        } catch (HttpClientErrorException httpClientErrorException) {
            System.out.println("The word you are looking for does not exist or your spelling is wrong: " + word);
        }
    }
}
