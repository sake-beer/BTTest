package jp.gr.java_conf.sake_beer.bttest

import jp.gr.java_conf.sake_beer.bttest.model.TopModel
import jp.gr.java_conf.sake_beer.bttest.model.BtControl
import jp.gr.java_conf.sake_beer.bttest.model.DataProfile

class Repository(topModel: TopModel) {


    var bluetooth: BtControl = topModel.btControl
    var profile: DataProfile = topModel.dataProfile





}