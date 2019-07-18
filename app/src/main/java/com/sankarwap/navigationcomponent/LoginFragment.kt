package com.sankarwap.navigationcomponent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.NavOptions
import androidx.navigation.Navigation


class LoginFragment : Fragment(), View.OnClickListener {

    private lateinit var signup:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootview=inflater.inflate(R.layout.fragment_login, container, false)
        signup=rootview.findViewById(R.id.signup)
        this.signup.setOnClickListener(this)
        return rootview
    }

    override fun onClick(v: View?) {
        val bundle = bundleOf("from" to "login")
//        Navigation.findNavController(v!!).navigate(R.id.signupFragment,bundle) without  finish back fragment

        Navigation.findNavController(v!!).navigate(R.id.signupFragment,bundle , NavOptions.Builder()
                .setPopUpTo(R.id.loginFragment,
                    true).build())

    }

}
