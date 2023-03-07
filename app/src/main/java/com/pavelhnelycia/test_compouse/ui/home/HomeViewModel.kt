package com.pavelhnelycia.test_compouse.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.pavelhnelycia.test_compouse.domain.item.GameItem
import com.pavelhnelycia.test_compouse.repo.GameRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 * The ViewModel uses a repository pattern to fetch data asynchronously and exposes it as
 * a StateFlow for use in the Composable functions.
 *
 * @property getGameRepository
 */
@HiltViewModel
class HomeViewModel @Inject constructor(private val getGameRepository: GameRepository) :
    ViewModel() {

    private val _games = MutableStateFlow(emptyList<GameItem>())
    val games: StateFlow<List<GameItem>> get() = _games

    // In the init block, the getGames() function is called
    // to retrieve the games data from the GameRepository.
    init {
        getGames()
    }

    /**
     * The getGames() function is a private function that launches a coroutine using viewModelScope
     * and retrieves the games data from the GameRepository.
     */
    private fun getGames() {
        viewModelScope.launch {
            try {
                val games = getGameRepository()
                _games.value = games
            } catch (_: Exception) {
            }
        }
    }
}