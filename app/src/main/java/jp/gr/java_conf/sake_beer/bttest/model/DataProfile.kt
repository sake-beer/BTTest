package jp.gr.java_conf.sake_beer.bttest.model

import android.content.Context
import jp.gr.java_conf.sake_beer.bttest.R

class DataProfile (){
    var sexSelect: Int = 0
    var ageString: String = ""
    var heightString: String = ""
    var weightString: String = ""
    var comment: String = ""
    var info: String = ""
        get() = ";" + sexSelect.toString() + ";$ageString;$heightString;$weightString;$comment;"

    fun initData(context: Context){
        sexSelect = context.resources.getInteger(R.integer.default_sex)
        ageString = context.resources.getInteger(R.integer.default_age).toString()
        heightString = context.resources.getInteger(R.integer.default_height).toString()
        weightString = context.resources.getInteger(R.integer.default_weight).toString()
        comment = context.resources.getString(R.string.default_comment)
    }

}
