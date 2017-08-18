package sblausten.weatherapp;

import org.junit.Test;

import sblausten.weatherapp.Common.Common;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class CommonTest {
    @Test
    public void apiRequestUrl_returnsCorrectUrlString() {
        String expectedUrl = "http://api.openweathermap.org/data/2.5/forecast/daily?lat=20&lon=31&cnt=5";
        assertThat(Common.apiRequestUrl("20", "31"), is(expectedUrl));
    }

    @Test
    public void getImage_returnsCorrectUrlString() {
        String expectedUrl = "http://openweathermap.org/img/w/01d.png";
        assertThat(Common.getWeatherIcon("01d"), is(equalTo(expectedUrl)));
    }


}