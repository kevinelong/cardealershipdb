public class Vehicle { //POJO Plain Ordinary Java Object
    Integer vehicle_id;
    String vin;
    String make;
    String model;
    String color;
    Integer year;

    Vehicle(Integer vehicle_id, String vin, String make, String model, String color, Integer year) {
        this.vehicle_id = vehicle_id;
        this.vin = vin;
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    @Override
    public String toString() {
        return String.format("Vehicle{vehicle_id=%d, vin='%s', make='%s', model='%s', color='%s', year=%d}",
                vehicle_id, vin, make, model, color, year);
    }
}
