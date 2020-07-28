package com.example.toshairappsprintfinal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val home = HomeFragment()
        val explore = ExploreFragment()
        val post = PostFragment()
        val account = MyAccountFragment()

        makeCurrentFragment(home)

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.navigationHome -> makeCurrentFragment(home)
                R.id.navigationExplore -> makeCurrentFragment(explore)
                R.id.navigationPost -> makeCurrentFragment(post)
                R.id.navigationAccount -> makeCurrentFragment(account)

            }
            true
        }
    }

    private fun makeCurrentFragment(fragment: Fragment) =
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainer, fragment)
            commit()
        }
        //publishButton.setOnClickListener {
            //val text1 = editText1.text
            //val text2 = editText2.text
            //val text= "Published!"
          // Toast.makeText(this, "Published!", Toast.LENGTH_SHORT).show()
        //}



    //private fun loadFragment(fragment: Fragment) {
      //  supportFragmentManager.beginTransaction().also { fragmentTransaction ->
        //    fragmentTransaction.replace(R.id.fragmentContainer, fragment)
          //  fragmentTransaction.commit()
        //}
    //}
}
