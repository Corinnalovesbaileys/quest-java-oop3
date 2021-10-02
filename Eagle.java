public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public String sing() {
        return "Screech!";
    }

    @Override
    public void takeOff() {
        System.out.println(this.getName() + " auf geht`s! ");
    }

    @Override
    public int ascend(int meters) {
        if (meters > 100)
        System.out.println("Uiiiiiii es geht nun " + meters + " m in die Höhe!");
        else System.out.println(meters + " m sind ja nicht gerade viel.");
        return meters;
    }

    @Override
    public int descend(int meters) {
        System.out.println("Nun wird es Zeit wieder Land zu sehen, es geht nun " + meters + " m runter." );
        return meters;
    }

    @Override
    public void land() {
        System.out.println(this.getName() + " nun wird es Zeit die Krallen zu schärfen.");
    }

    @Override
    public void glide() {
        Fly.super.glide();
    }
}
