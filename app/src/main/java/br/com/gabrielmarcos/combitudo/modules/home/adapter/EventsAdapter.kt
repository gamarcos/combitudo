package br.com.gabrielmarcos.combitudo.modules.home.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.home.HomeEventsModel

class EventsAdapter(private val eventsModel: ArrayList<HomeEventsModel>,
                    private val context: Context,
                    private val listener: EventsAdapterListener): RecyclerView.Adapter<EventsAdapter.ViewHolder>() {

    interface EventsAdapterListener {
        fun onEventLikedClicked()
        fun onEventCommentClicked()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_events, parent, false)
        return ViewHolder(view, listener, context)
    }

    override fun getItemCount(): Int {
        return eventsModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(eventsModel[position])
    }

    class ViewHolder(itemView: View, val listener: EventsAdapterListener, val context: Context): RecyclerView.ViewHolder(itemView){
        fun bindView(event: HomeEventsModel) {

        }
    }
}