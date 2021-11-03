package ie.app.uetstudents.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import ie.app.uetstudents.R
import ie.app.uetstudents.adapter.adapter_document
import ie.app.uetstudents.adapter.document
import ie.app.uetstudents.databinding.FragmentHomeBinding
import kotlinx.android.synthetic.main.fragment_home.*
import kotlinx.android.synthetic.main.fragment_home.view.*

class HomeFragment : Fragment() {

    private lateinit var homeViewModel: HomeViewModel
    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    private var adapter: adapter_document? = null
    private var listdocumnet = ArrayList<document>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProvider(this).get(HomeViewModel::class.java)

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root

        // val textView: TextView = binding.textHome
        /*  homeViewModel.text.observe(viewLifecycleOwner, Observer {
              textView.text = it
          })*/
        listdocumnet.add(document(0, R.drawable.unnamed, "UET logo"))
        listdocumnet.add(document(1, R.drawable.logo__1_, "UET logo ảnh trường"))
        adapter = adapter_document(listdocumnet)
        root.home_recyclerview_document.layoutManager = LinearLayoutManager(context)
        root.home_recyclerview_document.adapter = adapter
        root.home_viewflipper.isAutoStart= true
        root.home_viewflipper.flipInterval = 3000
        root.home_viewflipper.startFlipping()
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}