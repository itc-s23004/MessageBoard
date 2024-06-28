package jp.ac.it_college.std.s23004.messageboard.infrastructurs.database.dao

import jp.ac.it_college.std.s23004.messageboard.domain.types.RoleType
import org.jetbrains.exposed.dao.id.LongIdTable

object UsersTable : LongIdTable("users") {
    val viewName = varchar("view_name", 32)
    val email = varchar("email", 256).uniqueIndex()
    val password = varchar("password", 128)
}