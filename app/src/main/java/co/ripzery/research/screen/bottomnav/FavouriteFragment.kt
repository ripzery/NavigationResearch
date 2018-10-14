package co.ripzery.research.screen.bottomnav

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import co.ripzery.research.R
import kotlinx.android.synthetic.main.fragment_favourite.*

class FavouriteFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_favourite, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btnDetail.setOnClickListener { findNavController().navigate(R.id.action_actionFavorites_to_scheduleDetailFragment) }
    }
}