package jorgeandaurrios.navcomp8mayoayudantia.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.fragment.findNavController
import jorgeandaurrios.navcomp8mayoayudantia.R
import jorgeandaurrios.navcomp8mayoayudantia.databinding.FragmentUnoBinding


class UnoFragment : Fragment() {

    private var _binding: FragmentUnoBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

//        val view = inflater.inflate(R.layout.fragment_uno, container, false)
        _binding = FragmentUnoBinding.inflate(inflater, container, false)
        val view = binding.root

//        val btnNavegar = view.findViewById<Button>(R.id.btn_ir2)
        val btnNavegar = binding.btnIr2

        btnNavegar.setOnClickListener {
            findNavController().navigate(R.id.action_unoFragment_to_dosFragment)
        }

//        val btnNavegar2 = view.findViewById<Button>(R.id.btn_ir3)
        val btnNavegar2 = binding.btnIr3

        btnNavegar2.setOnClickListener {
            findNavController().navigate(R.id.action_unoFragment_to_tresFragment)
        }


        return view
    }


}