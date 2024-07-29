


package assignmentfour;

interface Vehicle {
    int maxSpeed(String type);//empty 
}
abstract class AbstractManufacturer {
    private String name;
    private String modelName;
    private String type;  
    public AbstractManufacturer(String name, String modelName, String type) {
        this.name = name;
        this.modelName = modelName; 
        this.type = type;
    }   
    public String getName() { 
        return name;
    }   
    public String getModelName() {
        return modelName;
    } 
    public String getType() {
        return type;
    }   
    public abstract String getManufacturerInformation();
}
class Bike extends AbstractManufacturer implements Vehicle {
    public Bike(String name, String modelName, String bikeType) {
        super(name, modelName, bikeType); 
    }   
    @Override
    public int maxSpeed(String bikeType) {
        switch (bikeType.toLowerCase()) {
            case "sports": 
                return 300;
            case "cruiser":
                return 170;
            default:
                return 0;
        }
    }    
    @Override
    public String getManufacturerInformation() {
        return "Bike{Manufacturer name:'" + getName() + "', Model Name:'" + getModelName() + "', Type:'" + getType() + "'}";
    }
}
class Car extends AbstractManufacturer implements Vehicle {
    public Car(String name, String modelName, String carType) {
        super(name, modelName, carType);
    }  
    @Override
    public int maxSpeed(String carType) {
        switch (carType.toLowerCase()) {
            case "sports":
                return 250;
            case "sedan":
                return 190;
            default:
                return 0;
        }
    }  
    @Override
    public String getManufacturerInformation() {
        return "Car{Manufacturer name:'" + getName() + "', Model Name:'" + getModelName() + "', Type:'" + getType() + "'}";
    }
}
class VehicleService {
    public Car createCar(String name, String modelName, String type) {
        return new Car(name, modelName, type);
    }
    
    public Bike createBike(String name, String modelName, String type) {
        return new Bike(name, modelName, type);
    }  
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        // Downcast to AbstractManufacturer to access getType method
        AbstractManufacturer firstManufacturer = (AbstractManufacturer) first;
        AbstractManufacturer secondManufacturer = (AbstractManufacturer) second;

        if ("sports".equalsIgnoreCase(firstManufacturer.getType()) && "sports".equalsIgnoreCase(secondManufacturer.getType())) {
            int speed1 = first.maxSpeed(firstManufacturer.getType()); //300
            int speed2 = second.maxSpeed(secondManufacturer.getType());//170
            if (speed1 == speed2) {
                return 0; //car bike sports equal 0
            }
            return Math.max(speed1, speed2); //maximum speed of the  vehicle.. 
        }
        return -1; 
    }
}
public class Main {
    
    public static void main(String[] args) {
        
        VehicleService vehicleService = new VehicleService();
        
        // Create a Car object
        Car car = vehicleService.createCar("Thar", "Mahindra", "sports");
        System.out.println(car.getManufacturerInformation());
        System.out.println("Max Speed: " + car.maxSpeed(car.getType()) + "km/h");
        
        // Create a Bike object
        Bike bike = vehicleService.createBike("Pulsar", "Bajaj", "sports");
        System.out.println(bike.getManufacturerInformation());
        System.out.println("Max Speed: " + bike.maxSpeed(bike.getType()) + "km/h");
        
        // Compare max speeds of the Car and Bike
        int maxSpeedComparison = vehicleService.compareMaxSpeed(car, bike);
        if (maxSpeedComparison == 0) {  
            System.out.println("Both vehicles have the same maximum speed.");
        } else if (maxSpeedComparison == -1) {
            System.out.println("One or both of the vehicles are not of type sports.");
        } else {
            System.out.println("The faster vehicle has a maximum speed of: " + maxSpeedComparison + "km/h");
        }
    }
}
