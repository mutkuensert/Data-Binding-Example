package com.mutkuensert.databindingexample

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel: ViewModel() {
    val theText = MutableLiveData("The Text")

    fun changeTheText(){
        theText.value = "The text has been changed."
    }
}