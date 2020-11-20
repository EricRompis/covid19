package com.project.COVID19.ui.Tips

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.project.COVID19.R


class Tips : Fragment() {

    companion object {
        fun newInstance() = Tips()
    }



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val root = inflater.inflate(R.layout.tips, container, false)
        (activity as AppCompatActivity).supportActionBar?.setTitle(R.string.menu_tips)

        return root
    }



}