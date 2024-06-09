package com.example.jomdining.databaseentities

import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.ProvidedTypeConverter
import androidx.room.TypeConverter
import androidx.room.TypeConverters
import kotlinx.serialization.Serializable
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

@Serializable
@Entity(
    tableName = "menu"
)
@TypeConverters(
//    AccountConverter::class,
//    MenuConverter::class,
//    MenuItemIngredientConverter::class,
//    OrderItemConverter::class,
//    StockConverter::class,
//    TransactionsConverter::class
)
data class Menu(
    @PrimaryKey(autoGenerate = true)
    val menuItemID: Int,
    val menuItemName: String,
    val menuItemPrice: Double,
    val menuItemType: String,
    val menuItemImagePath: String
)

@ProvidedTypeConverter
class MenuConverter {
    // Convert String to Menu
    @TypeConverter
    fun stringToMenu(menuJson: String?): Menu? {
        return menuJson?.let {
            Json.decodeFromString(it)
        }
    }

    // Convert Menu to String
    @TypeConverter
    fun menuToString(menu: Menu?): String {
        return Json.encodeToString(menu)
    }
}