package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio change = new Radio();

        change.setCurrentVolume(101);

        int expected = 0;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {
        Radio change = new Radio();

        change.setCurrentVolume(-1);

        int expected = 0;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeCommon() {
        Radio change = new Radio();

        change.setCurrentVolume(50);

        int expected = 50;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinusVolume() {
        Radio change = new Radio();

        change.setCurrentVolume(10);
        change.minusVolume();

        int expected = 9;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolumeSecond() {
        Radio change = new Radio();

        change.setCurrentVolume(-1);
        change.minusVolume();

        int expected = 0;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlusVolume() {
        Radio change = new Radio();

        change.setCurrentVolume(20);
        change.plusVolume();

        int expected = 21;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeSecond() {
        Radio change = new Radio();

        change.setCurrentVolume(99);
        change.plusVolume();
        change.plusVolume();

        int expected = 100;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoiceStation() {
        Radio change = new Radio();

        change.setCurrentRadioStation(5);

        int expected = 5;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {
        Radio change = new Radio();

        change.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {
        Radio change = new Radio();

        change.setCurrentRadioStation(10);

        int expected = 0;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {
        Radio change = new Radio();

        change.setCurrentRadioStation(5);
        change.nextStation();

        int expected = 6;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationSecond() {
        Radio change = new Radio();

        change.setCurrentRadioStation(9);
        change.nextStation();

        int expected = 0;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio change = new Radio();

        change.setCurrentRadioStation(5);
        change.prevStation();

        int expected = 4;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationSecond() {
        Radio change = new Radio();

        change.setCurrentRadioStation(0);
        change.prevStation();

        int expected = 9;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
