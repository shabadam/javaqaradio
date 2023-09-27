package ru.netology.javaqa.javaqaradio.domain;
public class Radio {
    private int currentStation;

    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentStation = newCurrentRadioStation;
    }

    public void nextButton() {
        setCurrentStation(currentStation);

        if (currentStation < 9) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prevButton() {
        setCurrentStation(currentStation);

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
        setCurrentVolume(currentVolume);

        if (currentVolume < 100) {
            currentVolume++;
        }
    }

    public void reduceVolume() {
        setCurrentVolume(currentVolume);

        if (currentVolume > 0) {
            currentVolume--;
        }
    }
}
