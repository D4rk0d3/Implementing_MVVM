package com.developerstark.frasesfilosoficas.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.developerstark.frasesfilosoficas.model.FraseModel
import com.developerstark.frasesfilosoficas.model.FraseProvider

class FraseViewModel : ViewModel() {
    val fraseModel = MutableLiveData<FraseModel>()

    fun randomFrase(){
        val  currentFrase:FraseModel = FraseProvider.random()
        fraseModel.postValue(currentFrase)
    }
}