package proxies;

public class HumiditySensorProxy implements HumiditySensor {
    private final HumiditySensor realSensor;

    public HumiditySensorProxy(HumiditySensor realSensor) {
        this.realSensor = realSensor;
    }

    @Override
    public double getHumidity() {
        double humidity = realSensor.getHumidity();
        
        // Do some additional processing here
        System.out.println("Proxy: Retrieving humidity data from sensor");

        return humidity;
    }
}