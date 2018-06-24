package br.com.gabrielmarcos.combitudo.modules.discussion.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.discussion.DiscussionModel
import br.com.gabrielmarcos.combitudo.modules.discussion.adapter.DiscussionDetailAdapter
import kotlinx.android.synthetic.main.activity_news.*

class DiscussionActivity: AppCompatActivity(), DiscussionDetailAdapter.DiscussionDetailAdapterListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_discussion)

        setupCardsDiscussions()

        closeNews.setOnClickListener {
            finish()
        }
    }

    private fun setupCardsDiscussions() {
        recyclerComments.adapter = DiscussionDetailAdapter(createCardList(),this, this)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerComments.layoutManager = layoutManager
    }

    private fun createCardList(): ArrayList<DiscussionModel> {
        val discussionList = ArrayList<DiscussionModel>()
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))

        return discussionList
    }

    override fun onDiscussionLikedClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}