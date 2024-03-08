class AdvancedTemperatureSensor implements TemperatureSensor {
    @Override
    public double getTemperature() {
        return Math.random() * 86.0;
    }
}