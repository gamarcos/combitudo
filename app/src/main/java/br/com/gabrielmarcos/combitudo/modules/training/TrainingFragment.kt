package br.com.gabrielmarcos.combitudo.modules.training

import android.support.v4.app.Fragment
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import br.com.gabrielmarcos.combitudo.R
import br.com.gabrielmarcos.combitudo.models.training.TrainingModel
import br.com.gabrielmarcos.combitudo.modules.training.adapter.TrainingAdapter
import kotlinx.android.synthetic.main.fragment_training.*

class TrainingFragment: Fragment(), TrainingAdapter.TrainingAdapterListener {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_training, null)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        setupCardsTraining()
    }

    private fun setupCardsTraining() {
        recyclerViewTraining.adapter = TrainingAdapter(createTrainingList(), context!!,this@TrainingFragment)
        val layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
        recyclerViewTraining.layoutManager = layoutManager
    }

    private fun createTrainingList(): ArrayList<TrainingModel> {
        val listTraining = ArrayList<TrainingModel>()

        listTraining.add(TrainingModel("dasdasdasdadasd", "dasdasdasdasdasd", "fsdfuhsdiufhs"))
        listTraining.add(TrainingModel("dasdasdasdadasd", "dasdasdasdasdasd", "fsdfuhsdiufhs"))
        listTraining.add(TrainingModel("dasdasdasdadasd", "dasdasdasdasdasd", "fsdfuhsdiufhs"))
        listTraining.add(TrainingModel("dasdasdasdadasd", "dasdasdasdasdasd", "fsdfuhsdiufhs"))
        listTraining.add(TrainingModel("dasdasdasdadasd", "dasdasdasdasdasd", "fsdfuhsdiufhs"))
        listTraining.add(TrainingModel("dasdasdasdadasd", "dasdasdasdasdasd", "fsdfuhsdiufhs"))

        return listTraining
    }

    override fun onResume() {
        super.onResume()
        setupCardsTraining()
    }

    override fun onTrainingLikedClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onTrainingCommentClicked() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}