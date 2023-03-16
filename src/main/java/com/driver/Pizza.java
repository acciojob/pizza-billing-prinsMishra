package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private int toppings;
    boolean isExtracheeseadded;
    boolean isExtratoppingadded;
    boolean isBillcreated;
    boolean isTakeAway;





    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        if(isVeg){
            this.price = 300;
            this.toppings = 70;

        }
        else{
            this.price = 400;
            this.toppings = 120;


        }
        this.bill = "Base Price Of The Pizza: " + this.price +'\n';
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!isExtracheeseadded) {
            this.price += 80;
            this.isExtracheeseadded = true;
        }
        // your code goes here
    }

    public void addExtraToppings(){
        if(!isExtratoppingadded){
            this.price+= this.toppings;
            isExtratoppingadded = true;
        }
        // your code goes here
    }

    public void addTakeaway(){
        if(!isTakeAway){
            this.price += 20;
            isTakeAway = true;
        }
        // your code goes here
    }

    public String getBill(){
        // your code goes here
        if(!isBillcreated) {
            if (isExtracheeseadded) {
                this.bill += "Extra Cheese Added: 80" + '\n';
            }
            if (isExtratoppingadded) {
                this.bill += "Extra Toppings Added: " + this.toppings + '\n';
            }
            if (isTakeAway) {
                this.bill += "Paperbag Added: 20" + '\n';
            }
            this.bill += "Total Price: " + this.price;
            this.isBillcreated = true;

            return this.bill;
        }
        return "";
    }
}