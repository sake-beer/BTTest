package jp.gr.java_conf.sake_beer.bttest.viewmodel

import jp.gr.java_conf.sake_beer.bttest.BR
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import jp.gr.java_conf.sake_beer.bttest.Repository


class ViewModelSetup(repository: Repository) : BaseObservable() {

    private val repository: Repository = repository

    @get:Bindable
    var deviceName: String = ""
        set(value){
            field=value
            notifyPropertyChanged(BR.deviceName)
        }




}
