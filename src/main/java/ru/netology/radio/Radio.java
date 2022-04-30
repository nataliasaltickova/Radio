package ru.netology.radio;

public class Radio {
    private static final int MIN_NUMBER_RADIO_STATION = 0;
    private int numberCurrentRadioStation;
    private int volumeSound;
    private static final int MAX_VOLUME_SOUND = 100;
    private static final int MIN_VOLUME_SOUND = 0;

    public int getCountRadioStation() {
        return countRadioStation;
    }

    private int countRadioStation = 10;

    public Radio() {
    }

    public Radio(int countRadioStation) {
        if (countRadioStation > MIN_NUMBER_RADIO_STATION) {
            this.countRadioStation = countRadioStation;
        }
    }


    public int getNumberCurrentRadioStation() {

        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        if (numberCurrentRadioStation < MIN_NUMBER_RADIO_STATION || numberCurrentRadioStation > (this.countRadioStation - 1)) {
            return;
        }
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }

    public int getVolumeSound() {

        return volumeSound;
    }

    public void setVolumeSound(int volumeSound) {
        if (volumeSound < MIN_VOLUME_SOUND || volumeSound > MAX_VOLUME_SOUND) {
            return;
        }
        this.volumeSound = volumeSound;
    }


    public void increaseVolume() {
        if (this.volumeSound == MAX_VOLUME_SOUND) {
            return;
        }
        this.volumeSound++;


    }

    public void decreaseVolume() {
        if (this.volumeSound == MIN_VOLUME_SOUND) {
            return;
        }
        this.volumeSound--;

    }

    public void nextStation() {
        if (this.numberCurrentRadioStation < (this.countRadioStation - 1)) {
            this.numberCurrentRadioStation++;
        } else {
            this.numberCurrentRadioStation = MIN_NUMBER_RADIO_STATION;
        }
    }

    public void prevStation() {
        if (this.numberCurrentRadioStation > MIN_NUMBER_RADIO_STATION) {
            this.numberCurrentRadioStation = this.numberCurrentRadioStation - 1;
        } else {
            this.numberCurrentRadioStation = (this.countRadioStation - 1);
        }
    }
}



