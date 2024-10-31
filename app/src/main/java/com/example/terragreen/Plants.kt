package com.example.terragreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigationrail.NavigationRailView

class Plants : Fragment() {
lateinit var fragmentContainerView: View
lateinit var navigationRailView: NavigationRailView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_plants, container, false)
        navigationRailView=view.findViewById(R.id.navigation_rail)
        fragmentContainerView=view.findViewById(R.id.ind_plants_frag_container)

        navigationRailView.setOnItemSelectedListener{
            when(it.itemId){
                R.id.indoors->{
                    replaceFragment(Indoor_plants())
                    true
                }
                R.id.outdoors->{
                    replaceFragment(Outdoor_plants())
                    true
                }
                R.id.trees->{
                    replaceFragment(Indoor_plants())
                    true
                }
                   else-> false

            }
        }


      return view
    }
    private fun replaceFragment(fragment: Fragment) {
        parentFragmentManager.beginTransaction()
            .replace(R.id.ind_plants_frag_container, fragment)
            .commit()
    }

}
