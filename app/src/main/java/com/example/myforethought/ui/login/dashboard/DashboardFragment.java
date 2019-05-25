package com.example.myforethought.ui.login.dashboard;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.myforethought.R;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardBudget;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardCalendar;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardDiary;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardExercise;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.DashboardLists;
import com.example.myforethought.ui.login.dashboard.dashboard_activity.MainActivity;


public class DashboardFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view= inflater.inflate(R.layout.fragment_dashboard, container,false);
        ImageButton calBtn = view.findViewById(R.id.calendar);
        ImageButton traBtn = view.findViewById(R.id.travel);
        ImageButton budBtn = view.findViewById(R.id.budget);
        ImageButton listBtn = view.findViewById(R.id.list);
        ImageButton exeBtn = view.findViewById(R.id.exercise);
        ImageButton diaBtn = view.findViewById(R.id.diary);

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        traBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        budBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        listBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        exeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });

        diaBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onButtonClick(view);
            }
        });
        return view;


    }

    public void onButtonClick(View v) {
        Fragment fg;
        System.out.println("onButtonClick reached============");
        switch (v.getId()) {
            case R.id.calendar:
                fg= new DashboardCalendar();
                replaceFragment(fg);
                break;
            case R.id.travel:
//                fg=new MainActivity();
//                replaceFragment(fg);
//                break;
                Intent intent = new Intent(getContext(), MainActivity.class);
                startActivity(intent);
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
        System.out.println("replaceFragment reached=========================");
        FragmentTransaction transaction = getFragmentManager().beginTransaction();

// Replace whatever is in the fragment_container view with this fragment,
// and add the transaction to the back stack
        transaction.replace(R.id.fragment_container, newFragment);
        transaction.addToBackStack(null);

// Commit the transaction
        transaction.commit();

    }


}
