package com.judell.playground.api_connection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.time.Instant;
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

        System.out.println("Get---------------------");
        System.out.println(jsonResp);
    }

    /**
     * Makes a post request
     * @throws JsonProcessingException
     */
    public static void post() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        UserModel userModel = new UserModel();
        ObjectMapper mapper = new ObjectMapper();

        userModel.setFirstName("jay");
        userModel.setLastName("james");
        userModel.setInitials("jj");
        userModel.setEmail("j@gmail.com");
        userModel.setActive(true);
        userModel.setAccountType("learner");
        userModel.setVerified(false);
        userModel.setAcctCreatedAt(Instant.now());
        userModel.setClosedAt(null);
        userModel.setPassword("Test123!");

        ResponseEntity<Resp> respResponseEntity = restTemplate.postForEntity(APIConstants.POST_URL, userModel, Resp.class);
        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(respResponseEntity.getBody().data);

        System.out.println("\nPost---------------------");
        System.out.println(jsonResp);
    }

    //Todo: Implement this
    public static void put() {
        System.out.println("\nPut---------------------");
    }

    //Todo: Implement this
    public static void delete() {
        System.out.println("\nDelete---------------------");
    }
}
