package br.com.gabrielmarcos.combitudo.modules.discussion.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.discussion.DiscussionModel

class DiscussionDetailAdapter(private val discussionModel: ArrayList<DiscussionModel>,
                              private val context: Context,
                              private val listener: DiscussionDetailAdapterListener): RecyclerView.Adapter<DiscussionDetailAdapter.ViewHolder>() {

    interface DiscussionDetailAdapterListener {
        fun onDiscussionLikedClicked()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_replace_discussion, parent, false)
        return ViewHolder(view, listener, context)
    }

    override fun getItemCount(): Int {
        return discussionModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(discussionModel[position])
    }

    class ViewHolder(itemView: View, val listener: DiscussionDetailAdapterListener, val context: Context) : RecyclerView.ViewHolder(itemView) {
        fun bindView(discussionModel: DiscussionModel) {

        }
    }
}