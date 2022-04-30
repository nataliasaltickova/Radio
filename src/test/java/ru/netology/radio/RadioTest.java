package ru.netology.radio;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void shouldSetNumberCurrentRadioStationLowerZero() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(-1);

        int actual = radio.getNumberCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberCurrentRadioStationMoreNine() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(10);
        int actual = radio.getNumberCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetNumberCurrentRadioStationInInterval() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setNumberCurrentRadioStation(5);

        int actual = radio.getNumberCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCountRadioStationInConstructor() {
        Radio radio = new Radio(12);
        int expected = 12;


        int actual = radio.getCountRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeSoundLowerZero() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setVolumeSound(-1);

        int actual = radio.getVolumeSound();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeSoundMoreTen() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setVolumeSound(112);

        int actual = radio.getVolumeSound();
        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeSoundInInterval() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setVolumeSound(5);

        int actual = radio.getVolumeSound();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeMoreMax() {
        Radio radio = new Radio();
        int expected = 100;
        radio.setVolumeSound(100);

        radio.increaseVolume();

        int actual = radio.getVolumeSound();
        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolumeInInterval() {
        Radio radio = new Radio();
        int expected = 1;
        radio.setVolumeSound(0);

        radio.increaseVolume();

        int actual = radio.getVolumeSound();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeLowerMin() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setVolumeSound(0);

        radio.decreaseVolume();

        int actual = radio.getVolumeSound();
        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolumeInInterval() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setVolumeSound(7);

        radio.decreaseVolume();

        int actual = radio.getVolumeSound();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationMoreNine() {
        Radio radio = new Radio();
        int expected = 0;
        radio.setNumberCurrentRadioStation(9);

        radio.nextStation();

        int actual = radio.getNumberCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStationInInterval() {
        Radio radio = new Radio();
        int expected = 6;
        radio.setNumberCurrentRadioStation(5);

        radio.nextStation();

        int actual = radio.getNumberCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationLowerMin() {
        Radio radio = new Radio();
        int expected = 9;
        radio.setNumberCurrentRadioStation(0);

        radio.prevStation();

        int actual = radio.getNumberCurrentRadioStation();
        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStationInInterval() {
        Radio radio = new Radio();
        int expected = 5;
        radio.setNumberCurrentRadioStation(6);

        radio.prevStation();

        int actual = radio.getNumberCurrentRadioStation();
        assertEquals(expected, actual);
    }
}
