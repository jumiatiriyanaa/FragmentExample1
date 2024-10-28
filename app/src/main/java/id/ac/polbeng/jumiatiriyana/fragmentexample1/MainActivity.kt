package id.ac.polbeng.jumiatiriyana.fragmentexample1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import id.ac.polbeng.jumiatiriyana.fragmentexample1.databinding.ActivityMainBinding
import id.ac.polbeng.jumiatiriyana.fragmentexample1.BookDescription

// Deklarasi interface Coordinator
interface Coordinator {
    fun onBookChanged(index: Int)
}

class MainActivity : AppCompatActivity(), Coordinator {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBookChanged(index: Int) {
        val frag = supportFragmentManager.findFragmentById(R.id.fragment_book_description)
        if (frag is BookDescription) {
            frag.changeDescription(index)
        }
    }
}
