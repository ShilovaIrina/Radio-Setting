package ru.netology.domain;

public class Radio {
    private int stations = 10;
    private int currentStation;
    private int currentVolume;

    public Radio(int stations) {
        this.stations = stations;

    }
    public Radio() {
        new Radio(10);
    }

    public int getStations() {
        return stations;
    }
    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        currentVolume = newVolume;
    }

    public void minusVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void plusVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void setCurrentRadioStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > stations - 1) {
            return;
        }
        currentStation = newStation;
    }

    public void nextStation() {
        if (currentStation < stations - 1) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public void prevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = stations - 1;
        }
    }
}
