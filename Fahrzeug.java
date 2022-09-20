/**
 * Write a description of class Fahrzeug here.
 * 
 * @author (Ruth Bosbach) 
 * @version (1.0 - 2018)
   Test 

 */

import java.util.Random; //für zufällige Fahrzeuge

public class Fahrzeug
{
    // instance variables - replace the example below with your own
    private String modell;
    private String farbe;
    private String kennzeichen;
    private boolean verkehrstauglichkeit;

    /**
     * Constructor for objects of class Patient
     */
    public Fahrzeug(String pModell, String pFarbe, String pKennzeichen, boolean pV)
    {
        // initialise instance variables
        modell = pModell;
        farbe = pFarbe;
        kennzeichen = pKennzeichen;
        verkehrstauglichkeit = pV;
    }
    
    public Fahrzeug(){
        modell = randomModell();
        kennzeichen = randomKennzeichen();
        farbe = randomFarbe();
        verkehrstauglichkeit = randomVerkehrstauglichkeit();
    }

    public String toString(){
        return zeigePapiere();
    }
    
    public String randomFarbe(){
        String [] farben = {"rot","grün","blau","gelb"};
        Random zufall = new Random();
        return farben[zufall.nextInt(farben.length)];
    }
    
    public String randomKennzeichen(){
        String [] staedte = {"HH","GL","SU","HSK","K"};
        String [] kombination = {"AS","AA","B","AK","FC"};
        Random zufall = new Random();
        return staedte[zufall.nextInt(staedte.length)] + "-" + kombination[zufall.nextInt(kombination.length)] + " " + zufall.nextInt(10000);
    }
    
    public String randomModell(){
        String [] modelle = {"Kleintransporter","SUV","Bus","Sportwagen","Mittelklasse"};
        Random zufall = new Random();
        return modelle[zufall.nextInt(modelle.length)];
    }
    
    public boolean randomVerkehrstauglichkeit(){
        Random zufall = new Random();
        boolean tauglichkeit = true;
        int zufallszahl = zufall.nextInt(101);
        if (zufallszahl <= 33){ //jedes 3. Auto ist nicht verkehrstauglich
            tauglichkeit = false;
        }
        return tauglichkeit;
    }
  
    public String zeigePapiere(){
        return kennzeichen + verkehrstauglichkeit;
    }
    
    public boolean getVerkehrstauglichkeit(){
        return verkehrstauglichkeit;
    }
    
    public String getKennzeichen(){
        return kennzeichen;
    }
   
}
