package com.elizia.av1_1821312095.model

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FilmeDAO {

    @Query("SELECT * FROM filme_table ORDER BY titulo_filme ASC")
    fun getFilmes(): List<Filme>

    @Insert
    fun insert(filme: Filme)

    @Query("DELETE FROM filme_table")
    fun deleteAll()
}
