package Homework;

public interface Storage {
    void putItem(Wheel wheel);

    Wheel getItem(String id);

    void containtsItem(String id);

    Wheel removeItem(String id);
}
