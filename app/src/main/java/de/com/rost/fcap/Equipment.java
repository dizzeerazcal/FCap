package de.com.rost.fcap;

import android.content.res.Resources;

import java.util.ArrayList;

import de.com.rost.fcap.Deficiency;
import de.com.rost.fcap.R;

/**
 * Created by daniel on 27.12.2015.
 */

public class Equipment {

    private int id;
    private ArrayList<Deficiency> deficiencies;
    private String boq_pos, description, location, eqNumber, examDate;

    public Equipment(String boq_pos, String description, String eqNumber, String examDate){
        this.id = System.identityHashCode(this);
        setDeficiencies(new ArrayList<Deficiency>());
        setBoq_pos(boq_pos);
        setDescription(description);
        setEqNumber(eqNumber);
        setExamDate(examDate);
        setLocation(Resources.getSystem().getString(R.string.default_location));
    }

    public int getId() {
        return id;
    }

    public ArrayList<Deficiency> getDeficiencies() {
        return deficiencies;
    }

    public void setDeficiencies(ArrayList<Deficiency> deficiencies) {
        this.deficiencies = deficiencies;
    }

    public void addDeficiencies(Deficiency... deficiencies){
        for(int i = 0; i < deficiencies.length; i++){
            this.deficiencies.add(deficiencies[i]);
        }
    }

    public void removeDeficiencies(int... pos){
        for( int i = 0; i < pos.length; i++){
            this.deficiencies.remove(pos[i]);
        }
    }

    public String getBoq_pos() {
        return boq_pos;
    }

    public void setBoq_pos(String boq_pos) {
        this.boq_pos = boq_pos;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEqNumber() {
        return eqNumber;
    }

    public void setEqNumber(String eqNumber) {
        this.eqNumber = eqNumber;
    }

    public String getExamDate() {
        return examDate;
    }

    public void setExamDate(String examDate) {
        this.examDate = examDate;
    }

}
