interface WeatherSensorFactory {
    TemperatureSensor createTemperatureSensor();
    HumiditySensor createHumiditySensor();
}