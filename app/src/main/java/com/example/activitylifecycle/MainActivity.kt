package com.example.activitylifecycle

import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import com.example.activitylifecycle.fragments.fragment1
import com.example.activitylifecycle.fragments.fragment2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {

    var TAG = "ActivityLifeCycle"

 //   lateinit var tabLayout:TabLayout
 //   lateinit var viewpager:ViewPager2
    //   lateinit var adapater:ViewPager2_Adapter


    lateinit var btn1:Button
    lateinit var btn2:Button
    lateinit var btn3:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1=findViewById(R.id.btn_fragment1)
        btn2=findViewById(R.id.btn_fragment2)
        btn3=findViewById(R.id.btn_next)

        Utils.showToast("=>MainActivity=>Oncreate() ",application)
        Log.i(TAG,"=>MainActivity=>Oncreate()")
        replaceFragmnet(fragment1())

        btn3.setOnClickListener(View.OnClickListener {

            startActivity(Intent(applicationContext,SecondActivity::class.java))
        })

        btn1.setOnClickListener(View.OnClickListener {

            replaceFragmnet(fragment1())

        })

        btn2.setOnClickListener(View.OnClickListener {

            replaceFragmnet(fragment2())

        })

       // tabLayout=findViewById(R.id.tablayout)
       // viewpager=findViewById(R.id.viewpager)
      //  adapater=ViewPager2_Adapter(supportFragmentManager,lifecycle)
      //  viewpager.adapter=adapater


     /*   TabLayoutMediator(tabLayout,viewpager){
            tab,position ->
            when(position) {

                0 -> {
                    tab.text = "Fragment 1"
                }

                1 -> {
                    tab.text = "Fragment 2"
                }
                2 -> {
                    tab.text = "Fragment 3"

                }
            }

        }.attach()*/

    }


    private fun replaceFragmnet(fragment:Fragment)
    {
        val bundel:Bundle= Bundle();
        bundel.putString("name","Harish")
        fragment.arguments=bundel

        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.fragmentcontainerview, fragment)
       // fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    override fun onStart() {
        super.onStart()
        Utils.showToast("=>MainActivity=>onStart() ",application)
        Log.i(TAG,"=>MainActivity=>onStart()")


    }

    override fun onPostCreate(savedInstanceState: Bundle?) {
        super.onPostCreate(savedInstanceState)
      //  Utils.showToast("onPostCreate() ",application)
      //  Log.i(TAG,"onPostCreate()")

    }

    override fun onResume() {
        super.onResume()
        Utils.showToast("=>MainActivity=>onResume() ",application)
        Log.i(TAG,"=>MainActivity=>onResume()")


    }
    override fun onPostResume() {
        super.onPostResume()
      //  Utils.showToast("onPostResume() ",application)
      //  Log.i(TAG,"onPostResume()")

    }


    override fun onPause() {
        super.onPause()
        Utils.showToast("=>MainActivity=>onPause() ",application)
        Log.i(TAG,"=>MainActivity=>onPause()")

    }

    override fun onStop() {
        super.onStop()
        Utils.showToast("=>MainActivity=>onStop() ",application)
        Log.i(TAG,"=>MainActivity=>onStop()")


    }
    override fun onDestroy() {
        super.onDestroy()
        Utils.showToast("=>MainActivity=>onDestroy() ",application)
        Log.i(TAG,"=>MainActivity=>onDestroy()")


    }

    override fun onRestart() {
        super.onRestart()
        Utils.showToast("=>MainActivity=>onRestart() ",application)
        Log.i(TAG,"=>MainActivity=>onRestart()")


    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Utils.showToast("=>MainActivity=>onSaveInstanceState() ",application)
        Log.i(TAG,"=>MainActivity=>onSaveInstanceState()")


    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        Utils.showToast("=>MainActivity=>onRestoreInstanceState() ",application)
        Log.i(TAG,"=>MainActivity=>onRestoreInstanceState()")


    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)
    }
}