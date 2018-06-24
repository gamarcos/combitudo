package br.com.gabrielmarcos.combitudo.modules.office.adapter

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.office.OfficeModel

class OfficeAdapter(private val officeModel: ArrayList<OfficeModel>,
                    private val context: Context,
                    private val listener: AdapterOfficeListener): RecyclerView.Adapter<OfficeAdapter.ViewHolder>() {

    interface AdapterOfficeListener {
        fun onOfficeAvaliationClicked()
        fun onOfficeCommentClicked()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.adapter_office, parent, false)
        return ViewHolder(view, listener, context)
    }

    override fun getItemCount(): Int {
        return officeModel.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bindView(officeModel[position])
    }

    class ViewHolder(itemView: View, val listener: AdapterOfficeListener, val context: Context): RecyclerView.ViewHolder(itemView){
        fun bindView(officeModel: OfficeModel) {

        }
    }
}