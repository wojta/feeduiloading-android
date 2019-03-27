package cz.sazel.android.feeduiloading

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.ContentView
import androidx.annotation.StringRes
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.placeholder_fragment.*

/**
 * Created by vsazel on 3/27/19
 */
@ContentView(R.layout.placeholder_fragment)
abstract class PlaceholderFragment(@StringRes val resId: Int) : Fragment() {


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        textView.text = getString(resId)
    }
}

class DashboardFragment : PlaceholderFragment(R.string.title_dashboard)
class SomethingElseFragment : PlaceholderFragment(R.string.title_something_else)


