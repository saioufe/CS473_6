package com.example.cs473_6.adaptors


import android.content.Context
import android.widget.ArrayAdapter
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.ImageView
import com.example.cs473_6.R
import android.widget.TextView
import android.widget.Toast
import com.example.cs473_6.data.Items
import java.util.ArrayList

class CustomGridAdaptor(context: Context, resource: Int, objects: List<Items>) :
    ArrayAdapter<Items?>(context, resource, objects) {
    var items_list: List<Items> = ArrayList()
    var custom_layout_id: Int

    init {
        items_list = objects
        custom_layout_id = resource
    }

    override fun getCount(): Int {
        return items_list.size
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var v = convertView
        if (v == null) {
            // getting reference to the main layout and
            // initializing
            val inflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            v = inflater.inflate(custom_layout_id, null)
        }


        // initializing the imageview and textview and
        // setting data
        val imageView = v!!.findViewById<ImageView>(R.id.grid_image)
        val textView = v.findViewById<TextView>(R.id.grid_text)

        // get the item using the position param
        val item = items_list[position]
        imageView.setImageResource(item.image_id)
        textView.text = item.text
        v.setOnClickListener { Toast.makeText(context, item.text, Toast.LENGTH_SHORT).show() }
        return v
    }
}