package de.com.rost.fcap;

import android.content.Context;
import android.content.res.Resources;

import java.util.ArrayList;

import de.com.rost.fcap.Craft;
import de.com.rost.fcap.R;

/**
 * Created by daniel on 27.12.2015.
 */

public class Realty {

    private int id;
    private ArrayList<Craft> crafts;
    private String name, realtyID, description, propertyOwner, address1, address2, country, postalCode, city;

    public Realty(String name, String realtyID, String description, Context context){

        this.id = System.identityHashCode(this);
        setCrafts(new ArrayList<Craft>());
        setName(name);
        setRealtyID(realtyID);
        setDescription(description);
        setPropertyOwner(context.getResources().getString(R.string.default_property_owner));
        setAddress1(context.getResources().getString(R.string.default_address_1));
        setAddress2(context.getResources().getString(R.string.default_address_2));
        setCountry(context.getResources().getString(R.string.default_country));
        setPostalCode(context.getResources().getString(R.string.default_postal_code));
        setCity(context.getResources().getString(R.string.default_city));

    }

    public int getId() {
        return id;
    }

    public ArrayList<Craft> getCrafts() {
        return crafts;
    }

    public void setCrafts(ArrayList<Craft> crafts) {
        this.crafts = crafts;
    }

    public void addCrafts(Craft... crafts){
        for(int i = 0; i < crafts.length; i++){
            this.crafts.add(crafts[i]);
        }
    }

    public void removeCrafts(int... pos){
        for( int i = 0; i < pos.length; i++){
            this.crafts.remove(pos[i]);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRealtyID() {
        return realtyID;
    }

    public void setRealtyID(String realtyID) {
        this.realtyID = realtyID;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPropertyOwner() {
        return propertyOwner;
    }

    public void setPropertyOwner(String propertyOwner) {
        this.propertyOwner = propertyOwner;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

}
