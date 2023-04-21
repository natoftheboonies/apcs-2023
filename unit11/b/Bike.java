package unit11.b;

class Vehicle {
    private int numWheels;

    public Vehicle(int numWheels) {
        this.numWheels = numWheels;
    }

    public String toString() {
        return this.getClass().getName() + " with " + numWheels + " wheels";
    }
}

// Code me! bikes have 2 wheels
public class Bike {

}
