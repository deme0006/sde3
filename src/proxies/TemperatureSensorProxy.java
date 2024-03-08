package proxies;

public class TemperatureSensorProxy implements TemperatureSensor {
    private final TemperatureSensor realSensor;

    public TemperatureSensorProxy(TemperatureSensor realSensor) {
        this.realSensor = realSensor;
    }

    @Override
    public double getTemperature() {
        double temperature = realSensor.getTemperature();

        // Do some additional processing here
        System.out.println("Proxy: Retrieving temperature data from sensor");
        
        return temperature;
    }
}