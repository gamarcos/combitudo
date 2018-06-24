package br.com.gabrielmarcos.combitudo.modules.home.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.home.HomeNewsModel

class NewsAdapter(private val newsModel: ArrayList<HomeNewsModel>,
                  private val context: Context,
                  private val listener: NewsAdapterListener): RecyclerView.Adapter<NewsAdapter.ViewHolder>() {


    interface NewsAdapterListener {
        fun onLikedClicked()
        fun onCommentClicked()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_home_news, parent, false)
        return ViewHolder(view, listener, context)
    }

    override fun getItemCount(): Int {
        return newsModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(newsModel[position])
    }

    class ViewHolder(itemView: View, val listener: NewsAdapterListener, val context: Context): RecyclerView.ViewHolder(itemView){
        fun bindView(news: HomeNewsModel) {

        }
    }
}