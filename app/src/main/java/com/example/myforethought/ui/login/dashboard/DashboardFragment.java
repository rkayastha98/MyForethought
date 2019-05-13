package com.example.myforethought.ui.login.dashboard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myforethought.R;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardBudget;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardCalendar;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardDiary;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardExercise;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardLists;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardTravel;

public class DashboardFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dashboard, null);
    }

    public void calBtn(View view){
        onButtonClick(view);
    }

    public void traBtn(View view){
        onButtonClick(view);
    }

    public void budBtn(View view){
        onButtonClick(view);
    }

    public void listBtn(View view){
        onButtonClick(view);
    }

    public void exeBtn(View view){
        onButtonClick(view);
    }

    public void diaBtn(View view){
        onButtonClick(view);
    }

    public void onButtonClick(View v) {
        Fragment fg;

        switch (v.getId()) {
            case R.id.calendar:
                fg= new DashboardCalendar();
                replaceFragment(fg);
                break;
            case R.id.travel:
                fg=new DashboardTravel();
                replaceFragment(fg);
                break;
            case R.id.budget:
                fg=new DashboardBudget();
                replaceFragment(fg);
                break;
            case R.id.list:
                fg=new DashboardLists();
                replaceFragment(fg);
                break;
            case R.id.exercise:
                fg=new DashboardExercise();
                replaceFragment(fg);
                break;
            case R.id.diary:
                fg=new DashboardDiary();
                replaceFragment(fg);
                break;
        }
    }



    private void replaceFragment(Fragment newFragment) {
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

        if (!newFragment.isAdded()) {
            try {
                //FragmentTransaction trasection =
                getChildFragmentManager().beginTransaction();
                transaction.replace(R.id.dashboard_container, newFragment);
                transaction.addToBackStack(null);
                transaction.commit();
            } catch (Exception e) {
                // TODO: handle exception
                // AppConstants.printLog(e.getMessage());
            }
        } else {
            transaction.show(newFragment);
        }


    }


}
