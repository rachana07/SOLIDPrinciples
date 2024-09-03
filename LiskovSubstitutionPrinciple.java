import java.util.ArrayList;
import java.util.List;

public class LiskovSubstitutionPrinciple {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<Vehicle>();
        vehicles.add(new Car());
        vehicles.add(new Cycle());
        vehicles.add(new Motorcycle());
        List<EngineVehicle> engineVehicles = new ArrayList<>();
        engineVehicles.add(new Car());
        engineVehicles.add(new Motorcycle());
//        engineVehicles.add(new Cycle()) //cannot add this

    }
}

//If class B is the subtype of class A, then we should be able to replace the object of A with B without breaking the behavior of the program.
//subclass should be able to extend the capability of parent class not narrow it down.

interface Bike{
    void turnOnEngine();
    void accelerate();
}

class MotorCycle implements Bike{
    boolean engineOn;
    int speed;

    public void turnOnEngine(){
        engineOn = true;
    }

    public void accelerate(){
        speed = speed + 5;
    }
}

class Bicycle implements Bike{
    public void turnOnEngine(){
        throw new Error("does not have engine");
    }

    public void accelerate(){

    }
}

//how to solve to avoid throwing exceptions

interface Vehicle{
    public int hasNumberOfWheels(int wheels);
}

interface EngineVehicle extends Vehicle{
    public boolean hasEngine();
}

class Car implements EngineVehicle{

    @Override
    public boolean hasEngine() {
        return false;
    }

    @Override
    public int hasNumberOfWheels(int wheels) {
        return 4;
    }
}

class Motorcycle implements EngineVehicle{

    @Override
    public boolean hasEngine() {
        return false;
    }

    @Override
    public int hasNumberOfWheels(int wheels) {
        return 2;
    }
}

class Cycle implements Vehicle{

    @Override
    public int hasNumberOfWheels(int wheels) {
        return 2;
    }
}