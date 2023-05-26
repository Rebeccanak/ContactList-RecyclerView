package com.rebecca.contactlist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rebecca.contactlist.databinding.ContactListItemBinding

class ContactRvAdapter(var contactlist:List<ContactData>) :RecyclerView.Adapter<ContactViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactViewHolder {
        val binding =
            ContactListItemBinding.inflate(LayoutInflater.from(parent.context),parent ,false)
        return ContactViewHolder(binding)
    }

    override fun getItemCount(): Int {
       return contactlist.size
    }

    override fun onBindViewHolder(holder: ContactViewHolder, position: Int) {
        var currentContact =contactlist.get(position)
        var  binding=holder.binding
        binding.tvName.text=currentContact.name
        binding.tvPhoneNumber.text=currentContact.phoneNumber
        binding.tvEmailAddress.text =currentContact.emailAddress



    }
}
class ContactViewHolder( var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root)