package jp.gr.java_conf.sake_beer.bttest.viewmodel

import jp.gr.java_conf.sake_beer.bttest.BR
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable


class ViewModel : BaseObservable() {

    @get:Bindable
    var infoBTText: String = "(device)"
        set(value){
            field=value
            notifyPropertyChanged(BR.infoBTText)
        }

    @get:Bindable
    var ageText: String = "40"
        set(value){
            field=value
            this.updateInfo()
            notifyPropertyChanged(BR.ageText)
        }

    @get:Bindable
    var heightText: String = "160"
        set(value){
            field=value
            this.updateInfo()
            notifyPropertyChanged(BR.heightText)
        }

    @get:Bindable
    var weightText: String = "60"
        set(value){
            field=value
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
    var infoText: String = "(info)"
        set(value){
            field=value
            notifyPropertyChanged(BR.infoText)
        }

    private fun updateInfo()
    {
        infoText = "[AGE]" + ageText +
                ";[HEIGHT]" + heightText +
                ";[WEIGHT]" + weightText +
                ";[HEIGHT]" + heightText
    }


}
