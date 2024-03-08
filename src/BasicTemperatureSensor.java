class BasicTemperatureSensor implements TemperatureSensor {
    @Override
    public double getTemperature() {
        return Math.random() * 30.0;
    }
}