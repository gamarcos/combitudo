package br.com.gabrielmarcos.combitudo.modules.office

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.office.GridModel
import br.com.gabrielmarcos.combitudo.models.office.OfficeModel
import br.com.gabrielmarcos.combitudo.modules.office.adapter.GridAdapter
import br.com.gabrielmarcos.combitudo.modules.office.adapter.OfficeAdapter
import kotlinx.android.synthetic.main.fragment_office.*

class OfficeFragment: Fragment(), OfficeAdapter.AdapterOfficeListener, GridAdapter.GridAdapterListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_office, null)
        setupOfficeCards()
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        officeTabs.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                updateListWithTab(tab.position)
            }
            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })
    }

    private fun updateListWithTab(tabPosition: Int) {
        if (tabPosition == 0) {
            setupOfficeCards()
        } else {
            setupGridCards()
        }
    }

    private fun setupOfficeCards() {
        recyclerViewOffice.adapter = OfficeAdapter(createOfficeList(),context!!,this@OfficeFragment)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerViewOffice.layoutManager = layoutManager

    }

    private fun setupGridCards() {
        recyclerViewOffice.adapter = GridAdapter(createGridList(),context!!,this@OfficeFragment)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerViewOffice.layoutManager = layoutManager
    }

    private fun createOfficeList(): ArrayList<OfficeModel> {
        val officeList = ArrayList<OfficeModel>()

        officeList.add(OfficeModel("dashdahsduihasd", 2, "dasdasdas", "dasdasdas", "dasdasdasdasd"))
        officeList.add(OfficeModel("dashdahsduihasd", 2, "dasdasdas", "dasdasdas", "dasdasdasdasd"))
        officeList.add(OfficeModel("dashdahsduihasd", 2, "dasdasdas", "dasdasdas", "dasdasdasdasd"))
        officeList.add(OfficeModel("dashdahsduihasd", 2, "dasdasdas", "dasdasdas", "dasdasdasdasd"))
        officeList.add(OfficeModel("dashdahsduihasd", 2, "dasdasdas", "dasdasdas", "dasdasdasdasd"))

        return officeList
    }

    private fun createGridList(): ArrayList<GridModel> {
        val gridList = ArrayList<GridModel>()

        gridList.add(GridModel("dasddasdasd", "fsdfsdfsdfdsf"))
        gridList.add(GridModel("dasddasdasd", "fsdfsdfsdfdsf"))
        gridList.add(GridModel("dasddasdasd", "fsdfsdfsdfdsf"))
        gridList.add(GridModel("dasddasdasd", "fsdfsdfsdfdsf"))
        gridList.add(GridModel("dasddasdasd", "fsdfsdfsdfdsf"))

        return gridList
    }


    override fun onResume() {
        super.onResume()
        setupOfficeCards()
    }

    override fun onOfficeAvaliationClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onOfficeCommentClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCardClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}