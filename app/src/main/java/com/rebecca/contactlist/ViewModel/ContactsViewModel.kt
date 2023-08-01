package com.rebecca.contactlist.ViewModel

import android.provider.ContactsContract.Contacts
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rebecca.contactlist.models.ContactData
import com.rebecca.contactlist.reponsitory.ContactsRepository
import kotlinx.coroutines.launch

class ContactsViewModel : ViewModel() {
    val contactsRepository = ContactsRepository()

    fun saveContact(contact: ContactData){
        viewModelScope.launch {
            contactsRepository.saveContact(contact)
        }
    }

}
