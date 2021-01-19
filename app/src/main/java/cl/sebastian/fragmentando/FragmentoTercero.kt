package cl.sebastian.fragmentando

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import cl.sebastian.fragmentando.databinding.TerceroFragmentoBinding

class FragmentoTercero:Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding= TerceroFragmentoBinding.inflate(layoutInflater)
        return binding.root
    }
}