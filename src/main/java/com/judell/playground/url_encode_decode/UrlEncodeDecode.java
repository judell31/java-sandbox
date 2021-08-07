package com.judell.playground.url_encode_decode;

import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

/**
 * Encodes and decodes a url
 */
public class UrlEncodeDecode {

    public static void main(String[] args) throws Exception{
        String crunchifyValue1 = "This is a simple Example from Crunchify";

        // Use StandardCharsets
        String ecodedValue1 = URLEncoder.encode(crunchifyValue1, StandardCharsets.UTF_8.name());
        String decodedValue1 = URLDecoder.decode(ecodedValue1, StandardCharsets.UTF_8.name());
        System.out.println("crunchifyValue1 after encoding => " + ecodedValue1);
        System.out.println("crunchifyValue1 after decoding (Original Value): => " + decodedValue1);

        String crunchifyValue2 = "Hello There, We started accepting Guest-Posts on Crunchify...";

        // Or directly provide UTF-8
        String encodedValue2 = URLEncoder.encode(crunchifyValue2, "UTF-8");
        String decodedValue2 = URLDecoder.decode(encodedValue2, "UTF-8");
        System.out.println("\ncrunchifyValue2 after encoding => " + encodedValue2);
        System.out.println("crunchifyValue2 after decoding (Original Value) => " + decodedValue2);
    }
}
