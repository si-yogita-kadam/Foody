package com.example.foody.data.database

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.foody.models.FoodRecipe
import com.example.foody.util.Constants.Companion.RECIPES_TABLE

@Entity(tableName = RECIPES_TABLE)
data class RecipesEntity(

    @PrimaryKey(autoGenerate = false)
    val id: Int = 0,
    val results: FoodRecipe?
)