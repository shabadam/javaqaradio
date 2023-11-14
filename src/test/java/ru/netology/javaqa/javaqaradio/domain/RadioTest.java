package ru.netology.javaqa.javaqaradio.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void getDefaultSettings() {
        Radio rad = new Radio();

        Assertions.assertEquals(10, rad.getStationAmount());
        Assertions.assertEquals(0, rad.getCurrentStation());
        Assertions.assertEquals(0, rad.getCurrentVolume());
    }

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio(50);

        rad.setCurrentStation(-1);
        Assertions.assertEquals(0, rad.getCurrentStation());

        rad.setCurrentStation(50);
        Assertions.assertEquals(49, rad.getCurrentStation());

        rad.setCurrentStation(40);
        Assertions.assertEquals(40, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio();

        rad.nextButton();
        Assertions.assertEquals(1, rad.getCurrentStation());

        rad.setCurrentStation(9);
        rad.nextButton();
        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio rad = new Radio();

        rad.prevButton();
        Assertions.assertEquals(9, rad.getCurrentStation());

        rad.setCurrentStation(5);
        rad.prevButton();
        Assertions.assertEquals(4, rad.getCurrentStation());
    }

    @Test

    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();

        rad.setCurrentVolume(120);
        Assertions.assertEquals(100, rad.getCurrentVolume());

        rad.setCurrentVolume(-1);
        Assertions.assertEquals(0, rad.getCurrentVolume());

        rad.setCurrentVolume(90);
        Assertions.assertEquals(90, rad.getCurrentVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(99);
        rad.increaseVolume();
        Assertions.assertEquals(100, rad.getCurrentVolume());

        rad.setCurrentVolume(100);
        rad.increaseVolume();
        Assertions.assertEquals(100, rad.getCurrentVolume());
    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(90);
        rad.reduceVolume();
        Assertions.assertEquals(89, rad.getCurrentVolume());

        rad.setCurrentVolume(0);
        rad.reduceVolume();
        Assertions.assertEquals(0, rad.getCurrentVolume());

    }
}