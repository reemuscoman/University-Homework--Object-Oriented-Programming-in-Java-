/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.imbracaminte;

/**
 *
 * @author coman
 */
    public class PantaloniCasual extends Imbracaminte {
    int nrBuzunare;
    String stil; 
    boolean prohab;
    public PantaloniCasual() {
        nrBuzunare = 0;
        stil = "nespecificat";
        prohab = false;
    }

    public PantaloniCasual(String material, String brand, String culoare, double pret, String gen, int nrBuzunare, String stil, boolean prohab) {
        super(material, brand, culoare, pret, gen);
        this.stil = stil;
        this.nrBuzunare = nrBuzunare;
        this.prohab = prohab;
    }

    public PantaloniCasual(PantaloniCasual P) {  
        super(P);
        this.nrBuzunare = P.nrBuzunare;
        this.stil = P.stil;
        this.prohab = P.prohab;
    }

    @Override
    public String toString() {
        return super.toString() + "\n prohab: " + prohab+ "\n nrBuzunare: " + nrBuzunare + "\n stil: " + stil ;
    }

    public boolean isProhab() {
        return prohab;
    }

    public void setProhab(boolean prohab) {
        this.prohab = prohab;
    }
    
    public boolean verifConditiePantC(String brandInput,String genInput,String colorInput){
       boolean brandCondition = brand.equals(brandInput) || brandInput.isEmpty();
       boolean genCondition = gen.equals(genInput) || genInput.isEmpty();
       boolean colorCondition = culoare.equals(colorInput) || colorInput.isEmpty();
       
        
           return brandCondition && genCondition && colorCondition;
   }
}
    

