package br.com.brunoti.cursos.dio.kotlinpractiseapplicationnotification

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIdService : FirebaseInstanceIdService() {
    override fun onTokenRefresh() {
        Log.i("**newTokenService", FirebaseInstanceId.getInstance().token.toString())
    }
}