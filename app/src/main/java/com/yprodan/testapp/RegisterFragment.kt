package com.yprodan.testapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.room.Room
import androidx.room.RoomDatabase
import com.yprodan.testapp.db.DataBase
import com.yprodan.testapp.db.entity.Users

class RegisterFragment : Fragment() {
    lateinit var db: RoomDatabase

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_register, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        db = Room.databaseBuilder(
            requireContext(),
            DataBase::class.java, "database"
        ).allowMainThreadQueries().build()

        (db as DataBase).usersDao().insert(Users(0, "yarik", "12345678", "Prodan", "Yaroslav", 0))

    }
}