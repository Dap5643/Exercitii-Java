package org.example;

public class Expresso implements Cafea {

    
    @Override
    public void fierbeCafea() {
        System.out.println("S-a fiert expresso-ul.");   
    }

    @Override
    public void toarnaCafea() {
        System.out.println("S-a turnat expresso-ul.");
    }
}
