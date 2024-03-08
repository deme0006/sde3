import iterator.WeatherData;
import iterator.Iterator;

public abstract class WeatherStationClient {
    // Singleton instance
    private static WeatherStationClient instance;

    // Weather data
    private WeatherData weatherData;

    private WeatherStationClient() {
        weatherData = new WeatherData();
    }

    // Get the singleton instance
    public static WeatherStationClient getInstance() {
        if (instance == null) {
            instance = new WeatherStationClient();
        }
        return instance;
    }

    public final void readWeatherData(WeatherSensorFactory factory) {
        TemperatureSensor temperatureSensor = factory.createTemperatureSensor();
        HumiditySensor humiditySensor = factory.createHumiditySensor();

        performCommonSteps();

        double temperature = temperatureSensor.getTemperature();
        double humidity = humiditySensor.getHumidity();

        weatherData.addData("Temperature: " + temperature + " degrees Celsius, Humidity: " + humidity + "%");

        displayTemperature(temperature);
        displayHumidity(humidity);

        performAdditionalSteps();
    }

    protected abstract void performCommonSteps();

    protected abstract void displayTemperature(double temperature);

    protected abstract void displayHumidity(double humidity);

    protected abstract void performAdditionalSteps();

    // Example of using the iterator pattern
    public void displayWeatherData() {
        Iterator<String> iterator = weatherData.iterator();

        while (iterator.hasNext()) {
            String dataPoint = iterator.next();
            System.out.println("Weather Data: " + dataPoint);
        }
    }

    public static void main(String[] args) {
        WeatherStationClient client = WeatherStationClient.getInstance();
        WeatherSensorFactory basicFactory = new BasicWeatherSensorFactory();
        ConcreteWeatherStationClient basicClient = new ConcreteWeatherStationClient();
        basicClient.readWeatherData(basicFactory);
        basicClient.displayWeatherData();

        WeatherSensorFactory advancedFactory = new AdvancedWeatherSensorFactory();
        ConcreteWeatherStationClient advancedClient = new ConcreteWeatherStationClient();
        advancedClient.readWeatherData(advancedFactory);
        advancedClient.displayWeatherData();
    }
}