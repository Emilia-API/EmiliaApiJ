package com.sharif.emiliaapi;

import com.sharif.emiliaapi.api.Effects;
import com.sharif.emiliaapi.api.GIF;
import com.sharif.emiliaapi.api.Generators;
import com.sharif.emiliaapi.api.Overlays;
import com.sharif.emiliaapi.utils.Checks;

public class EmiliaApi {
  private static String token = null;
  public static Generators generators = null;
  public static GIF gif = null;
  public static Effects effects = null;
  public static Overlays overlays = null;

  /**
   * @param token Your Emilia API Token
   */
  public EmiliaApi(String token) {
    Checks.notNull(token, "token");
    EmiliaApi.token = token;
    EmiliaApi.generators = new Generators(EmiliaApi.token);
    EmiliaApi.effects = new Effects(token);
    EmiliaApi.overlays = new Overlays(token);
    EmiliaApi.gif = new GIF(token);
  }
}
