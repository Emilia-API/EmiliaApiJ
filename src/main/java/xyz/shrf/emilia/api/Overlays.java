package xyz.shrf.emilia.api;

import xyz.shrf.emilia.utils.RequestHandler;

public class Overlays {
    private static String BASE_URL = "https://emilia-api.glitch.me/api/";
    private static String token;

    public Overlays(String token) {
        Overlays.token = token;
    }

    /**
     * Draws an "approved" stamp over an image
     * @param image A URL to an image
     * @return The buffer contains the image data
     */
    public static byte[] getApproved(String image) {
        return RequestHandler.getBytes(BASE_URL + "approved?image=" + image, token);
    }

    /**
     * Draws an image over a halloween border
     * @param image A URL to an image
     * @return The buffer contains the image data
     */
    public static byte[] getHalloween(String image) {
        return RequestHandler.getBytes(BASE_URL + "halloween?image=" + image, token);
    }

    /**
     * Draws a "rejected" stamp over an image
     * @param image A URL to an image
     * @return The buffer contains the image data
     */
    public static byte[] getRejected(String image) {
        return RequestHandler.getBytes(BASE_URL + "rejected?image=" + image, token);
    }
}
