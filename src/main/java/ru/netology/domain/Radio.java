package ru.netology.domain;

public class Radio {
    public int currentStation;
    public int currentVolume;

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

    public int getCurrentRadioStation() {
        return currentStation;
    }

    public void setCurrentRadioStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        currentStation = newStation;
    }

    public void NextStation() {
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        } else {
            currentStation = 0;
        }

    }

    public void PrevStation() {
        if (currentStation > 0) {
            currentStation = currentStation - 1;
        } else {
            currentStation = 9;
        }
    }
}
