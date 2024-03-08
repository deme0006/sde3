package iterator;

import java.util.List;
import java.util.Iterator; // Add the missing import statement for the Iterator interface

public class WeatherDataIterator implements Iterator<String> {
    private List<String> data;
    private int position;

    public WeatherDataIterator(List<String> data) {
        this.data = data;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < data.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return data.get(position++);
        }
        return null;
    }

    @Override
    public boolean reset() {
        this.position = 0;
    }
}