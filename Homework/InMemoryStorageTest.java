package Homework;

import Homework.Exceptions.ItemNotFoundExceptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.*;

class InMemoryStorageTest {

    private  Storage storage;

    @BeforeEach
    void setUp() {
        storage = new InMemoryStorage();
    }

    @org.junit.jupiter.api.Test
    void putItem() {
        Wheel wheel = new Wheel(UUID.randomUUID().toString(), "Hakka", "winter", "A", 10);

        storage.putItem(wheel);

        Wheel actual = storage.getItem(wheel.id());
        Assertions.assertEquals(wheel, actual);

    }

    @org.junit.jupiter.api.Test
    void getItem() {
        storage.getItem("123");
        Assertions.assertThrows(ItemNotFoundExceptions.class, () -> storage.getItem("123"));
    }

    @org.junit.jupiter.api.Test
    void containtsItem() {
    }

    @org.junit.jupiter.api.Test
    void removeItem() {
    }
}