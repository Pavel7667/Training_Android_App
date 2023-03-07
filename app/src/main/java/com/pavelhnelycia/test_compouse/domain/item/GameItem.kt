package com.pavelhnelycia.test_compouse.domain.item

import com.pavelhnelycia.test_compouse.data.remote.model.GameModel

/**
 * GameItem class takes information from the Model
 * for future use in the View
 *
 * @property id
 * @property title
 * @property thumbnail
 * @property short_description
 */
data class GameItem(

    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String
    )

fun GameModel.toGameItem() = GameItem(id,title,thumbnail,short_description)