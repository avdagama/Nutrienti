package com.example.nutrientiv3.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.example.nutrientiv3.MainActivity;
import com.example.nutrientiv3.R;
import com.txusballesteros.widgets.FitChart;
import com.txusballesteros.widgets.FitChartValue;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        //Defining the friend charts
        FitChart chart = root.findViewById(R.id.fitChart);
        FitChart chart1 = root.findViewById(R.id.fitChart1);
        FitChart chart2 = root.findViewById(R.id.fitChart2);
        FitChart chart3 = root.findViewById(R.id.fitChart3);

        //Defining the text boxes
        TextView text = root.findViewById(R.id.textView);
        TextView text1 = root.findViewById(R.id.fname1);
        TextView text2 = root.findViewById(R.id.fname2);
        TextView text3 = root.findViewById(R.id.fname3);

        //Streaks
        TextView streak1 = root.findViewById(R.id.textView1);
        TextView streak2 = root.findViewById(R.id.textView2);
        TextView streak3 = root.findViewById(R.id.textView3);

        //calling add_data on each chart add_data
        user_add_data(chart,30f,24f,15f,text,"18 days!");
        friends_add_data(chart1,30f,20f,24f,text1,"Nick",streak1,"10");
        friends_add_data(chart2,21f,13f,11f,text2,"Josh",streak2,"20");
        friends_add_data(chart3,50f,25f,25f,text3,"Sam",streak3,"100");
        return root;
    }

    //This function adds the data to the friends circles
    public void friends_add_data(FitChart name,float val1,float val2, float val3, TextView fname, String tname, TextView streak, String streakVal ){
        // FIT CHART1
        name.setMinValue(0f);
        name.setMaxValue(100f);

        // Create a list with the set values
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(val1, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(val2, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(val3, ContextCompat.getColor(getContext(), R.color.chart_value_3)));

        // Add the Collection to the wheel chart
        name.setValues(value);

        //Adjusting the name
        fname.setText(tname);

        //Adjusting the streak
        streak.setText(streakVal);


    }

    //This function adds the data to the Users circles
    public void user_add_data(FitChart name,float val1,float val2, float val3, TextView streak,String Sval){
        // FIT CHART1
        name.setMinValue(0f);
        name.setMaxValue(100f);

        // Create a list with the set values
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(val1, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(val2, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(val3, ContextCompat.getColor(getContext(), R.color.chart_value_3)));

        // Add the Collection to the wheel chart
        name.setValues(value);

        //Adjusting the streak number
        streak.setText(Sval);
    }
}