package com.example.nutrientiv3.ui.diary;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.nutrientiv3.DiaryAdapter;
import com.example.nutrientiv3.R;
import com.txusballesteros.widgets.FitChart;
import com.txusballesteros.widgets.FitChartValue;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class DiaryFragment extends Fragment {

    private DiaryViewModel diary;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        diary = new ViewModelProvider(this).get(DiaryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_diary, container, false);

        // Get textViews and charts from the UI
        FitChart breakfastChart = root.findViewById(R.id.breakfastFitChart);
        TextView breakfastCals = root.findViewById(R.id.breakfastCals);
        FitChart lunchChart = root.findViewById(R.id.lunchFitChart);
        TextView lunchCals = root.findViewById(R.id.lunchCals);
        FitChart dinnerChart = root.findViewById(R.id.dinnerFitChart);
        TextView dinnerCals = root.findViewById(R.id.dinnerCals);
        FitChart snackChart = root.findViewById(R.id.snackFitChart);
        TextView snackCals = root.findViewById(R.id.snackCals);
        FitChart exerciseChart = root.findViewById(R.id.exerciseFitChart);
        TextView exerciseCals = root.findViewById(R.id.exerciseCals);
        TextView exerciseItem1 = root.findViewById(R.id.exerciseItem1);
        TextView exerciseItem2 = root.findViewById(R.id.exerciseItem2);

        // Setup the RecycleViews and Vectors to update the RecycleViews
        Vector<String> breakfastStrings = new Vector<String>();
        Vector<String> lunchStrings = new Vector<String>();
        Vector<String> dinnerStrings = new Vector<String>();
        Vector<String> snackStrings = new Vector<String>();
        setupRecycleViews(root, breakfastStrings, lunchStrings, dinnerStrings, snackStrings);

        // ***** SET DATA HERE *****
        //Breakfast
        setChartData(breakfastChart, 22, 15, 22);
        breakfastCals.setText("386");
        breakfastStrings.add("110g of Cereal");
        breakfastStrings.add("40g of Egg Whites");
        breakfastStrings.add("1 portion of Egg");
        //Lunch
        setChartData(lunchChart, 42, 25, 24);
        lunchCals.setText("619");
        lunchStrings.add("80g of Oats");
        lunchStrings.add("1 scoop of Protein powder");
        lunchStrings.add("1 tbsp of Peanut butter");
        lunchStrings.add("40g of Vanilla yogurt");
        lunchStrings.add("4oz of Mango juice");
        lunchStrings.add("1 portion of Banana");
        //Dinner
        setChartData(dinnerChart, 49, 36, 37);
        dinnerCals.setText("839");
        dinnerStrings.add("1 bowl of Chipotle chicken");
        //Snacks
        setChartData(snackChart, 0, 0, 0);
        snackCals.setText("0");
        snackStrings.add("");
        //Exercise
        setChartData(exerciseChart, 37, 0, 0);
        exerciseCals.setText("273");
        exerciseItem1.setText("5028 steps");
        exerciseItem2.setText("3.72 miles");


        return root;
    }

    // Sets the data to the provided chart
    public void setChartData(FitChart chart, float carbVal, float proteinVal, float fatVal){
        chart.setMinValue(0f);
        chart.setMaxValue(100f);
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(carbVal, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(proteinVal, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(fatVal, ContextCompat.getColor(getContext(), R.color.chart_value_3)));
        chart.setValues(value);
    }

    // Sets up the recycle views so that they can be updated with the provided vector
    public void setupRecycleViews(View root, List<String> breakfastStrings, List<String> lunchStrings, List<String> dinnerStrings, List<String> snackStrings)
    {
        //make and set breakfast recycler view
        RecyclerView breakfastRecyclerView = root.findViewById(R.id.breakfastRecyclerView);
        DiaryAdapter breakfastAdapter = new DiaryAdapter(getContext(), breakfastStrings);
        breakfastRecyclerView.setAdapter(breakfastAdapter);
        breakfastRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        breakfastRecyclerView.setNestedScrollingEnabled(false);

        //make and set lunch recycler view
        RecyclerView lunchRecyclerView = root.findViewById(R.id.lunchRecyclerView);
        DiaryAdapter lunchAdapter = new DiaryAdapter(getContext(), lunchStrings);
        lunchRecyclerView.setAdapter(lunchAdapter);
        lunchRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        lunchRecyclerView.setNestedScrollingEnabled(false);

        //make and set dinner recycler view
        RecyclerView dinnerRecyclerView = root.findViewById(R.id.dinnerRecyclerView);
        DiaryAdapter dinnerAdapter = new DiaryAdapter(getContext(), dinnerStrings);
        dinnerRecyclerView.setAdapter(dinnerAdapter);
        dinnerRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dinnerRecyclerView.setNestedScrollingEnabled(false);

        //make and set snack recycler view
        RecyclerView snackRecyclerView = root.findViewById(R.id.snackRecyclerView);
        DiaryAdapter snackAdapter = new DiaryAdapter(getContext(), snackStrings);
        snackRecyclerView.setAdapter(snackAdapter);
        snackRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        snackRecyclerView.setNestedScrollingEnabled(false);
    }


}