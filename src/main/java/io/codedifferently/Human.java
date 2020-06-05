package io.codedifferently;

public class Human {
    
    private String  firstName;
    private String lastName;
    int maxEnergy = 100;
    private int energy;

    public Human(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.energy = 50;

    }

    public void eat(Fruit fruit){
        if(this.energy + fruit.energy <= maxEnergy){
            this.energy = this.energy + fruit.energy;
        }
        else{
            this.energy = maxEnergy;
            System.out.println("We are full of energy!");
        }
    }

    public void work(int hours){
        int energySpent = hours * 10;
        if(this.energy - energySpent < 0){
            System.out.println("Couldn't do work. Not enough energy. Eat some food.");
        }
        else{
        this.energy = this.energy - energySpent;
        }
    }

    public int getEnergy(){
        return this.energy;
    }

    public String getFirst(){
        return this.firstName;
    }
    public String getLast(){
        return this.lastName;
    }
}