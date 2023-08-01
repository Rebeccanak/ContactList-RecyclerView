package com.rebecca.contactlist.reponsitory

import com.rebecca.contactlist.ContactApp
import com.rebecca.contactlist.database.ContactDb
import com.rebecca.contactlist.models.ContactData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ContactsRepository {
    val database = ContactDb.getDatabase(ContactApp.appContext)

    suspend fun saveContact(contact: ContactData){
        withContext(Dispatchers.IO){
            database.contactDao().insertContact(contact)
        }

    }
}