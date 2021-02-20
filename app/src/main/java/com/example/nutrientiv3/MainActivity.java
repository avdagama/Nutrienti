package com.example.nutrientiv3;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.txusballesteros.widgets.FitChart;
import com.txusballesteros.widgets.FitChartValue;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        //FIT CHART
        FitChart fitChart = findViewById(R.id.fitChart);
        fitChart.setMinValue(0f);
        fitChart.setMaxValue(100f);

        // Create a list with the values
        List<FitChartValue> values = new ArrayList<>();
        values.add(new FitChartValue(30f, ContextCompat.getColor(this, R.color.black)));
        values.add(new FitChartValue(20f, ContextCompat.getColor(this, R.color.purple_700)));
        values.add(new FitChartValue(15f, ContextCompat.getColor(this, R.color.teal_200)));

        // Add the Collection to the wheel chart
        fitChart.setValues(values);
    }

}