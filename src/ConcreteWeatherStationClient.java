class ConcreteWeatherStationClient extends WeatherStationClient {

    @Override
    protected void performCommonSteps() {
        System.out.println("steps before");
    }

    @Override
    protected void displayTemperature(double temperature) {
        System.out.println("Temperature: " + temperature);
    }

    @Override
    protected void displayHumidity(double humidity) {
        System.out.println("Humidity: " + humidity);
    }

    @Override
    protected void performAdditionalSteps() {
        System.out.println("steps after");
    }
}