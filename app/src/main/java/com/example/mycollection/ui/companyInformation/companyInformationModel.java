package com.example.mycollection.ui.companyInformation;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class companyInformationModel extends ViewModel {

    private MutableLiveData<String> mText;

    public companyInformationModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Company Information Application");
    }

    public LiveData<String> getText() {
        return mText;
    }
}