package ru.netology.javaqa.javaqaradio.domain;

public class Radio {

    private int stationAmount;
    private int currentStation;

    private int currentVolume;

    public Radio() {
        this.stationAmount = 10;
        this.currentStation = 9;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
        this.currentStation = stationAmount - 1;
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

    public void setCurrentStation() {
        if (currentStation < 0) {
            currentStation = 0;
        }
    }

    public void nextButton() {

        if (currentStation == 9) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prevButton() {

        if (currentStation > 0) {
            currentStation--;
        } else {
            currentStation = 9;
        }
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            return;
        }
        currentVolume = newCurrentVolume;
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
