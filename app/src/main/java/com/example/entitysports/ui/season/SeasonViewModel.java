package com.example.entitysports.ui.season;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SeasonViewModel extends ViewModel {

    private final MutableLiveData<String> mText;

    public SeasonViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Season fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}