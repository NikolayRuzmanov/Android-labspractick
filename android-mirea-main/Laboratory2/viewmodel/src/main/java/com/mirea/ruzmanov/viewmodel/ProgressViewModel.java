package com.mirea.ruzmanov.viewmodel;

import android.app.Application;
import android.os.Handler;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProgressViewModel extends ViewModel {
    private static MutableLiveData<Boolean> isShowProgress = new MutableLiveData<>();

    public ProgressViewModel() {
        super();
    }

    // Показать прогресс в течении 10 сек.
    void showProgress() {
        isShowProgress.postValue(true);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                isShowProgress.postValue(false);
            }
        }, 10000);
    }

    // Возвращает состояние прогресс?
    MutableLiveData<Boolean> getProgressState() {
        return isShowProgress;
    }
}
