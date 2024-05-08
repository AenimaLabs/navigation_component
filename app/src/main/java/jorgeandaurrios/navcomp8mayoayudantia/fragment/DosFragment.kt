package jorgeandaurrios.navcomp8mayoayudantia.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import jorgeandaurrios.navcomp8mayoayudantia.R
import jorgeandaurrios.navcomp8mayoayudantia.databinding.FragmentDosBinding
import jorgeandaurrios.navcomp8mayoayudantia.databinding.FragmentUnoBinding


class DosFragment : Fragment() {

    private var _binding: FragmentDosBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        val view = inflater.inflate(R.layout.fragment_dos, container, false)
        _binding = FragmentDosBinding.inflate(inflater, container, false)
        val view = binding.root

//        val btnfragment2 = view.findViewById<Button>(R.id.btn_fragment2)

        val btnfragment2 = binding.btnFragment2

        btnfragment2.setOnClickListener {
            findNavController().navigate(R.id.action_dosFragment_to_tresFragment)
        }

        return view
    }



}