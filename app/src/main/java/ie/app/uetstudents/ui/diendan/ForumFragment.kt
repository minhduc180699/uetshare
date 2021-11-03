package ie.app.uetstudents.ui.diendan

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.android.material.bottomsheet.BottomSheetDialog
import ie.app.uetstudents.R
import ie.app.uetstudents.adapter.adapter_chude
import ie.app.uetstudents.adapter.adapter_forum
import ie.app.uetstudents.adapter.item_forum
import ie.app.uetstudents.databinding.FragmentForumBinding
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_forum.*
import kotlinx.android.synthetic.main.fragment_forum.view.*
import kotlinx.android.synthetic.main.layout_bottomsheet.*
import kotlinx.android.synthetic.main.layout_bottomsheet.view.*

class ForumFragment: Fragment() {
    private lateinit var forumViewModel: ForumViewModel
    private var _binding: FragmentForumBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    private var adapter : adapter_forum? = null
    private var listforum = ArrayList<item_forum>()
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        forumViewModel =
            ViewModelProvider(this).get(ForumViewModel::class.java)

        _binding = FragmentForumBinding.inflate(inflater, container, false)
        val root: View = binding.root

      /*  val textView: TextView = binding.textForum
        forumViewModel.text.observe(viewLifecycleOwner, Observer {
            textView.text = it
        })*/
        listforum.add(item_forum(1 , R.drawable.unnamed,"Trường đại học Công nghệ", "10h30 AM", 5))
        listforum.add(item_forum(2, R.drawable.unnamed,"Trường đại học QGHN", "10h30 AM", 5))
        listforum.add(item_forum(3 , R.drawable.unnamed,"Khoa luật", "10h30 AM", 5))
        listforum.add(item_forum(4 , R.drawable.unnamed,"Trường đại học KHXHNV", "10h30 AM", 5))
        listforum.add(item_forum(5 , R.drawable.unnamed,"Trường đại học KHTN", "10h30 AM", 5))
        listforum.add(item_forum(6 , R.drawable.unnamed,"Trường đại học Kinh tế", "10h30 AM", 5))
        listforum.add(item_forum(7 , R.drawable.unnamed,"Khoa Y Dược", "10h30 AM", 5))
        adapter = adapter_forum(listforum)
        root.forum_recycelview.layoutManager= LinearLayoutManager(context)
        root.forum_recycelview.adapter=adapter
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_forum_write.setOnClickListener(
            View.OnClickListener {
                it.findNavController().navigate(R.id.forumFragment_to_writeFragment)
            }
        )

        /*BottomSheetBehavior.from(bottomSheet).apply {
            this.state = BottomSheetBehavior.STATE_HIDDEN

        }*/


        btn_forum_selection.setOnClickListener {


            val bottomSheetDialog = BottomSheetDialog(
                this@ForumFragment.requireContext(),R.style.BottomSheetDialogTheme
            )
            val bottomSheetView = LayoutInflater.from(requireContext()).inflate(R.layout.layout_bottomsheet,bottomsheet )

            var listchude = ArrayList<String>()
            listchude.add("CNTT")
            listchude.add("DTVT")
            listchude.add("Cơ-Kỹ Thuật")
            listchude.add("Robot")
            listchude.add("Khoa học nông nghiệp")
            var adapter = adapter_chude(listchude)
            bottomSheetView.bottomsheetrecyclerview.layoutManager= LinearLayoutManager(requireContext(),LinearLayoutManager.VERTICAL,false)
            bottomSheetView.bottomsheetrecyclerview.adapter= adapter

            bottomSheetDialog.setContentView(bottomSheetView)
            bottomSheetDialog.show()

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}