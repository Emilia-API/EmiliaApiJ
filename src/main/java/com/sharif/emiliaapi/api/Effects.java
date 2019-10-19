package com.sharif.emiliaapi.api;

import com.sharif.emiliaapi.utils.RequestHandler;
import org.jetbrains.annotations.Nullable;

public class Effects {
    private static String BASE_URL = "https://emilia-api.glitch.me/api/";
    private static String token;

    public Effects(String token) {
        Effects.token = token;
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
