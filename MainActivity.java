package sblausten.weatherapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void getWeather(View view) {
        Intent intent = new Intent(this, DisplayWeatherActivity.class);
        FetchForecast forecastData = new FetchForecast
    }
}
