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
        post();
        get();
        put();
        delete();
    }

    /**
     * Does a get request
     * @throws JsonProcessingException
     */
    public static void get() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<UserModel> response = restTemplate.getForEntity(APIConstants.GET_USER_URL, UserModel.class);
        ObjectMapper mapper = new ObjectMapper();

        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response.getBody());

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
        userModel.setDescription("test");

        ResponseEntity<UserModel> respResponseEntity = restTemplate.postForEntity(APIConstants.POST_URL, userModel, UserModel.class);
        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(respResponseEntity.getBody());

        System.out.println("\nPost---------------------");
        System.out.println(jsonResp);
    }

    //Todo: Implement this
    public static void put() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        UserModel userModel = new UserModel();
        ObjectMapper mapper = new ObjectMapper();

        userModel.setDescription("update");
        userModel.setFirstName("update");
        userModel.setLastName("update");

        restTemplate.put(APIConstants.PUT_URL, userModel, UserModel.class);
//        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(respResponseEntity.getBody());

        System.out.println("\nPut---------------------");
        System.out.println("user updated");
    }

    //Todo: Implement this
    public static void delete() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.delete(APIConstants.DELETE_USER_URL);

        System.out.println("\nDelete---------------------");
        System.out.println("User Deleted!");
    }
}
