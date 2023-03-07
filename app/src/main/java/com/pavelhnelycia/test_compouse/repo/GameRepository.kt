package com.pavelhnelycia.test_compouse.repo


import com.pavelhnelycia.test_compouse.data.remote.GameService
import com.pavelhnelycia.test_compouse.domain.item.GameItem
import com.pavelhnelycia.test_compouse.domain.item.toGameItem
import javax.inject.Inject


/**
 * GameRepository class for fetching data.
 */
class GameRepository @Inject constructor(private val gameService: GameService) {

    /**
     * invoke asynchronously convert GameModel -> GameItem
     */
    suspend operator fun invoke(): List<GameItem> {

        return gameService.getGames().map {
            it.toGameItem()
        }
    }
}