package com.pavelhnelycia.test_compouse.data.remote


import com.pavelhnelycia.test_compouse.data.remote.model.GameModel
import com.pavelhnelycia.test_compouse.util.Constants.Companion.GAME_GET
import retrofit2.Response
import retrofit2.http.GET

/**
 * GameApi interface for http requests methods
 *
 * @constructor Create empty Game api
 */
interface GameApi {

  /**
   * http request for GAME_GET = "https://www.freetogame.com/api/" + "games"
   */
  @GET(GAME_GET)
    suspend fun getGames(
    ): Response<List<GameModel>>
}