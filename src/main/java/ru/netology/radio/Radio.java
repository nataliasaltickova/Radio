package ru.netology.radio;

public class Radio {
    private int numberCurrentRadioStation;
    private int volumeSound;


    public int getNumberCurrentRadioStation() {

        return numberCurrentRadioStation;
    }

    public void setNumberCurrentRadioStation(int numberCurrentRadioStation) {
        if (numberCurrentRadioStation < 0 || numberCurrentRadioStation > 9) {
            return;
        }
        this.numberCurrentRadioStation = numberCurrentRadioStation;
    }

    public int getVolumeSound() {

        return volumeSound;
    }

    public void setVolumeSound(int volumeSound) {
        if (volumeSound < 0 || volumeSound > 10) {
            return;
        }
        this.volumeSound = volumeSound;
    }


    public void increaseVolume() {
        if (this.volumeSound == 10) {
            return;
        }
        this.volumeSound++;


    }

    public void decreaseVolume() {
        if (this.volumeSound == 0) {
            return;
        }
        this.volumeSound--;

    }

    public void nextStation() {
        if (this.numberCurrentRadioStation < 9) {
            this.numberCurrentRadioStation++;
        } else {
            this.numberCurrentRadioStation = 0;
        }
    }

    public void prevStation() {
        if (this.numberCurrentRadioStation > 0) {
            this.numberCurrentRadioStation = this.numberCurrentRadioStation - 1;
        } else {
            this.numberCurrentRadioStation = 9;
        }
    }
}



