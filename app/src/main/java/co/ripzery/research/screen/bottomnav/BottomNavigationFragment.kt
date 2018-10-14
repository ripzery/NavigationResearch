package co.ripzery.research.screen.bottomnav

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import androidx.navigation.ui.setupWithNavController
import co.ripzery.research.MainActivity
import co.ripzery.research.R
import kotlinx.android.synthetic.main.fragment_bottom_navigation.*

class BottomNavigationFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_bottom_navigation, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val navController = Navigation.findNavController(activity as MainActivity, R.id.content)
        toolbar.setupWithNavController(navController)
        bottomNavigation.setupWithNavController(navController)
        navController.addOnNavigatedListener { _, destination ->
            if (destination.id in arrayOf(R.id.actionSchedules, R.id.actionMusic)) {
                toolbar.navigationIcon = null
            }
        }
        fabSchedule.setOnClickListener {
            bottomNavigation.selectedItemId = R.id.actionSchedules
        }
    }
}