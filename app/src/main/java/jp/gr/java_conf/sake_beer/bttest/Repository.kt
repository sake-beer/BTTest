package jp.gr.java_conf.sake_beer.bttest

import android.content.Context
import android.provider.Settings.System.getString
import jp.gr.java_conf.sake_beer.bttest.R

class Repository(context: Context) {

    var BtAddress: String = ""

    var sexSelect: Int = 0
//    var ageString: String = context.getString(R.string.default_age)
//    var heightString: String = context.getString(R.string.default_height)
//    var weightString: String = context.getString(R.string.default_weight)

    var ageString: String = "30"
    var heightString: String = "160"
    var weightString: String = "60"




}