package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio change = new Radio();

    @Test
    public void theRadioStations(){
        Assertions.assertEquals( 10, change.getStations());
    }
    @Test
    public void shouldNotSetVolumeAboveMax() {


        change.setCurrentVolume(101);

        int expected = 0;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeBelowMin() {


        change.setCurrentVolume(-1);

        int expected = 0;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeCommon() {


        change.setCurrentVolume(50);

        int expected = 50;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldMinusVolume() {


        change.setCurrentVolume(10);
        change.minusVolume();

        int expected = 9;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldMinusVolumeSecond() {


        change.setCurrentVolume(-1);
        change.minusVolume();

        int expected = 0;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPlusVolume() {


        change.setCurrentVolume(20);
        change.plusVolume();

        int expected = 21;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPlusVolumeSecond() {


        change.setCurrentVolume(99);
        change.plusVolume();
        change.plusVolume();

        int expected = 100;
        int actual = change.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldChoiceStation() {


        change.setCurrentRadioStation(5);

        int expected = 5;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationBelowMin() {


        change.setCurrentRadioStation(-1);

        int expected = 0;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetStationAboveMax() {


        change.setCurrentRadioStation(10);

        int expected = 0;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStation() {


        change.setCurrentRadioStation(5);
        change.nextStation();

        int expected = 6;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextStationSecond() {


        change.setCurrentRadioStation(9);
        change.nextStation();

        int expected = 0;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {


        change.setCurrentRadioStation(5);
        change.prevStation();

        int expected = 4;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationSecond() {


        change.setCurrentRadioStation(0);
        change.prevStation();

        int expected = 9;
        int actual = change.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }
}
