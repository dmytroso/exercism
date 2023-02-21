public class ElonsToyCar {

    private int meters;
    private int battery;

    ElonsToyCar() {
        this.meters = 0;
        this.battery = 100;
    }

    public static ElonsToyCar buy() {
        return new ElonsToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", meters);
    }

    public String batteryDisplay() {
        if (battery <= 0) {
            return "Battery empty";
        }
        return String.format("Battery at %d%%", battery);
    }

    public void drive() {
        if (battery < 0) {
            return;
        }
        if (meters == 2000) {
            return;
        }
        battery -= 1;
        meters += 20;
    }
}
