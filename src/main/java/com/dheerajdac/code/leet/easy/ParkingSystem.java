package com.dheerajdac.code.leet.easy;


public class ParkingSystem{

    
    int big;
    int medium;
    int small;

    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }

    public boolean addCar(int carType) {
        if ( carType == 1){
            if(this.big == 0 ){
                return false;
            } else {
                this.big--;
                return true;
            }
        } else if(carType == 2) {

            if(this.medium == 0 ){
                return false;
            } else {
                this.medium--;
                return true;
            }
        } else if(carType == 3) {
            
            if(this.small == 0 ){
                return false;
            } else {
                this.small--;
                return true;
            }
        }
        return false;
    }

}
