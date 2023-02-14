package jp.gr.java_conf.sake_beer.bttest.viewmodel

import android.content.Context
import android.widget.Toast
import jp.gr.java_conf.sake_beer.bttest.BR
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import jp.gr.java_conf.sake_beer.bttest.Repository


class ViewModelSetup(repository: Repository, fragmentManager: FragmentManager, context: Context) : BaseObservable() {

    private val rep = repository
    private val fragmentManager = fragmentManager
    private val context = context

    @get:Bindable
    var deviceName: String
        get() = rep.bluetooth.deviceName
        set(value){
            rep.bluetooth.deviceName = value
            notifyPropertyChanged(BR.deviceName)
        }


    fun buttonBackClicked(){
//        Toast.makeText(context,"Clicked", Toast.LENGTH_SHORT).show()
        fragmentManager.popBackStack()
    }



}
