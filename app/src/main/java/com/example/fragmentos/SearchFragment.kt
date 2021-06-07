package com.example.fragmentos

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.fragmentos.databinding.FragmentSearchBinding
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.ckeck_toast.*


class SearchFragment : Fragment() {

    private var _binding: FragmentSearchBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSearchBinding.inflate(inflater,container,false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (activity as MainActivity).bottom_navigation.menu.getItem(0).isChecked = true  //setea true para activar el icono del bottom nav vie
        binding.button2.setOnClickListener(View.OnClickListener {
            val customLayout = layoutInflater.inflate(R.layout.ckeck_toast, ckecktlayout)
            val toast = Toast(view?.context)
            toast.duration = Toast.LENGTH_LONG
            toast.view = customLayout
            toast.show()
        })



    }

}