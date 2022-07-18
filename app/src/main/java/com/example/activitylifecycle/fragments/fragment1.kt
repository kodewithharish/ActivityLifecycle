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

class fragment1 : Fragment() {
    lateinit var mcontext:Context
    lateinit var textview: TextView
    var TAG = "ActivityLifeCycle"
    override fun onAttach(context: Context) {
        super.onAttach(context)
        mcontext=context
        Log.d(TAG, "=>fragment1=>onAttach()")
        Utils.showToast("=>fragment1=>onAttach() ",mcontext)
}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "=>fragment1=>onCreate()")
        Utils.showToast("=>fragment1=>onCreate() ",mcontext)


    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "=>fragment1=>onCreateView()")
        Utils.showToast("=>fragment1=>onCreateView() ",mcontext)


        val view = inflater.inflate(R.layout.fragmnet_layotone, container, false)
        textview = view.findViewById(R.id.tv_fragmnet)
        textview.text = "This is Fragmnet1"
        return view
    }


    override fun onStart() {
        super.onStart()
        Log.d(TAG, "=>fragment1=>onStart()")
        Utils.showToast("=>fragment1=>onStart() ",mcontext)


    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "=>fragment1=>onResume()")
        Utils.showToast("=>fragment1=>onResume() ",mcontext)

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "=>fragment1=>onPause()")
        Utils.showToast("=>fragment1=>onPause() ",mcontext)

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "=>fragment1=>onStop()")
        Utils.showToast("=>fragment1=>onStop() ",mcontext)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "=>fragment1=>onDestroyView()")
        Utils.showToast("=>fragment1=>onDestroyView() ",mcontext)

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "=>fragment1=>onDestroy()")
        Utils.showToast("=>fragment1=>onDestroy() ",mcontext)

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "=>fragment1=>onDetach()")
        Utils.showToast("=>fragment1=>onDetach() ",mcontext)

    }


}