package com.judell.playground.api_connection;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * Uses spring rest template to make api service calls
 */
public class APIConnection {

    public static void main(String[] args) throws JsonProcessingException {
        getOwlWordDefinition();
        post();
    }

    /**
     * Does a get request
     * @throws JsonProcessingException
     */
    public static void getUser(UserModel userModel) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        ResponseEntity<UserModel> response = restTemplate.getForEntity(APIConstants.GET_URL + userModel.getUserId(), UserModel.class);

        // TODO: Handle null response body

        ObjectMapper mapper = new ObjectMapper();

        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response.getBody());

        System.out.println("Get---------------------");
        System.out.println(jsonResp);

        updateUser(response.getBody());
    }

    public static void getOwlWordDefinition() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();

        HttpHeaders httpHeaders = new HttpHeaders();

        httpHeaders.add(APIConstants.AUTH_HEADER, APIConstants.OWL_TOKEN);

        HttpEntity<String> httpEntity = new HttpEntity<>("auth", httpHeaders);

        ResponseEntity<WordDefinitionModel> response = restTemplate.exchange(APIConstants.OWL_URL + "word", HttpMethod.GET, httpEntity, WordDefinitionModel.class);
        ObjectMapper mapper = new ObjectMapper();

        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response.getBody());

        System.out.println("Get---------------------");
        System.out.println(jsonResp);
    }

    /**
     * Makes a post request
     * @throws JsonProcessingException
     */
    public static void addUser() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        UserModel userModel = new UserModel();
        ObjectMapper mapper = new ObjectMapper();

        userModel.setFirstName("jay");
        userModel.setLastName("james");
        userModel.setEmail("jj@gmail.com");
        userModel.setDescription("test");

        ResponseEntity<UserModel> respResponseEntity = restTemplate.postForEntity(APIConstants.POST_URL, userModel, UserModel.class);
        String jsonResp = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(respResponseEntity.getBody());

        System.out.println("\nPost---------------------");
        System.out.println(jsonResp);

        getUser(respResponseEntity.getBody());
    }

    public static void updateUser(UserModel userModel) throws JsonProcessingException {
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

        deleteUser(response.getBody());
    }

    public static void deleteUser(UserModel userModel) {
        RestTemplate restTemplate = new RestTemplate();

        restTemplate.delete(APIConstants.DELETE_URL + userModel.getUserId());

        System.out.println("\nDelete---------------------");
        System.out.println("User Deleted!");
    }
}
