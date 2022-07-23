package Lab108.ex3;

import Lab108.ex3.Car;

public class UtilityVehicle extends Car {

    private boolean fourWheelDrive;


    public UtilityVehicle(String make, String model, int vinNumber, int mileage, boolean fourWheelDrive) {
        super(make, model, vinNumber, mileage);
        setFourWheelDrive(fourWheelDrive);
    }

    public boolean isFourWheelDrive() {
        return fourWheelDrive;
    }

    public void setFourWheelDrive(boolean fourWheelDrive) {
        this.fourWheelDrive = fourWheelDrive;
    }
}
