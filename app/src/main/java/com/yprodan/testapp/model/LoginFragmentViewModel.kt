package com.yprodan.testapp.model

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.room.Room
import com.yprodan.testapp.db.DataBase

class LoginFragmentViewModel(context: Context): ViewModel(){
    val model = LoginFragmentModel()
    val db = Room.databaseBuilder(
        context,
        DataBase::class.java, "database"
    ).allowMainThreadQueries().build()

    fun check(){
//        db.usersDao().getByLogin(model.getLoginFieldText().toString())?.lastName
        Log.d("sssss", db.usersDao().getByLogin(model.getLoginFieldText().toString()).lastName)
//        Log.d("sssss", "check")
//        for(i in db.usersDao().getAll()){
//            Log.d("sssssssss", i.login)
            Log.d("sssssssssaaa", model.getLoginFieldText().toString())
//            if(model.getLoginFieldText().toString() == i.login){
//                model.setLoginFieldText("ok")
//                Log.d("sssss", "ok")
//                return true
//            }
//        }

    }
}