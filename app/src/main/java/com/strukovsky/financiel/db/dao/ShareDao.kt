package com.strukovsky.financiel.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.strukovsky.financiel.db.entity.Share

@Dao
interface ShareDao
{
    @Query("SELECT * FROM share")
    fun getAllShares(): List<Share>

    @Insert
    fun addShare(share: Share)
}