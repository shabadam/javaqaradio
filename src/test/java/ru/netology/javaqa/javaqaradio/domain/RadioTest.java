package ru.netology.javaqa.javaqaradio.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetStationAmount() {
        Radio rad = new Radio(30);

        Assertions.assertEquals(30, rad.getStationAmount());
        Assertions.assertEquals(29, rad.getCurrentStation());
    }

    @Test
    public void shouldSetStation() {
        Radio rad = new Radio();

        rad.setCurrentStation();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio rad = new Radio(-5);

        rad.setCurrentStation();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetNextStation() {
        Radio rad = new Radio(5);

        rad.setCurrentStation();
        rad.nextButton();

        Assertions.assertEquals(5, rad.getCurrentStation());
    }

    @Test
    public void shouldSetFirstStation() {
        Radio rad = new Radio();

        rad.setCurrentStation();
        rad.nextButton();

        Assertions.assertEquals(0, rad.getCurrentStation());
    }

    @Test
    public void shouldSetPrevStation() {
        Radio rad = new Radio();

        rad.setCurrentStation();
        rad.prevButton();

        Assertions.assertEquals(8, rad.getCurrentStation());
    }

    @Test
    public void shouldSetLastStation() {
        Radio rad = new Radio(0);


        rad.prevButton();

        Assertions.assertEquals(9, rad.getCurrentStation());
    }

    @Test

    public void shouldSetCurrentVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(90);

        int expected = 90;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(99);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test

    public void shouldNotSetVolumeAboveMax() {
        Radio rad = new Radio();


        rad.setCurrentVolume(101);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio rad = new Radio();


        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(100);
        rad.increaseVolume();

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(90);
        rad.reduceVolume();

        int expected = 89;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReduceVolume() {
        Radio rad = new Radio();


        rad.setCurrentVolume(0);
        rad.reduceVolume();

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
