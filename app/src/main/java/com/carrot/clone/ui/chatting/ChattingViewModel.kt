package com.carrot.clone.ui.chatting

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.carrot.clone.repository.ChattingRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ChattingViewModel @Inject constructor(
    private val chattingRepository: ChattingRepository
): ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is chatting Fragment"
    }
    val text: LiveData<String> = _text
}