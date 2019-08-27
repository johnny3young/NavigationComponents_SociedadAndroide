package com.black3.app.navigationcomponents_sociedadandroide


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_a.*

/**
 * A simple [Fragment] subclass.
 */
class FragmentA : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_navigation_a_next.setOnClickListener{
            findNavController().navigate(R.id.action_fragmentA_to_fragmentB)
            //Tmb sirve la siguiente linea
            //btn_navigation_b_next.setOnClickListener(Navigation.createNavigateOnClickListener(R.id.action_fragmentB_to_fragmentC))
        }
    }


}
