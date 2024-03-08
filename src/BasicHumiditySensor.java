class BasicHumiditySensor implements HumiditySensor {
    @Override
    public double getHumidity() {
        return Math.random() * 100.0;
    }
}