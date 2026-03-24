package generics;

public class Vehicle {
    int maxSpeed;
    String company;

    public Vehicle(int maxSpeed, String company) {
        this.maxSpeed = maxSpeed;
        this.company = company;
    }

    void print(){
        System.out.println(maxSpeed+ " " +company);
    }
}
