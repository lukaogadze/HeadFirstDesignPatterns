package ge.gov.smartlogic.observer.weatherorama;


import ge.gov.smartlogic.observer.weatherorama.domain.displaydevices.CurrentConditionsDisplay;
import ge.gov.smartlogic.observer.weatherorama.domain.displaydevices.ForecastDisplay;
import ge.gov.smartlogic.observer.weatherorama.domain.displaydevices.HeatIndexDisplay;
import ge.gov.smartlogic.observer.weatherorama.domain.displaydevices.StatisticsDisplay;
import ge.gov.smartlogic.observer.weatherorama.domain.weather.WeatherData;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        HeatIndexDisplay heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(80, 65, 30.4f);
        System.out.println();
        weatherData.setMeasurements(82, 70, 29.2f);
        System.out.println();
        weatherData.setMeasurements(78, 90, 29.2f);
        System.out.println();
        weatherData.removeObserver(statisticsDisplay);
        weatherData.removeObserver(heatIndexDisplay);
        weatherData.removeObserver(forecastDisplay);
        weatherData.setMeasurements(78, 90, 29.2f);
    }
}
