package br.com.gabrielmarcos.combitudo

import android.os.Bundle
import android.support.v4.app.FragmentActivity
import br.com.gabrielmarcos.combitudo.modules.discussion.DiscussionFragment
import br.com.gabrielmarcos.combitudo.modules.home.HomeFragment
import br.com.gabrielmarcos.combitudo.modules.office.OfficeFragment
import br.com.gabrielmarcos.combitudo.modules.profile.ProfileFragment
import br.com.gabrielmarcos.combitudo.modules.training.TrainingFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : FragmentActivity() {

    var currentPage = 0
    val fragmentsList = arrayListOf(HomeFragment(), DiscussionFragment(), OfficeFragment(), TrainingFragment(), ProfileFragment())
    val fragmentsTags = arrayListOf("home", "discussion", "office", "training", "profile")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        loadFragment(0)

        bottomNavigation.setOnNavigationItemReselectedListener {
            when (it.itemId) {
                R.id.bottomNavigationHome -> loadFragment(0)
                R.id.bottomNavigationDiscussion -> loadFragment(1)
                R.id.bottomNavigationOffice -> loadFragment(2)
                R.id.bottomNavigationTraining -> loadFragment(3)
                else -> loadFragment(4)
            }
        }
    }

    private fun loadFragment(page: Int): Boolean {
        val fragment = fragmentsList[page]
        val tag = fragmentsTags[page]

        val fragmentTransaction = supportFragmentManager.beginTransaction()

        if (supportFragmentManager.findFragmentByTag(tag) == null) {
            fragmentTransaction.add(R.id.mainActivityContent, fragment, tag)
        }

        fragmentTransaction.hide(fragmentsList[currentPage])
        fragmentTransaction.show(fragment)
        fragmentTransaction.commit()

        currentPage = page

        return true
    }
}
