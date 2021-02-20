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
        //final TextView textView = root.findViewById(R.id.text_home);
        //homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
        //    @Override
        //    public void onChanged(@Nullable String s) {
        //        textView.setText(s);
        //    }
        //});

        // FIT CHART
        FitChart fitChart = root.findViewById(R.id.fitChart);
        fitChart.setMinValue(0f);
        fitChart.setMaxValue(100f);

        // Create a list with the set values
        List<FitChartValue> values = new ArrayList<>();
        values.add(new FitChartValue(50f, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        values.add(new FitChartValue(25f, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        values.add(new FitChartValue(50f, ContextCompat.getColor(getContext(), R.color.chart_value_3)));

        // Add the Collection to the wheel chart
        fitChart.setValues(values);

        return root;
    }
}