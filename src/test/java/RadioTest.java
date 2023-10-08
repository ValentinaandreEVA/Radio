import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;


public class RadioTest {


    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio(10);


        int expected = 50;
        radio.setCurrentVolume(50);
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void testIncreaseVolume() {
        Radio radio = new Radio();


        int expected = 51;
        radio.setCurrentVolume(50);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void testReduceVolume() {
        Radio radio = new Radio();


        int expected = 49;
        radio.setCurrentVolume(50);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void testIncreaseVolumeMax() {
        Radio radio = new Radio();


        int expected = 100;
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void testReduceVolumeMin() {
        Radio radio = new Radio();


        int expected = 0;
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void shouldSetVolumeAboveMax() {
        Radio radio = new Radio();


        int expected = 100;
        radio.setCurrentVolume(101);
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void shouldSetVolumeBelowMax() {
        Radio radio = new Radio();


        int expected = 0;
        radio.setCurrentVolume(-1);
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);


    }


    @Test
    public void shouldSetStation() {
        Radio radio = new Radio();


        int expected = 5;
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextStation() {
        Radio radio = new Radio();


        int expected = 5;
        radio.setCurrentStation(4);
        radio.nextStation();
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPreviewStation() {
        Radio radio = new Radio();


        int expected = 3;
        radio.setCurrentStation(4);
        radio.previewStation();
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testNextStationMax() {
        Radio radio = new Radio();


        int expected = 0;
        radio.setCurrentStation(9);
        radio.nextStation();
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void testPreviewStationMin() {
        Radio radio = new Radio();


        int expected = 9;
        radio.setCurrentStation(0);
        radio.previewStation();
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationAboveMax() {
        Radio radio = new Radio();


        int expected = 9;
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetStationBelowMax() {
        Radio radio = new Radio();


        int expected = 0;
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();


        Assertions.assertEquals(expected, actual);
    }
}


