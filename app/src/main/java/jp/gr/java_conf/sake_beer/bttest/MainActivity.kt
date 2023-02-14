package jp.gr.java_conf.sake_beer.bttest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import jp.gr.java_conf.sake_beer.bttest.model.TopModel
import jp.gr.java_conf.sake_beer.bttest.view.ProfileFragment
import jp.gr.java_conf.sake_beer.bttest.view.SetupFragment
import jp.gr.java_conf.sake_beer.bttest.viewmodel.ViewModelSetup
import jp.gr.java_conf.sake_beer.bttest.viewmodel.ViewModelProfile


class MainActivity : AppCompatActivity() {

    private lateinit var fragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentManager = supportFragmentManager


        val topModel = TopModel()
        val repository = Repository(topModel)
        topModel.initModel(this)


//        val viewModelSetup = ViewModelSetup(repository, fragmentManager)
//        viewModelSetup.context = this
//        val fragmentSetup= SetupFragment(viewModelSetup)

        val viewModelProfile = ViewModelProfile(repository, fragmentManager, this)
        val fragmentProfile= ProfileFragment(viewModelProfile)
        val transaction: FragmentTransaction = fragmentManager.beginTransaction()
        transaction.replace(R.id.frameLayout, fragmentProfile).commit()

//        val transaction2: FragmentTransaction = supportFragmentManager.beginTransaction()
//        transaction2.addToBackStack(null)
//        transaction2.replace(R.id.frameLayout, fragmentSetup).commit()


    }
}