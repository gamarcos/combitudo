package br.com.gabrielmarcos.combitudo.modules.discussion

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.discussion.DiscussionModel
import br.com.gabrielmarcos.combitudo.modules.discussion.adapter.DiscussionAdapter
import kotlinx.android.synthetic.main.fragment_discussion.*

class DiscussionFragment: Fragment(), DiscussionAdapter.DiscussionAdapterListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_discussion, null)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupCardsDiscussions()
    }

    private fun setupCardsDiscussions() {
        recyclerViewDiscussion.adapter = DiscussionAdapter(createCardList(),context!!,this@DiscussionFragment)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerViewDiscussion.layoutManager = layoutManager
    }

    private fun createCardList(): ArrayList<DiscussionModel> {
        val discussionList = ArrayList<DiscussionModel>()
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))
        discussionList.add(DiscussionModel("daushduiahsdui", "shdfiushdfuishdf", "dasjdiojaisojd"))

        return discussionList
    }

    override fun onDiscussionLikedClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDiscussionCommentClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}