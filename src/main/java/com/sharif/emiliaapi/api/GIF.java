package com.sharif.emiliaapi.api;

import com.sharif.emiliaapi.utils.RequestHandler;

import java.util.Base64;

public class GIF {
    private static String BASE_URL = "https://emilia-api.glitch.me/api/";
    private static String token;

    public GIF(String token) {
        GIF.token = token;
    }

    /**
     * Get random amazed images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getAmazed() {
        return RequestHandler.getBytes(BASE_URL + "amazed", token);
    }

    /**
     * Get random bite images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getBite() {
        return RequestHandler.getBytes(BASE_URL + "bite", token);
    }

    /**
     * Get random blush images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getBlush() {
        return RequestHandler.getBytes(BASE_URL + "blush", token);
    }

    /**
     * Get random boop images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getBoop() {
        return RequestHandler.getBytes(BASE_URL + "boop", token);
    }

    /**
     * Get random cheering images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getCheer() {
        return RequestHandler.getBytes(BASE_URL + "cheer", token);
    }

    /**
     * Get random clapping images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getClap() {
        return RequestHandler.getBytes(BASE_URL + "clap", token);
    }

    /**
     * Get random confused images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getConfused() {
        return RequestHandler.getBytes(BASE_URL + "confused", token);
    }

    /**
     * Get random crying images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getCry() {
        return RequestHandler.getBytes(BASE_URL + "cry", token);
    }

    /**
     * Get random cuddle images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getCuddle() {
        return RequestHandler.getBytes(BASE_URL + "cuddle", token);
    }

    /**
     * Get random dancing images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getDance() {
        return RequestHandler.getBytes(BASE_URL + "dance", token);
    }

    /**
     * Get random feeding images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getFeed() {
        return RequestHandler.getBytes(BASE_URL + "feed", token);
    }

    /**
     * Get random happy images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getHappy() {
        return RequestHandler.getBytes(BASE_URL + "happy", token);
    }

    /**
     * Get random hold images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getHold() {
        return RequestHandler.getBytes(BASE_URL + "hold", token);
    }

    /**
     * Get random hug images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getHug() {
        return RequestHandler.getBytes(BASE_URL + "hug", token);
    }

    /**
     * Get random kissing images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getKiss() {
        return RequestHandler.getBytes(BASE_URL + "kiss", token);
    }

    /**
     * Get random laughing images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getLaugh() {
        return RequestHandler.getBytes(BASE_URL + "laugh", token);
    }

    /**
     * Get random lewd images - NSFW? NO!
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getLewd() {
        return RequestHandler.getBytes(BASE_URL + "lewd", token);
    }

    /**
     * Get random licking images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getLick() {
        return RequestHandler.getBytes(BASE_URL + "lick", token);
    }

    /**
     * Get random nom images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getNom() {
        return RequestHandler.getBytes(BASE_URL + "nom", token);
    }

    /**
     * Get random pat images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getPat() {
        return RequestHandler.getBytes(BASE_URL + "pat", token);
    }

    /**
     * Get random poke images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getPoke() {
        return RequestHandler.getBytes(BASE_URL + "poke", token);
    }

    /**
     * Get random pout images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getPout() {
        return RequestHandler.getBytes(BASE_URL + "pout", token);
    }

    /**
     * Get random punch images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getPunch() {
        return RequestHandler.getBytes(BASE_URL + "punch", token);
    }

    /**
     * Get random running images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getRun() {
        return RequestHandler.getBytes(BASE_URL + "run", token);
    }

    /**
     * Get random scared images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getScared() {
        return RequestHandler.getBytes(BASE_URL + "scared", token);
    }

    /**
     * Get random shocked images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getShocked() {
        return RequestHandler.getBytes(BASE_URL + "shocked", token);
    }

    /**
     * Get random shout images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getShout() {
        return RequestHandler.getBytes(BASE_URL + "shout", token);
    }

    /**
     * Get random slapping images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getSlap() {
        return RequestHandler.getBytes(BASE_URL + "slap", token);
    }

    /**
     * Get random smile images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getSmile() {
        return RequestHandler.getBytes(BASE_URL + "smile", token);
    }

    /**
     * Get random smug images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getSmug() {
        return RequestHandler.getBytes(BASE_URL + "smug", token);
    }

    /**
     * Get random stare images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getStare() {
        return RequestHandler.getBytes(BASE_URL + "stare", token);
    }

    /**
     * Get random surprised images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getSurprised() {
        return RequestHandler.getBytes(BASE_URL + "surprised", token);
    }

    /**
     * Get random thumbsup images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getThumbsUp() {
        return RequestHandler.getBytes(BASE_URL + "thumbsup", token);
    }

    /**
     * Get random tickle images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getTickle() {
        return RequestHandler.getBytes(BASE_URL + "tickle", token);
    }

    /**
     * Get random wave images
     * @return A buffer-byte contains the image data.
     */
    public static byte[] getWave() {
        return RequestHandler.getBytes(BASE_URL + "wave", token);
    }
}
