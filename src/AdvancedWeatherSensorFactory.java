import proxies.TemperatureSensorProxy;
import proxies.HumiditySensorProxy;


class AdvancedWeatherSensorFactory implements WeatherSensorFactory {
    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new TemperatureSensorProxy(new AdvancedTemperatureSensor());
    }

    @Override
    public HumiditySensor createHumiditySensor() {
        return new HumiditySensorProxy(new AdvancedHumiditySensor());
    }
}