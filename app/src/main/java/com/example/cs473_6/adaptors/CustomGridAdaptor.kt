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
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.ArrayList

class CustomGridAdaptor(context: Context, resource: Int, objects: List<Items> , bottomNavigationView: BottomNavigationView) :
    ArrayAdapter<Items?>(context, resource, objects)  {


    var items_list: List<Items> = ArrayList()
    var custom_layout_id: Int
    var bottomNavigation : BottomNavigationView

    init {
        items_list = objects
        custom_layout_id = resource
        bottomNavigation = bottomNavigationView

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
        //var bottomNavigationView = v.findViewById<BottomNavigationView>(R.id.bottom_navigation_view)
        v.setOnClickListener {

            when(item.text){
                "Overview" -> {
                    bottomNavigation.menu.getItem(0).setChecked(false)
                    bottomNavigation.menu.getItem(1).isChecked = true
                    Toast.makeText(context, bottomNavigation.menu.getItem(1).isCheckable.toString(), Toast.LENGTH_SHORT).show()
                }
                "About Me" -> {
                    bottomNavigation.menu.getItem(2).setChecked(true)
                    Toast.makeText(context, item.text, Toast.LENGTH_SHORT).show()
                }

                "Experience" ->
                {
                    bottomNavigation.menu.getItem(3).setChecked(true)
                    Toast.makeText(context, item.text, Toast.LENGTH_SHORT).show()
                }
                "Contact Info" -> {
                    bottomNavigation.menu.getItem(4).setChecked(true)
                    Toast.makeText(context, item.text, Toast.LENGTH_SHORT).show()
                }
            }
        }





        return v
    }
}