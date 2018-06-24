package br.com.gabrielmarcos.combitudo.modules.training.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.training.TrainingModel

class TrainingAdapter (private val trainingModel: ArrayList<TrainingModel>,
                       private val context: Context,
                       private val listener: TrainingAdapterListener): RecyclerView.Adapter<TrainingAdapter.ViewHolder>() {


    interface TrainingAdapterListener {
        fun onTrainingLikedClicked()
        fun onTrainingCommentClicked()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_home_news, parent, false)
        return ViewHolder(view, listener, context)
    }

    override fun getItemCount(): Int {
        return trainingModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(trainingModel[position])
    }

    class ViewHolder(itemView: View, val listener: TrainingAdapterListener, val context: Context) : RecyclerView.ViewHolder(itemView) {
        fun bindView(training: TrainingModel) {

        }
    }
}