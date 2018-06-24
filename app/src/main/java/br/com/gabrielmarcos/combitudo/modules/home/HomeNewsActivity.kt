package br.com.gabrielmarcos.combitudo.modules.home

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.discussion.DiscussionModel
import br.com.gabrielmarcos.combitudo.modules.home.adapter.NewsDetailAdapter
import kotlinx.android.synthetic.main.activity_news.*

class HomeNewsActivity: AppCompatActivity(), NewsDetailAdapter.NewsDetailAdapterListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)

        setupComments()

        closeNews.setOnClickListener{
            finish()
        }
    }

    private fun setupComments() {
        recyclerComments.adapter = NewsDetailAdapter(createListComments(),this, this@HomeNewsActivity)
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        recyclerComments.layoutManager = layoutManager
    }

    private fun createListComments(): ArrayList<DiscussionModel> {
        return arrayListOf(
                DiscussionModel("NO DATA", "NO DATA", "NO DATA"),
                DiscussionModel("NO DATA", "NO DATA", "NO DATA"),
                DiscussionModel("NO DATA", "NO DATA", "NO DATA"),
                DiscussionModel("NO DATA", "NO DATA", "NO DATA"),
                DiscussionModel("NO DATA", "NO DATA", "NO DATA")
        )
    }

    override fun onDiscussionLikedClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onDiscussionCommentClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}