package basicJava.interfaceConcept;

interface Vehicle {
    void speed();
    void driver();
    default String location(String city){
        return "Vehicle is running in "+city;
    }
}

interface vehicleDetails{
    void carModel();
    void sittingCapacity();
    void speed();
    void driver();
    default String location(String city){
        return "Vehicle is running in "+city;
    }
}

abstract class PassengerInfo {
    abstract void passengerName(String firstName,String LastName);
}

abstract class abstractInterface2{
    abstract void passengerName(String firstName,String LastName);
}

public class InterfaceConcept extends PassengerInfo implements Vehicle,vehicleDetails {
    @Override
    public void speed() {
        System.out.println("Speed of vehicle 100 KM/HR");
    }

    @Override
    public void driver() {
        System.out.println("Diver name is Java");
    }

    @Override
    public String location(String city) {
        return vehicleDetails.super.location(city);
    }

    @Override
    public void carModel() {
        System.out.println("Car is Tata Harrier");
    }

    @Override
    public void sittingCapacity() {
        System.out.println("5 People can seat");
    }
    @Override
    void passengerName(String firstName, String lastName) {
        System.out.println("Passenger name is "+firstName+" "+lastName);
    }
    public static void main(String[] args) {
        InterfaceConcept concept=new InterfaceConcept();
        concept.driver();
        concept.speed();
        System.out.println(concept.location("Pune"));

        concept.carModel();
        concept.sittingCapacity();

        concept.passengerName("Akshay","Kalam");
    }



}
