/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.imbracaminte;
import java.util.Vector;
/**
 *
 * @author coman
 */
public class Imbracaminte {

    String material;
    String brand;
    String culoare;
    double pret;
    String gen;

    public Imbracaminte() {
        material="nespecificat";
        brand="nespecificat";
        culoare="nespecifcat";
        pret=0;
        gen="nespecificat";
                
    }

    public Imbracaminte(String material, String brand, String culoare, double pret, String gen) {
        this.material = material;
        this.brand = brand;
        this.culoare = culoare;
        this.pret = pret;
        this.gen=gen;
    }
    public Imbracaminte(Imbracaminte I){   //constr de copiere
        this.material = I.material;
        this.brand = I.brand;
        this.culoare = I.culoare;
        this.pret = I.pret;
        this.gen=I.gen;
    }
    public String toString(){
        return "brand: "+brand+"\n material: "+material+"\n culoare: "+culoare+"\n pret: "+pret+" \n gen:"+gen;
    }
    public double getPret() {
        return pret;
    }

    public void setPret(double pret) {
        this.pret = pret;
    }


    public String getMaterial() {
        return material;
    }

    public String getBrand() {
        return brand;
    }

    public String getCuloare() {
        return culoare;
    }

    public String getGen() {
        return gen;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setCuloare(String culoare) {
        this.culoare = culoare;
    }

    public void setGen(String gen) {
        this.gen = gen;
    }

    
}

