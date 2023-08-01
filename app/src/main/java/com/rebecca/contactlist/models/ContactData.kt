package com.rebecca.contactlist.models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Contacts")
data class ContactData(
    @PrimaryKey(autoGenerate = true) var contactId:  Int,
    var avatar:String,
    var name:String,
    var phoneNumber:String,
    var emailAddress:String

)
