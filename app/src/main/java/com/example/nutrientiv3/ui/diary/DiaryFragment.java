package com.example.nutrientiv3.ui.diary;

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

import com.example.nutrientiv3.R;
import com.txusballesteros.widgets.FitChart;
import com.txusballesteros.widgets.FitChartValue;

import java.util.ArrayList;
import java.util.List;

public class DiaryFragment extends Fragment {

    private DiaryViewModel diary;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        diary =
                new ViewModelProvider(this).get(DiaryViewModel.class);
        View root = inflater.inflate(R.layout.fragment_diary, container, false);

        // SET MEAL VALUES FOR THE UI HERE
        breakfast_add_data(root, "602",30f,24f,15f,"110g of Cereal", "40g of Egg whites", "1 portion of Egg");
        lunch_add_data(root, "775",20f,12f,12f,"80g of Oats", "1 scoop of Protein powder", "1 tbsp of peanut butter");
        dinner_add_data(root, "428",28f,21f,19f,"90g of Rice", "4oz of Chicken", "2 slices of Avocado");
        snack_add_data(root, "423",17f,26f,11f,"32g of Protein shake", "4oz of Mango Juice", "12 walnuts");
        exercise_add_data(root, "239",60f,0f,0f,"2972 steps", "2.71 miles", "Good job!");

        return root;
    }

    //This function adds the data for a breakfast meal to the UI
    public void breakfast_add_data(View root, String calsVal, float carbVal, float proteinVal, float fatVal, String mealItem1, String mealItem2, String mealItem3){

        //connect to the UI
        FitChart breakfastChart = root.findViewById(R.id.breakfastFitChart);
        TextView breakfastCalsTextBox = root.findViewById(R.id.breakfastCals);
        TextView breakfastItem1TextBox = root.findViewById(R.id.breakfastItem1);
        TextView breakfastItem2TextBox = root.findViewById(R.id.breakfastItem2);
        TextView breakfastItem3TextBox = root.findViewById(R.id.breakfastItem3);

        // set the ring values
        breakfastChart.setMinValue(0f);
        breakfastChart.setMaxValue(100f);
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(carbVal, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(proteinVal, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(fatVal, ContextCompat.getColor(getContext(), R.color.chart_value_3)));
        breakfastChart.setValues(value);

        //set the textboxes
        breakfastCalsTextBox.setText(calsVal);
        breakfastItem1TextBox.setText(mealItem1);
        breakfastItem2TextBox.setText(mealItem2);
        breakfastItem3TextBox.setText(mealItem3);
    }

    //This function adds the data for a lunch meal to the UI
    public void lunch_add_data(View root, String calsVal, float carbVal, float proteinVal, float fatVal, String mealItem1, String mealItem2, String mealItem3){

        //connect to the UI
        FitChart lunchChart = root.findViewById(R.id.lunchFitChart);
        TextView lunchCalsTextBox = root.findViewById(R.id.lunchCals);
        TextView lunchItem1TextBox = root.findViewById(R.id.lunchItem1);
        TextView lunchItem2TextBox = root.findViewById(R.id.lunchItem2);
        TextView lunchItem3TextBox = root.findViewById(R.id.lunchItem3);

        // set the ring values
        lunchChart.setMinValue(0f);
        lunchChart.setMaxValue(100f);
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(carbVal, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(proteinVal, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(fatVal, ContextCompat.getColor(getContext(), R.color.chart_value_3)));
        lunchChart.setValues(value);

        //set the textboxes
        lunchCalsTextBox.setText(calsVal);
        lunchItem1TextBox.setText(mealItem1);
        lunchItem2TextBox.setText(mealItem2);
        lunchItem3TextBox.setText(mealItem3);
    }

    //This function adds the data for a dinner meal to the UI
    public void dinner_add_data(View root, String calsVal, float carbVal, float proteinVal, float fatVal, String mealItem1, String mealItem2, String mealItem3){

        //connect to the UI
        FitChart dinnerChart = root.findViewById(R.id.dinnerFitChart);
        TextView dinnerCalsTextBox = root.findViewById(R.id.dinnerCals);
        TextView dinnerItem1TextBox = root.findViewById(R.id.dinnerItem1);
        TextView dinnerItem2TextBox = root.findViewById(R.id.dinnerItem2);
        TextView dinnerItem3TextBox = root.findViewById(R.id.dinnerItem3);

        // set the ring values
        dinnerChart.setMinValue(0f);
        dinnerChart.setMaxValue(100f);
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(carbVal, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(proteinVal, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(fatVal, ContextCompat.getColor(getContext(), R.color.chart_value_3)));
        dinnerChart.setValues(value);

        //set the textboxes
        dinnerCalsTextBox.setText(calsVal);
        dinnerItem1TextBox.setText(mealItem1);
        dinnerItem2TextBox.setText(mealItem2);
        dinnerItem3TextBox.setText(mealItem3);
    }

    //This function adds the data for a snack meal to the UI
    public void snack_add_data(View root, String calsVal, float carbVal, float proteinVal, float fatVal, String mealItem1, String mealItem2, String mealItem3){

        //connect to the UI
        FitChart snackChart = root.findViewById(R.id.snackFitChart);
        TextView snackCalsTextBox = root.findViewById(R.id.snackCals);
        TextView snackItem1TextBox = root.findViewById(R.id.snackItem1);
        TextView snackItem2TextBox = root.findViewById(R.id.snackItem2);
        TextView snackItem3TextBox = root.findViewById(R.id.snackItem3);

        // set the ring values
        snackChart.setMinValue(0f);
        snackChart.setMaxValue(100f);
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(carbVal, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(proteinVal, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(fatVal, ContextCompat.getColor(getContext(), R.color.chart_value_3)));
        snackChart.setValues(value);

        //set the textboxes
        snackCalsTextBox.setText(calsVal);
        snackItem1TextBox.setText(mealItem1);
        snackItem2TextBox.setText(mealItem2);
        snackItem3TextBox.setText(mealItem3);
    }

    //This function adds the data for a exercise meal to the UI
    public void exercise_add_data(View root, String calsVal, float carbVal, float proteinVal, float fatVal, String mealItem1, String mealItem2, String mealItem3){

        //connect to the UI
        FitChart exerciseChart = root.findViewById(R.id.exerciseFitChart);
        TextView exerciseCalsTextBox = root.findViewById(R.id.exerciseCals);
        TextView exerciseItem1TextBox = root.findViewById(R.id.exerciseItem1);
        TextView exerciseItem2TextBox = root.findViewById(R.id.exerciseItem2);
        TextView exerciseItem3TextBox = root.findViewById(R.id.exerciseItem3);

        // set the ring values
        exerciseChart.setMinValue(0f);
        exerciseChart.setMaxValue(100f);
        List<FitChartValue> value = new ArrayList<>();
        value.add(new FitChartValue(carbVal, ContextCompat.getColor(getContext(), R.color.chart_value_1)));
        value.add(new FitChartValue(proteinVal, ContextCompat.getColor(getContext(), R.color.chart_value_2)));
        value.add(new FitChartValue(fatVal, ContextCompat.getColor(getContext(), R.color.chart_value_3)));
        exerciseChart.setValues(value);

        //set the textboxes
        exerciseCalsTextBox.setText(calsVal);
        exerciseItem1TextBox.setText(mealItem1);
        exerciseItem2TextBox.setText(mealItem2);
        exerciseItem3TextBox.setText(mealItem3);
    }

}