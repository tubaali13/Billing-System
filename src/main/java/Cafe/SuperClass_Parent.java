/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author tuba
 */
public class SuperClass_Parent {
    public double MasalaDosa;
    public double OnionDosa;
    public double Idli;
    public double Upma;
    public double Sandwich;
    
    public double WatermelonJuice;
    public double MosambiJuice;
    public double MangoMilkShake;
    public double StrawberryMilkShake;
    public double ChocMilkShake;
    
    private JFrame frame;
    
    SuperClass_Parent () {
        MasalaDosa = 0.00;
        OnionDosa = 0.00;
        Idli = 0.00;
        Upma = 0.00;
        Sandwich = 0.00;
        WatermelonJuice = 0.00;
        MosambiJuice = 0.00;
        MangoMilkShake = 0.00;
        StrawberryMilkShake = 0.00;
        ChocMilkShake = 0.00;
    }
     
    public void setMasalaDosa( double MasalaDosa ) {
        this.MasalaDosa = MasalaDosa;
    }
    
    public void setOnionDosa( double  OnionDosa ) {
        this. OnionDosa =  OnionDosa;
    }
    
    public void setIdli( double  Idli ) {
        this.Idli =  Idli;
    }
    
    public void setUpma( double  Upma ) {
        this.Upma =  Upma;
    }
    
    public void setSandwich( double Sandwich ) {
        this.Sandwich = Sandwich;
    }
    
    public void setWatermelonJuice( double WatermelonJuice) {
        this.WatermelonJuice = WatermelonJuice;
    }
    
    public void setMosambiJuice( double MosambiJuice ) {
        this.MosambiJuice = MosambiJuice;
    }
    
     public void setMangoMilkShake( double MangoMilkShake) {
        this.MangoMilkShake = MangoMilkShake;
    }
     
    public void setStrawberryMilkShake( double StrawberryMilkShake ) {
        this.StrawberryMilkShake = StrawberryMilkShake;
    }
    
    public void setChocMilkShake( double ChocMilkShake ) {
        this.ChocMilkShake = ChocMilkShake;
    }
     
    public void iExitSystem() {
        frame = new JFrame("Exit");
        
        if( JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Billing System",
                JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}
