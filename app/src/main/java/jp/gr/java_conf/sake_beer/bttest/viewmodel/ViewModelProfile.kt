package jp.gr.java_conf.sake_beer.bttest.viewmodel

import android.content.Context
import android.widget.Toast
import jp.gr.java_conf.sake_beer.bttest.BR
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import jp.gr.java_conf.sake_beer.bttest.R
import jp.gr.java_conf.sake_beer.bttest.Repository
import jp.gr.java_conf.sake_beer.bttest.view.SetupFragment


class ViewModelProfile(repository: Repository, fragmentManager: FragmentManager, context: Context) : BaseObservable() {

    private val rep = repository
    private val fragmentManager = fragmentManager
    private val context = context


    @get:Bindable
    var infoBTText: String = "(device)"
        set(value){
            field=value
            notifyPropertyChanged(BR.infoBTText)
        }

    @get:Bindable
    var spinnerPos: Int
        get() = rep.profile.sexSelect
        set(value){
            rep.profile.sexSelect = value
            notifyPropertyChanged(BR.spinnerPos)
            infoText = rep.profile.info
        }

    @get:Bindable
    var ageText: String
        get() = rep.profile.ageString
        set(value){
            rep.profile.ageString = value
            notifyPropertyChanged(BR.ageText)
            infoText = rep.profile.info
        }

    @get:Bindable
    var heightText: String
        get() = rep.profile.heightString
        set(value){
            rep.profile.heightString = value
            notifyPropertyChanged(BR.heightText)
            infoText = rep.profile.info
        }

    @get:Bindable
    var weightText: String
        get() = rep.profile.weightString
        set(value){
            rep.profile.weightString = value
            notifyPropertyChanged(BR.weightText)
            infoText = rep.profile.info
        }

    @get:Bindable
    var commentText: String
        get() = rep.profile.comment
        set(value){
            rep.profile.comment = value
            notifyPropertyChanged(BR.commentText)
            infoText = rep.profile.info
        }

    @get:Bindable
    var infoText: String = ""
        set(value){
            field=value
            notifyPropertyChanged(BR.infoText)
        }

    private fun updateInfo()
    {
        infoText = rep.profile.info
    }

    fun buttonDeviceClicked(){
//        Toast.makeText(context,"Clicked", Toast.LENGTH_SHORT).show()
        val viewModelSetup = ViewModelSetup(rep, fragmentManager, context)
        val fragment= SetupFragment(viewModelSetup)
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.addToBackStack(null)
        transaction.replace(R.id.frameLayout, fragment)
        transaction.commit()
    }


}
