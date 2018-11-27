package fr.loulou.app9.models;

import java.io.Serializable;

public class RobotsItem implements Serializable {

    // files (attributs)
    private String name;
    private String mnemonic;
    private String description;
    private String price;

    // Constructeurs
    public RobotsItem(String name, String description, String price, String mnemonic) {
        // on récupère NAME en attributs de class ROBOTSITEM avec THIS pour le mettre dans NAME
        this.name = name;
        this.mnemonic = mnemonic;
        this.description = description;
        this.price = price;
    }

    // Methods
    public String getName () {return name;}
    public String getMnemonic () {return mnemonic;}
    public String getDescription () {return description;}
    public String getPrice () {return price;}

}
