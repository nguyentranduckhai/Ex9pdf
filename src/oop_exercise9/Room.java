
package oop_exercise9;


abstract class Room implements IRoom {
     String id;
     String name;
     double baseCost;
    
    public Room(String id, String name, double baseCost) {
        this.id = id;
        this.name = name;
        this.baseCost = baseCost;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBaseCost() {
        return baseCost;
    }

    public void setBaseCost(double baseCost) {
        this.baseCost = baseCost;
    }

    @Override
    public abstract double calculateCost();

    @Override
    public void displayDetails() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Room{" + "id=" + id + ", name=" + name + ", baseCost=" + baseCost + '}';
    }
}
