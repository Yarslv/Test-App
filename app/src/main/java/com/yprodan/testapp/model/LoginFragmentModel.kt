package com.yprodan.testapp.model

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.ObservableField
import androidx.databinding.library.baseAdapters.BR

data class LoginFragmentModel(
    private var loginFieldText: ObservableField<String> = ObservableField("kkk"),
    private var passwordFieldText: ObservableField<String> = ObservableField("")
): BaseObservable(){

    @Bindable
    fun getLoginFieldText(): String? {
        return loginFieldText.get()
    }

    fun setLoginFieldText(login: String){
        loginFieldText.set(login)
        notifyPropertyChanged(BR.loginFieldText)
    }

    @Bindable
    fun getPasswordFieldText(): String? {
        return passwordFieldText.get()
    }

    fun setPasswordFieldText(password: String){
        passwordFieldText.set(password)
        notifyPropertyChanged(BR.passwordFieldText)
    }
}