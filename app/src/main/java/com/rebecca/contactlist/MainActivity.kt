package com.rebecca.contactlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rebecca.contactlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        displayContact()
    }
    fun displayContact(){
        val contact1=ContactData("","Rebecca","+256 754 597 478", "rebeccanakachwaaa@gmail.com")
        val contact2=ContactData("","Tracy","0773308641", "beckytracy440@gmail.com")
        val contact3=ContactData("","Becky","077330678", "beckytracy440@gmail.com")
        val contact4=ContactData("","Bridget","07575894038","bridget@gmail.com")
        val contact5=ContactData("","Josephine","0773308641","josephine@gmail.com")
        val contact6=ContactData("","Norah","0773308641","norah@gmail.com")
        val contact7=ContactData("","Eunice","0773308641","eunice@gmail.com")
        val contact8=ContactData("","Rose","0773308641","rose@gmail.com")
        val contact9=ContactData("","Rachel","0773308641","rachel0@gmail.com")
        val contact10=ContactData("","Milkah","0773308641","milkah@gmail.com")
        val contactList= listOf(contact1,contact2,contact3,contact4,contact5,contact6,contact7,contact8,contact9,contact10)
        val twtAdapter=ContactRvAdapter(contactList)
        binding.rvName.layoutManager= LinearLayoutManager(this)
        binding.rvName.adapter=twtAdapter

    }

    }
