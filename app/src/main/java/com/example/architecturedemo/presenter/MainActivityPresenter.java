package com.example.architecturedemo.presenter;

import com.example.architecturedemo.model.PreferenceManager;
import com.example.architecturedemo.view.MainActivity;

public class MainActivityPresenter {
    private MainActivity mainActivity;
    private PreferenceManager manager;

    public MainActivityPresenter(MainActivity activity) {
        this.mainActivity = activity;
        this.manager = PreferenceManager.getInstance();
    }

    public void onActivityCreated() {
        if(manager.getRegisteredUser() == null) {
            mainActivity.redirectToRegistrationFragment();
        } else {
            mainActivity.redirectToMainFragment();
        }
    }

    public void onRedirectionToMainFragmentRequested() {
        mainActivity.redirectToMainFragment();
    }
}
