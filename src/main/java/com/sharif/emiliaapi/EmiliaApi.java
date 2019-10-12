package com.sharif.emiliaapi;

import com.sharif.emiliaapi.utils.Checks;
import com.sharif.emiliaapi.utils.RequestHandler;
import org.jetbrains.annotations.Nullable;

public class EmiliaApi {
  
  private static String BASE_URL = "https://emilia-api.glitch.me/api/";
  private static String token;
  
  public EmiliaApi(String token) {
    Checks.notNull(token, "token");
    this.token = token;
  }

  /**
   * Draws an image over Pokémon's "It's been 3000 years" meme
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getPokemonn300Years(String image) {
    return RequestHandler.getBytes(BASE_URL + "3000-years?image=" + image, token);
  }

  /**
   * Sends a Minecraft achievement with the text of your choice
   * @param image A URL to an image
   * @param text - The text for the resulting achievement image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getAchievement(String image, String text) {
    return RequestHandler.getBytes(BASE_URL + "achievement?image=" + image + "&text=" + text, token);
  }

  /**
   * A batman slapping meme
   * @param slapper A URL to an image
   * @param slapped A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getBatSlap(String slapper, String slapped) {
    return RequestHandler.getBytes(BASE_URL + "batslap?slapper=" + slapper + "&slapped=" + slapped, token);
  }

  /**
   * Draws a user's avatar over Gravity Falls "Oh, this? This is beautiful." meme
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getBeautiful(String image) {
    return RequestHandler.getBytes(BASE_URL + "beautiful?image=" + image, token);
  }

  /**
   * Draws an image with the Brazzers logo in the corner
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getBrazzers(String image) {
    return RequestHandler.getBytes(BASE_URL + "brazzers?image=" + image, token);
  }

  /**
   * Draws an image over Super Smash Bros "Challenger Approaching" screen
   * @param image A URL to an image
   * @param silhouetted Whether the image is should be silhouetted
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getChallenger(String image, @Nullable Boolean silhouetted) {
    if (silhouetted == null) silhouetted = false;
    return RequestHandler.getBytes(BASE_URL + "challenger?image=" + image + "&silhouetted=" + silhouetted, token);
  }

  /**
   * Draws an image and the text you specify as a demotivational poster
   * @param title The title for the poster
   * @param text The poster description
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getDemotivational(String title, String text, String image) {
    return RequestHandler.getBytes(BASE_URL + "demotivational?image=" + image + "&title=" + title + "&text=" + text, token);
  }

  /**
   * Draws baseImage over overlayImage
   * @param baseImage A URL to an image
   * @param overlayImage A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getFusion(String baseImage, String overlayImage) {
    return RequestHandler.getBytes(BASE_URL + "fusion?baseImage=" + baseImage + "&overlayImage=" + overlayImage, token);
  }

  /**
   * Draws "Thug Life" over an image
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getThugLife(String image) {
    return RequestHandler.getBytes(BASE_URL + "thug-life?image=" + image, token);
  }

  /**
   * Draws an image with the "To Be Continued..." arrow
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getToBeContinued(String image) {
    return RequestHandler.getBytes(BASE_URL + "to-be-continued?image=" + image, token);
  }

  /**
   * Draws an image over a wanted poster
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getWanted(String image) {
    return RequestHandler.getBytes(BASE_URL + "wanted?image=" + image, token);
  }

  /**
   * Draws an image over Gravity Falls "Oh, this? This is worthless." meme
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getWorthless(String image) {
    return RequestHandler.getBytes(BASE_URL + "worthless?image=" + image, token);
  }

  /**
   * Draws an image with the "TRIGGERED" gif
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getTriggered(String image) {
    return RequestHandler.getBytes(BASE_URL + "triggered?image=" + image, token);
  }

  /**
   * Draws an image but distorted
   * @param image A URL to an image
   * @param level The level of distorted
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getDistort(String image, @Nullable Integer level) {
    if (level == null) level = 1;
    return RequestHandler.getBytes(BASE_URL + "distort?image=" + image + "&level=" + level, token);
  }

  /**
   * Draws a fiery border over an image
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getFire(String image) {
    return RequestHandler.getBytes(BASE_URL + "fire?image=" + image, token);
  }

  /**
   * Draws a image with sepia effect
   * @param image A URL to an image
   * @return A buffer-byte contains the image data.
   */
  public static byte[] getSepia(String image) {
    return RequestHandler.getBytes(BASE_URL + "sepia?image=" + image, token);
  }
}
