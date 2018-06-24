package br.com.gabrielmarcos.combitudo.modules.office.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.office.GridModel

class GridAdapter(private val gridModel: ArrayList<GridModel>,
                  private val context: Context,
                  private val listener: GridAdapterListener): RecyclerView.Adapter<GridAdapter.ViewHolder>() {

    interface GridAdapterListener {
        fun onCardClicked()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_grid, parent, false)
        return ViewHolder(view, listener, context)
    }

    override fun getItemCount(): Int {
        return gridModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(gridModel[position])
    }

    class ViewHolder(itemView: View, val listener: GridAdapterListener, val context: Context) : RecyclerView.ViewHolder(itemView) {
        fun bindView(gridModel: GridModel) {

        }
    }
}