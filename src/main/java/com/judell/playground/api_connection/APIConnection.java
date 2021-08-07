package com.judell.playground.api_connection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
//import org.json.JSONArray;
//import org.json.JSONObject;


/**
 * Uses spring restemplate to make api calls
 */
public class APIConnection {

    public static void main(String[] args) throws JsonProcessingException {
        get();
        post();
        put();
        delete();
    }

    /**
     * Does a get request
     * @throws JsonProcessingException
     */
    public static void get() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<Resp> response = restTemplate.getForEntity(APIConstants.GET_URL, Resp.class);
        ObjectMapper mapper = new ObjectMapper();

        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response.getBody().data);

        System.out.println(jsonResp);
    }

    //Todo: Implement this
    public static void post() {

    }

    //Todo: Implement this
    public static void put() {

    }

    //Todo: Implement this
    public static void delete() {

    }
}
