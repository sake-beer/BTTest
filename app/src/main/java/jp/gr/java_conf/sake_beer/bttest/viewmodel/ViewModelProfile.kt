package jp.gr.java_conf.sake_beer.bttest.viewmodel

import jp.gr.java_conf.sake_beer.bttest.BR
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import jp.gr.java_conf.sake_beer.bttest.Repository


class ViewModelProfile(repository: Repository) : BaseObservable() {

    val repository: Repository = repository

    @get:Bindable
    var infoBTText: String = "(device)"
        set(value){
            field=value
            notifyPropertyChanged(BR.infoBTText)
        }

    @get:Bindable
    var spinnerPos: Int
        get() = repository.sexSelect
        set(value){
            repository.sexSelect = value
            this.updateInfo()
            notifyPropertyChanged(BR.spinnerPos)
        }

    @get:Bindable
    var ageText: String
        get() = repository.ageString
        set(value){
            repository.ageString = value
            this.updateInfo()
            notifyPropertyChanged(BR.ageText)
        }

    @get:Bindable
    var heightText: String
        get() = repository.heightString
        set(value){
            repository.heightString = value
            this.updateInfo()
            notifyPropertyChanged(BR.heightText)
        }

    @get:Bindable
    var weightText: String
        get() = repository.weightString
        set(value){
            repository.weightString = value
            this.updateInfo()
            notifyPropertyChanged(BR.weightText)
        }

    @get:Bindable
    var commentText: String = "(comment)"
        set(value){
            field=value
            this.updateInfo()
            notifyPropertyChanged(BR.commentText)
        }

    @get:Bindable
    var infoText: String = ""
        set(value){
            field=value
            notifyPropertyChanged(BR.infoText)
        }

    private fun updateInfo()
    {
        infoText = repository.sexSelect.toString() +
                ";" + repository.ageString +
                ";" + repository.heightString +
                ";" + repository.weightString
    }


}
