package my.edu.tarc.studybuddyfinder.ui.book_room

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import my.edu.tarc.studybuddyfinder.databinding.FragmentBookroomBinding


class BookRoomFragment : Fragment() {

    private var _binding: FragmentBookroomBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val bookRoomViewModel =
            ViewModelProvider(this).get(BookRoomViewModel::class.java)

        _binding = FragmentBookroomBinding.inflate(inflater, container, false)
        val root: View = binding.root

//      val textView: TextView = binding.textBookRoom
//        bookRoomViewModel.text.observe(viewLifecycleOwner) {
//            textView.text = it
//        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}