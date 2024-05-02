package Homework;
import java.util.HashMap;
import java.util.Map;

public class InMemoryStorage implements Storage{

    private final Map<String,Wheel> store = new HashMap<>();

    @Override
    public void putItem(Wheel wheel) {

    }

    @Override
    public Wheel getItem(String id) {
        return null;
    }

    @Override
    public void containtsItem(String id) {

    }

    @Override
    public Wheel removeItem(String id) {
        return null;
    }
}
