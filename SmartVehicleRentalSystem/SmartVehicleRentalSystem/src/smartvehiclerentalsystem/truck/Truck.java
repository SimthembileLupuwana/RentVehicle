
package smartvehiclerentalsystem.truck;

import smartvehiclerentalsystem.Vehicle;


public class Truck extends Vehicle{
    
    private double loadCapacityCharge; 

    public Truck() {
    }

    public Truck(double loadCapacityCharge) {
        this.loadCapacityCharge = loadCapacityCharge;
    }

    public Truck(double loadCapacityCharge, String resgistrationNumber, String brand, String model, double dailyRate) {
        super(resgistrationNumber, brand, model, dailyRate);
        this.loadCapacityCharge = loadCapacityCharge;
    }

    public double getLoadCapacityCharge() {
        return loadCapacityCharge;
    }

    public void setLoadCapacityCharge(double loadCapacityCharge) {
        this.loadCapacityCharge = loadCapacityCharge;
    }
@Override
public double calculateRentalCost(int days){
return getDailyRate() * days + this.loadCapacityCharge;
}
}
