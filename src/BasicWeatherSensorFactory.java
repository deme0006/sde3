import proxies.HumiditySensorProxy;
import proxies.TemperatureSensorProxy

class BasicWeatherSensorFactory implements WeatherSensorFactory {
    @Override
    public TemperatureSensor createTemperatureSensor() {
        return new TemperatureSensorProxy(new BasicTemperatureSensor());
    }

    @Override
    public HumiditySensor createHumiditySensor() {
        return new HumiditySensorProxy(new BasicHumiditySensor());
    }
}