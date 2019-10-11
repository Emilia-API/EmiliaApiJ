package com.sharif.emiliaapi;

import com.sharif.emiliaapi.utils.Checks;
import com.sharif.emiliaapi.utils.RequestHandler;

public class EmiliaApi {
  
  private static String BASE_URL = "https://emilia-api.glitch.me/api/";
  private static String token;
  
  public EmiliaApi(String token) {
    Checks.notNull(token, "token");
    this.token = token;
  }
  
  public static byte[] getBlush() {
    return RequestHandler.getBytes(BASE_URL + "blush", token);
  }
  
}