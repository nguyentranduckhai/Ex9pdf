
package oop_exercise9;


public class BedRoom extends Room {
     private int numberOfBeds;
    public BedRoom(String id, String name, double baseCost, int numberOfBeds){
        super(id,name,baseCost);
        this.numberOfBeds = numberOfBeds;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    @Override
    public double calculateCost() {
        if(numberOfBeds >= 3){
            return baseCost * 1.1;
        }else{
            return baseCost;
        }
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("number of beds:"+ numberOfBeds);
    }
}
