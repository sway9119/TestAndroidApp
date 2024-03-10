package com.example.testandroidapp// com.example.testandroidapp.SampleFragment.kt

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testandroidapp.view.controller.SampleController

class SampleFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_sample, container, false)
        recyclerView = view.findViewById(R.id.recycler_view)
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // RecyclerViewの設定
        val controller = SampleController()
        val data = listOf("test1", "test2", "test3", "test4") // データを設定
        controller.setData(data)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = controller.adapter
    }
}
