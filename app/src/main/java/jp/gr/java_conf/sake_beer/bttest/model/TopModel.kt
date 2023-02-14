package jp.gr.java_conf.sake_beer.bttest.model

import android.content.Context
import jp.gr.java_conf.sake_beer.bttest.Repository

class TopModel() {


    val btControl: BtControl = BtControl()
    val dataProfile: DataProfile = DataProfile()


    fun initModel(context: Context){
        btControl.initModel(context)
        dataProfile.initData(context)
    }

}