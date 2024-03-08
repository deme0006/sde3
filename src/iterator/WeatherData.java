package iterator;

import java.util.ArrayList;
import java.util.List;

public class WeatherData {
    private List<String> data;

    public WeatherData() {
        this.data = new ArrayList<>();
    }

    public void addData(String info) {
        data.add(info);
    }

    public Iterator<String> iterator() {
        return new WeatherDataIterator(data);
    }
}