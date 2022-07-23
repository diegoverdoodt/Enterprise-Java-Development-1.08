package Lab108.ex3;

import Lab108.ex3.Car;

public class Truck extends Car {
    private int towingCapacity;

    public Truck(String make, String model, int vinNumber, int mileage, int towingCapacity) {
        super(make, model, vinNumber, mileage);
        setTowingCapacity(towingCapacity);
    }

    public int getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(int towingCapacity) {
        this.towingCapacity = towingCapacity;
    }
}
