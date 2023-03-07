package com.pavelhnelycia.test_compouse.data.remote

import com.pavelhnelycia.test_compouse.data.remote.model.GameModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

/**
 * GameService created for avoid blocking the main thread and causing the app to become unresponsive.
 * And use suspend functions to get a responses from the network.
 *
 * @property gameApi
 */
class GameService @Inject constructor(private val gameApi: GameApi) {

    /**
     * invoke suspend method for avoiding  blocking the main thread and getting
     * a @GET response from network
     *
     * @return  List of GameModel objects returned by the API
     */
    suspend fun getGames(): List<GameModel> {

        return withContext(Dispatchers.IO) {
            val games = gameApi.getGames()
            games.body() ?: emptyList()
        }
    }
}