package week5_6;

class Bulb {
    private boolean isOn;

    public Bulb() {
        isOn = false;
    }

    public void turnOn() {
        isOn = true;
        System.out.println("Bulb is now ON");
    }

    public void turnOff() {
        isOn = false;
        System.out.println("Bulb is now OFF");
    }

    public boolean isOn() {
        return isOn;
    }
}
