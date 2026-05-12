
package smartvehiclerentalsystem.motobike;

import smartvehiclerentalsystem.Vehicle;


public class Motobike extends Vehicle{

    private double helmetRentalFee; 

    public Motobike() {
    }

    public Motobike(double helmetRentalFee) {
        this.helmetRentalFee = helmetRentalFee;
    }

    public Motobike(double helmetRentalFee, String resgistrationNumber, String brand, String model, double dailyRate) {
        super(resgistrationNumber, brand, model, dailyRate);
        this.helmetRentalFee = helmetRentalFee;
    }

    public double getHelmetRentalFee() {
        return helmetRentalFee;
    }

    public void setHelmetRentalFee(double helmetRentalFee) {
        this.helmetRentalFee = helmetRentalFee;
    }

    @Override
    public double calculateRentalCost(int days){
return getDailyRate() * days + this.helmetRentalFee;
}
   
}
