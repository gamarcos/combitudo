package br.com.gabrielmarcos.combitudo.modules.home

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.home.HomeEventsModel
import br.com.gabrielmarcos.combitudo.models.home.HomeNewsModel
import br.com.gabrielmarcos.combitudo.modules.home.adapter.EventsAdapter
import br.com.gabrielmarcos.combitudo.modules.home.adapter.NewsAdapter
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment: Fragment(), NewsAdapter.NewsAdapterListener, EventsAdapter.EventsAdapterListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_home, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupNewsCardsHome()

        homeTabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                updateListWithTab(tab.position)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    private fun updateListWithTab(tabPosition: Int) {
        if (tabPosition == 0) {
            setupNewsCardsHome()
        } else {
            setupEventsCardsHome()
        }
    }

    private fun setupNewsCardsHome() {
        recyclerViewHome.adapter = NewsAdapter(createNewsListCards(),context!!,this@HomeFragment)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerViewHome.layoutManager = layoutManager
    }

    private fun setupEventsCardsHome() {
        recyclerViewHome.adapter = EventsAdapter(createEventsListCards(),context!!,this@HomeFragment)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerViewHome.layoutManager = layoutManager
    }

    private fun createNewsListCards(): ArrayList<HomeNewsModel> {
        val newsList = ArrayList<HomeNewsModel>()
        newsList.add(HomeNewsModel("dasdasda", "dasjdiasjd", "hdashduiahs", "dashduiahsdi", 2))
        newsList.add(HomeNewsModel("dasdasda", "dasjdiasjd", "hdashduiahs", "dashduiahsdi", 2))
        newsList.add(HomeNewsModel("dasdasda", "dasjdiasjd", "hdashduiahs", "dashduiahsdi", 2))
        newsList.add(HomeNewsModel("dasdasda", "dasjdiasjd", "hdashduiahs", "dashduiahsdi", 2))
        newsList.add(HomeNewsModel("dasdasda", "dasjdiasjd", "hdashduiahs", "dashduiahsdi", 2))
        newsList.add(HomeNewsModel("dasdasda", "dasjdiasjd", "hdashduiahs", "dashduiahsdi", 2))

        return newsList
    }

    private fun createEventsListCards(): ArrayList<HomeEventsModel> {
        val eventList = ArrayList<HomeEventsModel>()
        eventList.add(HomeEventsModel("dasuidhuiashdiuh", "diajsdiojas", "djaisojdioasjdioasjd", "daoisjdoiajsdioaj", "jdaosijdasjd", "dashdui", "dasdasdas", "duasihduiash"))
        eventList.add(HomeEventsModel("dasuidhuiashdiuh", "diajsdiojas", "djaisojdioasjdioasjd", "daoisjdoiajsdioaj", "jdaosijdasjd", "dashdui", "dasdasdas", "duasihduiash"))
        eventList.add(HomeEventsModel("dasuidhuiashdiuh", "diajsdiojas", "djaisojdioasjdioasjd", "daoisjdoiajsdioaj", "jdaosijdasjd", "dashdui", "dasdasdas", "duasihduiash"))
        eventList.add(HomeEventsModel("dasuidhuiashdiuh", "diajsdiojas", "djaisojdioasjdioasjd", "daoisjdoiajsdioaj", "jdaosijdasjd", "dashdui", "dasdasdas", "duasihduiash"))
        eventList.add(HomeEventsModel("dasuidhuiashdiuh", "diajsdiojas", "djaisojdioasjdioasjd", "daoisjdoiajsdioaj", "jdaosijdasjd", "dashdui", "dasdasdas", "duasihduiash"))

        return eventList
    }

    override fun onResume() {
        super.onResume()
        setupNewsCardsHome()
    }

    override fun onLikedClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCommentClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onEventLikedClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onEventCommentClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}