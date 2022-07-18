package com.example.activitylifecycle.fragments

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.example.activitylifecycle.R
import com.example.activitylifecycle.Utils

class fragment2 : Fragment() {

    lateinit var textview: TextView
    var TAG = "ActivityLifeCycle"
    lateinit var mcontext:Context

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext=context
        Log.d(TAG, "===>fragment2===>onAttach()")
        Utils.showToast("===>fragment2===>onAttach() ",mcontext)

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "===>fragment2===>onCreate()")
        Utils.showToast("===>fragment2===>onCreate() ",mcontext)



    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG, "===>fragment2===>onCreateView()")
        Utils.showToast("===>fragment2===>onCreateView() ",mcontext)


        val view = inflater.inflate(R.layout.fragmnet_layottwo, container, false)
        textview = view.findViewById(R.id.tv_fragmnet)
        textview.text = "This is Fragmnet 2"
        return view


    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "===>fragment2===>onStart()")
        Utils.showToast("===>fragment2===>onStart() ",mcontext)

    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "===>fragment2===>onResume()")
        Utils.showToast("===>fragment2===>onResume() ",mcontext)

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "===>fragment2===>onPause()")
        Utils.showToast("===>fragment2===>onPause() ",mcontext)

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "===>fragment2===>onStop()")
        Utils.showToast("===>fragment2===>onStop() ",mcontext)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "===>fragment2===>onDestroyView()")
        Utils.showToast("===>fragment2===>onDestroyView() ",mcontext)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "===>fragment2===>onDestroy()")
        Utils.showToast("===>fragment2===>onDestroy() ",mcontext)

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "===>fragment2===>onDetach()")
        Utils.showToast("===>fragment2===>onDetach() ",mcontext)

    }


}