package OOPs.abstraction.src;

public class C7 {
    public static void main(String[] args) {
        SmartDevice fan = new Fan("Ceiling Fan");
        fan.turnOn();
        fan.turnOff();
        System.out.println();

        SmartDevice ac = new AC("LG AC");
        ac.turnOn();
        ac.turnOff();
        System.out.println();

        SmartDevice light = new Light("LED Light");
        light.turnOn();
        light.turnOff();
        System.out.println();
    }
}

interface SmartDevice {

    void turnOn();
    void turnOff();
}

class Fan implements SmartDevice {

    String deviceNAme;

    Fan(String deviceNAme) {
        this.deviceNAme = deviceNAme;
    }
    @Override
    public void turnOff() {
        System.out.println(deviceNAme+" turned OFF");
    }

    @Override
    public void turnOn() {
        System.out.println(deviceNAme+" turned ON");
    }
}

class AC implements SmartDevice {

    String deviceNAme;

    AC(String deviceNAme) {
        this.deviceNAme = deviceNAme;
    }
    @Override
    public void turnOff() {
        System.out.println(deviceNAme+" turned OFF");
    }

    @Override
    public void turnOn() {
        System.out.println(deviceNAme+" turned ON");
    }
}

class Light implements SmartDevice {

    String deviceNAme;

    Light(String deviceNAme) {
        this.deviceNAme = deviceNAme;
    }
    @Override
    public void turnOff() {
        System.out.println(deviceNAme+" turned OFF");
    }

    @Override
    public void turnOn() {
        System.out.println(deviceNAme+" turned ON");
    }
}

