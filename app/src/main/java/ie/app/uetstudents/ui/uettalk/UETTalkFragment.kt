package ie.app.uetstudents.ui.uettalk

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
import ie.app.uetstudents.adapter.adapter_itemuettalk
import ie.app.uetstudents.adapter.item_uettalk
import ie.app.uetstudents.databinding.FragmentNotificationsBinding
import ie.app.uetstudents.databinding.FragmentUettalkBinding
import kotlinx.android.synthetic.main.fragment_uettalk.view.*

class UETTalkFragment: Fragment() {

    private lateinit var uettalkViewModel: UETTalkViewModel
    private var _binding: FragmentUettalkBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var adapter : adapter_itemuettalk? = null
    private var liststatus = ArrayList<item_uettalk>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        uettalkViewModel =
            ViewModelProvider(this).get(UETTalkViewModel::class.java)

        _binding = FragmentUettalkBinding.inflate(inflater, container, false)
        val root: View = binding.root
        liststatus.add(item_uettalk(
            0, R.drawable._60279747_1127526494354946_6683273208343303265_n,"Lê Công","1 giờ trước",
            "Đây là bài viết của công",R.drawable._60279747_1127526494354946_6683273208343303265_n,100,50
        ))
        root.recyclerview_item_uettalk.layoutManager = LinearLayoutManager(requireContext())
        adapter = adapter_itemuettalk(liststatus)
        root.recyclerview_item_uettalk.adapter= adapter


        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}