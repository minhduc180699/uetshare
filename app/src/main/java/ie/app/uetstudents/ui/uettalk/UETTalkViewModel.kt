package ie.app.uetstudents.ui.uettalk

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class UETTalkViewModel: ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is UET TALK Fragment"
    }
    val text: LiveData<String> = _text
}