package com.example.myforethought.ui.login.dashboard.dashboard_activity;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.example.myforethought.R;
import com.example.myforethought.ui.login.dashboard.DashboardFragment;

public class DashboardTravel extends DashboardFragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dashboard_travel, null);
    }
}
