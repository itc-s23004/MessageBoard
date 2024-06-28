package jp.ac.it_college.std.s23004.messageboard.domain.model

import kotlinx.datetime.LocalDateTime

data class Threads(
    val id: Long,
    val title: String,
    val userId: Long,
    val createdAt: LocalDateTime,
    val updatedAt: LocalDateTime,
    val delete: Boolean
)