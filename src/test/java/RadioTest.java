import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void testvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(5);
        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testscope1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testscope2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testscope3() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testscope4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testimpossible1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testimpossible2() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equivalence1() {
        Radio radio = new Radio();
        radio.setCurrentStation(-25);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void equivalence2() {
        Radio radio = new Radio();
        radio.setCurrentStation(25);
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextscope1() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextscope2() {
        Radio radio = new Radio();
        radio.setCurrentStation(8);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 5;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextscope3() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextscope4() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int actual = radio.getCurrentStation();
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevvalid() {
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevscope1() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevscope2() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevscope3() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prev();
        int actual = radio.getCurrentStation();
        int expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increase1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increase2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increase3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduce1() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduce2() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduce3() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduce4() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void reduce5() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 11;
        Assertions.assertEquals(expected, actual);
    }
}
