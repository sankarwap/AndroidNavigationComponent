package com.sankarwap.navigationcomponent

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation

class SignupFragment : Fragment(), View.OnClickListener {

    private lateinit var signin: Button
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview=inflater.inflate(R.layout.fragment_signup, container, false)
        signin=rootview.findViewById(R.id.signin)
        signin.setOnClickListener(this)
//        Log.d("from",arguments!!.getString("from"))
        return rootview
    }
    override fun onClick(v: View?) {
        Navigation.findNavController(v!!).navigate(R.id.loginFragment)
    }

}
