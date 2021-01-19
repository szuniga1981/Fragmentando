package cl.sebastian.fragmentando

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.sebastian.fragmentando.databinding.SegundoFragmentoBinding

class FragmentoSegundo:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding=SegundoFragmentoBinding.inflate(layoutInflater)
        binding.button.setOnClickListener { activity?.let{it.supportFragmentManager.beginTransaction()
            .replace(R.id.fragment_container_view,FragmentoTercero())
            .addToBackStack("F2").commit()}}
        return binding.root
    }
}