package com.sharif.emiliaapi.utils;

import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class RequestHandler {

    public static byte[] getBytes(String url, String token) {
        Checks.notNull(url, "url");
        Checks.notNull(url, "token");
        HttpResponse<byte[]> response = Unirest.get(url).header("Authorization", "Bearer " + token).asBytes();
        return response.getBody();
    }
}
