package com.example.jetpacknavigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController


class FragmentA : Fragment() {
                            //add gradle flie

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view= inflater.inflate(R.layout.fragment_a, container, false)


        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val navController= activity?.let { Navigation.findNavController(it,R.id.fragmentContainerView) }
        val button:Button=view.findViewById(R.id.btn_send)
        val etText:EditText=view.findViewById(R.id.et_text)

        button.setOnClickListener {
//            navController?.navigate(R.id.action_fragmentA_to_fragmentB)
            val message = etText.text.toString()
            val action=FragmentADirections.actionFragmentAToFragmentB(message)
            Navigation.findNavController(view).navigate(action)


        }
    }

}


