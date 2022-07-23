package Lab108.ex3;

public abstract class Car {
    private String  make, model;
    private int vinNumber;
    protected int mileage;


    public Car(String make, String model, int vinNumber, int mileage) {
        setMake(make);
        setModel(model);
        setVinNumber(vinNumber);
        setMileage(mileage);
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(int vinNumber) {
        this.vinNumber = vinNumber;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }


}
