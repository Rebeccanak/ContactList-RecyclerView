package com.rebecca.contactlist.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rebecca.contactlist.models.ContactData
import com.rebecca.contactlist.databinding.ContactListItemBinding
import com.squareup.picasso.Picasso
import jp.wasabeef.picasso.transformations.CropCircleTransformation


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
        Picasso
            .get()
            .load(currentContact.avatar)
            .resize(80,80)
            .centerCrop()
//            .placeholder(R.drawable.avatar)
            .transform(CropCircleTransformation())
            .into(binding.imageView

            )


//        Picasso
//            .get()
//            .load(currentContact.avatar)
//            .resize(80,80)
//            .centerInside()
//            .transform(CropCircleTransformation())
//            .into(binding.imageView)




    }

}
class ContactViewHolder( var binding:ContactListItemBinding): RecyclerView.ViewHolder(binding.root)