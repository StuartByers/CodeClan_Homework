public class WaterBottle {

    private int volume = 100;

    public void water() {
        if (volume >= 10) {
            volume -= 10;
        } else {
            volume = 0;
        }
    }

    public void empty() {
        volume = 0;
    }

    public void full() {
        volume = 100;
    }

    public int getVolume() {
        return volume;
    }
}