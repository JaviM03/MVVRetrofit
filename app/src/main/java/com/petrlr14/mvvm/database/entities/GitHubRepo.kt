package com.petrlr14.mvvm.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "repos")
data class GitHubRepo(
    @PrimaryKey
    @field:Json(name="id")
    val id: Long,
    
    val name: String,
    @field:Json(name="name")
    
    @ColumnInfo(name="full_name")
    @field:Json(name="full_name")
    val fullName:String
)
