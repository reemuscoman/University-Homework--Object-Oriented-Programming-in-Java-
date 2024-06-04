/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
public class    CamasaSport extends CamasaCasual {
    String activitate;
    int protectie_uv;
    
    
    public CamasaSport()
    {
        activitate="nespecificat";
        protectie_uv=0;
       
    }

    public CamasaSport(String material, String brand, String culoare, double pret,String gen,int marime,String guler,String activitate,int protectie_uv) 
    {
        //String material, String brand, String culoare, double pret,String gen
        super(material, brand, culoare, pret,gen,marime,guler);
        this.activitate=activitate;
        this.protectie_uv=protectie_uv;
        
    }
    public CamasaSport(CamasaSport CS){   
        //constr de copiere
        super(CS);
        this.activitate=CS.activitate;
        this.protectie_uv=CS.protectie_uv; 
    }
    @Override
    public String toString()
    {
         return super.toString()+"\n activitate: "+activitate+"\n protectie_uv: "+protectie_uv;
}

    public int getProtectie_uv() {
        return protectie_uv;
    }

    public void setProtectie_uv(int protectie_uv) {
        this.protectie_uv = protectie_uv;
    }
   
     public boolean verifConditieCS(String brand10Input, String minPrice10Input, String maxPrice10Input, String color10Input){
       boolean brandCondition = brand.equals(brand10Input) || brand10Input.isEmpty();
       boolean minPriceCondition = interval10Pret((int) pret, minPrice10Input, maxPrice10Input) || minPrice10Input.isEmpty();
       boolean colorCondition = String.valueOf(culoare).equals(color10Input) || color10Input.isEmpty();
        
           return brandCondition && minPriceCondition && colorCondition;
   }
   private boolean interval10Pret(int value, String minValue, String maxValue) {
        try {
            if (!minValue.isEmpty() && Integer.parseInt(minValue) > value) {
                return false;
            }
            if (!maxValue.isEmpty() && Integer.parseInt(maxValue) < value) {
                return false;
            }
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }
}
