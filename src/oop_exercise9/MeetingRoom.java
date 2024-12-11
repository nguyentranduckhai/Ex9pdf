
package oop_exercise9;



public class MeetingRoom extends Room {
    private int capacity;

    public MeetingRoom(String id,String name, double baseCost,int capacity) {
        super(id,name,baseCost);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public double calculateCost() {
        if(capacity > 50){
         return baseCost * 1.2;
        }else{
            return baseCost;
        }
       }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("capacity:"+ capacity);
    }
}
    
    
