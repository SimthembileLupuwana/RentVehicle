
package smartvehiclerentalsystem; 
public class Vehicle {
    
private String resgistrationNumber; 
private String brand;
private String model; 
private double dailyRate; 

    public Vehicle() {
    }

    public Vehicle(String resgistrationNumber, String brand, String model, double dailyRate) {
        this.resgistrationNumber = resgistrationNumber;
        this.brand = brand;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public String getResgistrationNumber() {
        return resgistrationNumber;
    }

    public void setResgistrationNumber(String resgistrationNumber) {
        this.resgistrationNumber = resgistrationNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(double dailyRate) {
        this.dailyRate = dailyRate;
    }

 
   public double calculateRentalCost(int days){
return dailyRate * days;
}
}
