package com.rebecca.contactlist.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import com.rebecca.contactlist.models.ContactData

@Dao

interface ContactDao {
   @Insert(onConflict= OnConflictStrategy.REPLACE)
   fun insertContact(contact: ContactData)
}