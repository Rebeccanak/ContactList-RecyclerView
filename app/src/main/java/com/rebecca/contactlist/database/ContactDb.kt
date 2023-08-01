package com.rebecca.contactlist.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.rebecca.contactlist.models.ContactData
import org.jetbrains.annotations.Contract

@Database(entities = [ContactData::class],version = 1)
abstract class ContactDb: RoomDatabase() {
    abstract fun contactDao(): ContactDao

    companion object{
        private var database: ContactDb? = null

        fun getDatabase(context: Context): ContactDb{
            if (database==null){
                database = Room
                    .databaseBuilder(context ,ContactDb::class.java, "ContactsDB")
                    .fallbackToDestructiveMigration()
                    .build()

            }
            return database as ContactDb
        }

    }

}

