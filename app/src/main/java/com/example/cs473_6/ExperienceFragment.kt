package com.example.cs473_6

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cs473_6.adaptors.ExperienceAdaptor
import com.example.cs473_6.data.Job
import java.util.ArrayList

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ExperienceFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ExperienceFragment : Fragment() {
    var experiences: ArrayList<Job>? = null
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        experiences = Job.createExperienceList()
        Log.d("saioufe", "num of items in onCreate() : " + experiences!!.size)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val v = inflater.inflate(R.layout.fragment_experience, container, false)
        // Lookup the recyclerview in activity layout
        val rvExperience = v.findViewById<View>(R.id.experience_recycler) as RecyclerView

        // Create adapter passing in the sample user data
        val adapter = ExperienceAdaptor(experiences!!)
        // Attach the adapter to the recyclerview to populate items
        rvExperience.adapter = adapter
        // Set layout manager to position the items
        rvExperience.layoutManager = LinearLayoutManager(container!!.context)
        // That's all!
        Log.d("saioufe", "num of items in onCreateView() : " + experiences!!.size)
        // Inflate the layout for this fragment
        return v

    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment ExperienceFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            ExperienceFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}