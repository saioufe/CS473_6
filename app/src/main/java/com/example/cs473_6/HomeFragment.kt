package com.example.cs473_6

import android.widget.GridView
import com.example.cs473_6.data.Items
import android.os.Bundle
import com.example.cs473_6.HomeFragment
import com.example.cs473_6.R
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.cs473_6.adaptors.CustomGridAdaptor
import com.google.android.material.bottomnavigation.BottomNavigationView
import java.util.ArrayList

/**
 * A simple [Fragment] subclass.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class HomeFragment : Fragment() {
    lateinit var gridView: GridView
    lateinit var bottomBar: BottomNavigationView
    var itemsList: MutableList<Items> = ArrayList()

    // TODO: Rename and change types of parameters
    private var mParam1: String? = null
    private var mParam2: String? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        itemsList.clear()
        itemsList.add(Items(R.drawable.ic_overview_foreground, "Overview"))
        itemsList.add(Items(R.drawable.ic_aboutme_foreground, "About Me"))
        itemsList.add(Items(R.drawable.ic_experience_foreground, "Experience"))
        itemsList.add(Items(R.drawable.ic_book_foreground, "Contact Info"))
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v2 = inflater.inflate(R.layout.activity_main,container,false)
        bottomBar = v2.findViewById(R.id.bottom_navigation_view)


        val v = inflater.inflate(R.layout.fragment_home, container, false)
        gridView = v.findViewById(R.id.main_grid_view)
        val customAdapter = CustomGridAdaptor(requireActivity(), R.layout.home_grid_element, itemsList , bottomBar)
        gridView.setAdapter(customAdapter)


        return v
    }

}