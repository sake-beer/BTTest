package jp.gr.java_conf.sake_beer.bttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import jp.gr.java_conf.sake_beer.bttest.model.TopModel
import jp.gr.java_conf.sake_beer.bttest.view.ProfileFragment
import jp.gr.java_conf.sake_beer.bttest.viewmodel.ViewModelSetup
import jp.gr.java_conf.sake_beer.bttest.viewmodel.ViewModelProfile


class MainActivity : AppCompatActivity() {


    private val repository: Repository = Repository(this)
    private val topModel: TopModel = TopModel(this, repository)
    private val viewModelProfile: ViewModelProfile = ViewModelProfile(repository)
    private val viewModelSetup: ViewModelSetup = ViewModelSetup(repository)


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        if (topModel.btControl.adapter == null) {
//            Toast.makeText(this, "BT not supported.", Toast.LENGTH_LONG).show()
//            this.finish()
//        }


        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frameLayout, ProfileFragment(viewModelProfile))
            .commit()

    }
}