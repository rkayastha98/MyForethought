package com.example.myforethought.ui.login.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myforethought.R;
import com.example.myforethought.ui.login.dashboard.Settings.About;
import com.example.myforethought.ui.login.dashboard.Settings.AccountSettings;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardBudget;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardCalendar;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardDiary;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardExercise;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardLists;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardTravel;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class SettingsFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment_settings, null);

        TextView acc = view.findViewById(R.id.accSettings);

        acc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(v);
            }
        });

        TextView about = view.findViewById(R.id.about);

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonClick(v);
            }
        });

        AdView adView = (AdView) view.findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        return view;
    }


    private void onButtonClick(View v) {
        Fragment fg;
        switch (v.getId()) {
            case R.id.accSettings:
                fg = new AccountSettings();
                replaceFragment(fg);
                break;
            case R.id.about:
                fg = new About();
                replaceFragment(fg);
                break;
        }

    }



    private void replaceFragment(Fragment newFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();

    }


}








