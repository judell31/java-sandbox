package com.judell.playground.word_dictionary;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class WordDictionary {

    public static void main(String[] args) throws JsonProcessingException {
        if (owlDictionary("hello") != 200) {
            System.out.println("wrong");
        }
//        freeDictionary("hello");
    }

    private static Integer owlDictionary(String word) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        ObjectMapper mapper = new ObjectMapper();
        HttpEntity<OwlWordModel> httpEntity = new HttpEntity<>(headers);

        headers.set("Authorization", "Token 51fd1edd0479b71faea8a096e460b5e687c4e9da");

        ResponseEntity<OwlWordModel> response = restTemplate.exchange(
                "https://owlbot.info/api/v4/dictionary/" + word,
                HttpMethod.GET,
                httpEntity,
                OwlWordModel.class
        );

        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(new OwlWordResponse(response.getBody()));
        System.out.println(response.getStatusCode());
        System.out.println(jsonResp);

        return response.getStatusCodeValue();
    }

//    private static void freeDictionary(String word) throws JsonProcessingException {
//        RestTemplate restTemplate = new RestTemplate();
//        ObjectMapper mapper = new ObjectMapper();
//
//        ResponseEntity<FreeWords> response = restTemplate.getForEntity("https://api.dictionaryapi.dev/api/v2/entries/en/" + word, FreeWords.class);
//
//        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(new FreeWordResponse(response.getBody().getWordModels()));
//        System.out.println(response.getStatusCode());
//        System.out.println(jsonResp);
//    }
}
