package ObjectsAndClasses_Exercises.VehicleCatalogue;

public class Vehicle {
    public String vehicleType;
    public String model;
    public String color;
    public int horsepower;

    public Vehicle(String vehicleType, String model, String color, int horsepower) {
        this.vehicleType = vehicleType;
        this.model = model;
        this.color = color;
        this.horsepower = horsepower;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(String vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }
}