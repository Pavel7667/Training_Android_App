package com.pavelhnelycia.test_compouse.data.remote.model

/**
 * After getting JSON from @GET request
 * Used Kotlin data class File from JSON to convert request
 *
 * After converting leave only needed fields
 *
 * @property id
 * @property title
 * @property thumbnail
 * @property short_description
 */
data class GameModel(
    val id: Int,
    val title: String,
    val thumbnail: String,
    val short_description: String
    )