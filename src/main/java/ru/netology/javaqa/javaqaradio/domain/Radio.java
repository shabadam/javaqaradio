package ru.netology.javaqa.javaqaradio.domain;

public class Radio {

    private int stationAmount;
    private int currentStation;
    private int currentVolume;

    public Radio() {
        this.stationAmount = 10;
        this.currentStation = 0;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
        this.currentStation = 0;
    }

    public int getStationAmount() {
        return stationAmount;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newStation) {
        if (newStation < 0) {
            currentStation = 0;
        } else if (newStation >= stationAmount) {
            currentStation = stationAmount - 1;
        } else {
            currentStation = newStation;
        }
    }

    public void nextButton() {
        if (currentStation + 1 == stationAmount) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevButton() {
        if (currentStation == 0) {
            currentStation = stationAmount - 1;
        } else {
            currentStation--;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            currentVolume = 0;
        } else if (newCurrentVolume > 100) {
            currentVolume = 100;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
