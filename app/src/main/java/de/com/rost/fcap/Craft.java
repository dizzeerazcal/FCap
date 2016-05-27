package de.com.rost.fcap;

import java.util.ArrayList;

/**
 * Created by daniel on 27.12.2015.
 */

public class Craft {

    private int id;
    private ArrayList<Equipment> equipments;
    private String description;

    public Craft(String description){

        this.id = System.identityHashCode(this);
        setEquipments(new ArrayList<Equipment>());
        setDescription(description);

    }

    public int getId() {
        return id;
    }

    public ArrayList<Equipment> getEquipments() {
        return equipments;
    }

    public void setEquipments(ArrayList<Equipment> equipments) {
        this.equipments = equipments;
    }

    public void addEquipments(Equipment... equipments){
        for(int i = 0; i< equipments.length; i++){
            this.equipments.add(equipments[i]);
        }
    }

    public void removeCrafts(int... pos){
        for( int i = 0; i < pos.length; i++){
            this.equipments.remove(pos[i]);
        }
    }

   public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
