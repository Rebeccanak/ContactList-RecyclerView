package com.rebecca.contactlist.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.rebecca.contactlist.ViewModel.ContactsViewModel
import com.rebecca.contactlist.models.ContactData
import com.rebecca.contactlist.databinding.ActivityMainBinding
import java.util.Locale

class MainActivity : AppCompatActivity() {
 private val contactsViewModel :ContactsViewModel by viewModels()
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
//        switchLang()
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
        binding.btnsave2.setOnClickListener {
            val intent = Intent(this, AddContacts::class.java)
            startActivity(intent)
        }
    }
//    override fun onResume() {
//        super.onResume()
//        displayContact()
//        binding.btnsave2.setOnClickListener {
//            val intent = Intent(this,AddContacts::class.java)
//            startActivity(intent)

//    override fun onResume() {
//        super.onResume()
//        displayContact()
//        binding.btnsave2.setOnClickListener { val intent
//
//    }
    fun displayContact(){
        val contact1= ContactData(0,"https://images.unsplash.com/photo-1656014570709-7437353f5907?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=465&q=80","Rebecca","+256 754 597 478", "rebeccanakachwaaa@gmail.com")
        val contact2= ContactData(0,"https://images.unsplash.com/photo-1507003211169-0a1dd7228f2d?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=1374&q=80","Tracy","0773308641", "beckytracy440@gmail.com")
        val contact3= ContactData(0,"https://images.unsplash.com/photo-1508214751196-bcfd4ca60f91?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTN8fHByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww&auto=format&fit=crop&w=400&q=60","Becky","077330678", "beckytracy440@gmail.com")
        val contact4= ContactData(0,"https://images.unsplash.com/photo-1488426862026-3ee34a7d66df?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTR8fHByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww&auto=format&fit=crop&w=400&q=60","Bridget","07575894038","bridget@gmail.com")
        val contact5= ContactData(0,"https://images.unsplash.com/photo-1524154217857-45f012d0f167?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzV8fHByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww&auto=format&fit=crop&w=400&q=60","Josephine","0773308641","josephine@gmail.com")
        val contact6= ContactData(0,"https://images.unsplash.com/photo-1605993439219-9d09d2020fa5?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mzd8fHByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww&auto=format&fit=crop&w=400&q=60","Norah","0773308641","norah@gmail.com")
        val contact7= ContactData(0,"https://images.unsplash.com/photo-1519456264917-42d0aa2e0625?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzZ8fHByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww&auto=format&fit=crop&w=400&q=60","Eunice","0773308641","eunice@gmail.com")
        val contact8= ContactData(0,"https://images.unsplash.com/photo-1519456264917-42d0aa2e0625?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MzZ8fHByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww&auto=format&fit=crop&w=400&q=60","Rose","0773308641","rose@gmail.com")
        val contact9= ContactData(0,"https://images.unsplash.com/photo-1639149888905-fb39731f2e6c?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8NDJ8fHByb2ZpbGUlMjBwaWN0dXJlfGVufDB8fDB8fHww&auto=format&fit=crop&w=700&q=60","Rachel","0773308641","rachel0@gmail.com")
        val contact10= ContactData(0,"https://images.unsplash.com/photo-1494790108377-be9c29b29330?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8fA%3D%3D&auto=format&fit=crop&w=387&q=80","Milkah","0773308641","milkah@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        val twtAdapter= ContactRvAdapter(contactList)
        binding.rvName.layoutManager= LinearLayoutManager(this)
        binding.rvName.adapter=twtAdapter

    }
//    fun switchLang(){
//        val config = resources.configuration
//        val long = "sw" // ypur lang
//        val locale = Locale
//    }

    }




