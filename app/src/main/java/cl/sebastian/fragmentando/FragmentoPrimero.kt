package cl.sebastian.fragmentando

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.sebastian.fragmentando.databinding.PrimeroFragmentoBinding

class FragmentoPrimero : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = PrimeroFragmentoBinding.inflate(layoutInflater)
        binding.btnsginte.setOnClickListener { activity?.let {
                 it.supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container_view,FragmentoSegundo())
                     .addToBackStack("F2")
                     .commit()}}
        return binding.root
    }
}