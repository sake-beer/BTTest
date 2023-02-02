package jp.gr.java_conf.sake_beer.bttest.model

import android.content.Context
import jp.gr.java_conf.sake_beer.bttest.Repository

class TopModel(context: Context, repository: Repository) {


    val btControl: BtControl = BtControl(context, repository)


}