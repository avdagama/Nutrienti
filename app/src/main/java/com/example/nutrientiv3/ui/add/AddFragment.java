package com.example.nutrientiv3.ui.add;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.nutrientiv3.R;
import com.txusballesteros.widgets.FitChart;
import com.txusballesteros.widgets.FitChartValue;

import java.util.ArrayList;
import java.util.List;

public class AddFragment extends Fragment {

    private AddViewModel addViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        addViewModel =
                new ViewModelProvider(this).get(AddViewModel.class);
        View root = inflater.inflate(R.layout.fragment_add, container, false);

        //Setting the meal circle
        FitChart chart = root.findViewById(R.id.fitChart);
        TextView text = root.findViewById(R.id.calsText);
        meal_add_data(chart, 69,15f,7f,9f,text,"528 cals");


        return root;
    }

    //This function adds the data to the meal circle
    public void meal_add_data(FitChart name, float curr, float val1, float val2, float val3, TextView streak, String Sval){
        // FIT CHART1
        name.setMinValue(0f);
        name.setMaxValue(100f);

        // Create a list with the set values
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(curr, ContextCompat.getColor(getContext(), R.color.green)));
        value.add(new FitChartValue(val1, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(val2, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(val3, ContextCompat.getColor(getContext(), R.color.chart_value_3)));

        // Add the Collection to the wheel chart
        name.setValues(value);

        //Adjusting the value in the center of the circle
        streak.setText(Sval);
    }
}