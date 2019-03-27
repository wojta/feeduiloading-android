package cz.sazel.android.feeduiloading

import android.os.Bundle
import android.view.Menu
import androidx.annotation.ContentView
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import kotlinx.android.synthetic.main.activity_main.*

@ContentView(R.layout.activity_main)
class MainActivity : AppCompatActivity() {

    private val navController by lazy(LazyThreadSafetyMode.NONE) {
        findNavController(R.id.navHostFragment)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//      setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)
        NavigationUI.setupWithNavController(navigation, navController)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_activity, menu)
        return super.onCreateOptionsMenu(menu)
    }
}
