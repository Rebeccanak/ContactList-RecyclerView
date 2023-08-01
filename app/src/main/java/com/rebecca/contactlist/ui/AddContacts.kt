package com.rebecca.contactlist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.rebecca.contactlist.R
import com.rebecca.contactlist.ViewModel.ContactsViewModel
import com.rebecca.contactlist.databinding.ActivityAddContactsBinding
import com.rebecca.contactlist.models.ContactData

class AddContacts : AppCompatActivity() {
    private val  contactsViewModel:  ContactsViewModel by viewModels()

    lateinit var binding: ActivityAddContactsBinding
//    val  contactsView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAddContactsBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnsave.setOnClickListener {
            validateAddContact()

        }
    }
    fun validateAddContact() {
        val name = binding.etFirstName.text.toString()
        val name2 = binding.etLastName.text.toString()
        val phoneNumber = binding.etPhoneNumber.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false
        if (name.isEmpty()) {
            binding.tilFirstName.error = getString(R.string.first_name_required)
            error = true
        }
        if (name2.isEmpty()) {
            binding.tilLastName.error = getString(R.string.last_name_required)
            error = true
        }
        if (email.isEmpty()) {
            binding.tilEmail.error = getString(R.string.password_required)
            error = true
        }
        if (phoneNumber.isEmpty()) {
            binding.tilPhoneNumber.error = getString(R.string.phone_number_required)
            error = true
        }


        if(!error){
            val newContact = ContactData(0, name,name2,email, phoneNumber )
            contactsViewModel.saveContact(newContact)
            Toast.makeText(this,"contact saved", Toast.LENGTH_LONG).show()
            finish()
        }

    }

    }

//        if(!error){
//            val newContact = ContactRvAdapter(0, name, name2,email,phoneNumber)
//            contactsViewModel.saveContact(newContact)
////
////        }
//
//        if (!error) {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//        Toast.makeText(this, "Contact added successfully", Toast.LENGTH_SHORT).show();
//        finish();
//    }
//}