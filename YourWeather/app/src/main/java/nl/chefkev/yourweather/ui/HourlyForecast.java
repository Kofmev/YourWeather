package nl.chefkev.yourweather.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

import nl.chefkev.yourweather.R;

public class HourlyForecast extends AppCompatActivity {

    private HourlyAdapter adapter;
    private ContentHourlyForecastBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = getIntent();
        setContentView(R.layout.activity_hourly_forecast);
        List<Hour> hoursList = (ArrayList<Hour>) intent.getSerializableExtra("hourlyList");

        binding = DataBindingUtil.setContentView(this, R.layout.content_hourly_forecast);

        adapter = new HourlyAdapter(hoursList, this);

        binding.hourlyListItems.setAdapter(adapter);
        binding.hourlyListItems.setLayoutManager(new LinearLayoutManager(this));
    }

}
