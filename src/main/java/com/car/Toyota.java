package com.car;

public class Toyota extends Car {
    private boolean greatGasMileage;
    
    public Toyota(String color, int year, int maxSpeed, boolean greatGasMileage){
        super(color,  year,  maxSpeed);
        this.greatGasMileage = greatGasMileage;

    }
    public boolean getIsElectric(){
        return greatGasMileage;
    }
    public void setGreatGasMileage(boolean isElectric){
        this.greatGasMileage = greatGasMileage;
    }
    
}
