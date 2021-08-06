package com.judell.playground.api_connection;

import com.sun.tools.javac.Main;
import org.json.JSONArray;
import org.json.JSONObject;
//import org.json.JSONArray;
//import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

//Todo: Add post put and delete
//Todo: fix json import
public class APIConnection {

    public static void main(String[] args){
        apiConnection("get-games");
    }

    public static void apiConnection(String httpRequest){
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(APIConstants.URL + httpRequest)).build();
        client.sendAsync(
                request, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)
//                .thenApply(APIConnection::parse).join();
                .thenAccept(System.out::println).join();
    }

    public static String parse(String resp){
        JSONArray gameNames = new JSONArray(resp);
        JSONObject gameName = gameNames.getJSONObject(0);
        String name = gameName.getString("gameName");
        System.out.println(name);
        return name;
    }
}
