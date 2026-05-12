
package smartvehiclerentalsystem.car;

import smartvehiclerentalsystem.Vehicle;

public class Car extends Vehicle{
    
private double insuranceFee; 

    public Car() {
    }

    public Car(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

    public Car(double insuranceFee, String resgistrationNumber, String brand, String model, double dailyRate) {
        super(resgistrationNumber, brand, model, dailyRate);
        this.insuranceFee = insuranceFee;
    }

    public double getInsuranceFee() {
        return insuranceFee;
    }

    public void setInsuranceFee(double insuranceFee) {
        this.insuranceFee = insuranceFee;
    }

@Override
 public double calculateRentalCost(int days){
return getDailyRate() * days + this.insuranceFee;
}
}
