package ie.app.uetstudents.ui.diendan

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import ie.app.uetstudents.R
import kotlinx.android.synthetic.main.fragment_write.*


class WriteFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_write, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        chuyentrang?.setOnClickListener { it.findNavController().navigate(R.id.writeFragment_to_forumFragment) }
    }
    companion object {
        @JvmStatic
        fun newInstance() =
            WriteFragment().apply {

                }
            }
    }
