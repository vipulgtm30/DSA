package Interfaces;

public class Car extends Vehicle implements VehicleInterface{
    @Override
    public boolean isMotorized() {
        return false;
    }

    @Override
    public String getCompany() {
        return null;
    }

    @Override
    public void print() {
        System.out.println("Car");
    }
}
