package co.ripzery.research

import android.arch.lifecycle.ViewModelProviders
import android.content.Context
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import co.ripzery.research.ext.log
import co.ripzery.research.viewmodel.StateViewModel

class MainFragment : Fragment() {
    private lateinit var viewModel: StateViewModel

    override fun onAttach(context: Context?) {
        super.onAttach(context)
        log("onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        log("onCreate")
        viewModel = ViewModelProviders.of(activity as MainActivity)[StateViewModel::class.java]
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        log("onCreateView")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        log("onViewCreated")
        if (!viewModel.showSplash) {
            findNavController().navigate(R.id.action_mainFragment_to_splashFragment)
        }
    }
}
