package com.pavelhnelycia.test_compouse.util

/**
 * Constants that contains address reference constants for URLs
 */
class Constants {

    companion object {

        /*
        Tried different ways to reach:
        https://www.reddit.com/top/
        Successfully got this url using POSTMAN @GET request with API KEY
        But I didn't succeed using Retrofit2 in SDK

        Got an API_KEY on Reddit.
        tried to write it in a @GET request with @Headers("Authorization: API_KEY");
        tried to write a request with parameters:
            t     ==  one of (hour, day, week, month, year, all);
            limit ==  the maximum number of items desired (default: 25, maximum: 100);
        tried to change the base URL;
        tried write @GET request without API_KEY;

        I decided to use a different address (game description site).
        */

        const val BASE_URL = "https://www.freetogame.com/api/"
        const val GAME_GET = "games"

//        const val API_KEY = "sMRxXkJTlpfIAb7jDY8AZg"
//        const val BASE_URL = "https://www.reddit.com/"
//        const val GAME_GET = "top.json"
    }
}