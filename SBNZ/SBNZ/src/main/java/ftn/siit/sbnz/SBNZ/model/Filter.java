package ftn.siit.sbnz.SBNZ.model;

public class Filter {

    private Car.Fuel fuel;
    private Car.Type type;
    private Car.Gear gear;

    public Filter() {
    }

    public Filter(Car.Fuel fuel, Car.Type type, Car.Gear gear) {
        this.fuel = fuel;
        this.type = type;
        this.gear = gear;
    }

    public Car.Fuel getFuel() {
        return fuel;
    }

    public void setFuel(Car.Fuel fuel) {
        this.fuel = fuel;
    }

    public Car.Type getType() {
        return type;
    }

    public void setType(Car.Type type) {
        this.type = type;
    }

    public Car.Gear getGear() {
        return gear;
    }

    public void setGear(Car.Gear gear) {
        this.gear = gear;
    }
}
