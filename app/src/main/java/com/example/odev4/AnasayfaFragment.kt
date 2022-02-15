package com.example.odev4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.odev4.databinding.FragmentAnasayfaBinding


class AnasayfaFragment : Fragment() {

    private lateinit var tasarim : FragmentAnasayfaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.aGit.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sayfaAyaGecis)

        }

        tasarim.xGit.setOnClickListener {

            Navigation.findNavController(it).navigate(R.id.sayfaXeGecis)

        }

        return tasarim.root
    }

}