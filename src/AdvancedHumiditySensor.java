class AdvancedHumiditySensor implements HumiditySensor {
    @Override
    public double getHumidity() {
        return Math.random() * 150.0;
    }
}