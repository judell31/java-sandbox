package com.judell.playground.api_connection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Uses spring rest template to make api calls
 */
public class APIConnection {

    public static void main(String[] args) throws JsonProcessingException {
        post();
    }

    /**
     * Does a get request
     * @throws JsonProcessingException
     */
    public static void get(UserModel userModel) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<UserModel> response = restTemplate.getForEntity(APIConstants.GET_URL + userModel.getUserId(), UserModel.class);
        ObjectMapper mapper = new ObjectMapper();

        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response.getBody());

        System.out.println("Get---------------------");
        System.out.println(jsonResp);

        put(response.getBody());
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

        get(respResponseEntity.getBody());
    }

    public static void put(UserModel userModel) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        ObjectMapper mapper = new ObjectMapper();

        userModel.setDescription("updates");
        userModel.setFirstName("update");
        userModel.setLastName("update");

        restTemplate.put(APIConstants.PUT_URL + userModel.getUserId(), userModel);

        ResponseEntity<UserModel> response = restTemplate.getForEntity(APIConstants.GET_URL + userModel.getUserId(), UserModel.class);
        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response.getBody());

        System.out.println("\nPut---------------------");
        System.out.println(jsonResp);

        delete(response.getBody());
    }

    public static void delete(UserModel userModel) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.delete(APIConstants.DELETE_URL + userModel.getUserId());

        System.out.println("\nDelete---------------------");
        System.out.println("User Deleted!");
    }
}
