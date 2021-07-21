/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cafe;

/**
 *
 * @author tuba
 */
public class SubClass_Child extends SuperClass_Parent{
 
    public double Meals;
    public double Drinks;
    public double TotalofMD;
    
    public double AllTotalofMD;
    public double GetAmount(SuperClass_Parent menu) {
        Meals = menu.MasalaDosa + menu.OnionDosa + menu.Idli + menu.Upma + 
                menu.Sandwich;
        Drinks = menu.WatermelonJuice + menu.MosambiJuice + menu.MangoMilkShake + 
                menu.StrawberryMilkShake + menu.ChocMilkShake;
        TotalofMD = Meals + Drinks;
        AllTotalofMD = TotalofMD;
        return AllTotalofMD;
    }
    
    public double mcTax = 0.90;
    
    public double cFindTax(double cAmount) {
        double FindTax = cAmount - (cAmount * mcTax);
        return FindTax;
    }
    
    public void setData (SuperClass_Parent menu) {
        menu.setMasalaDosa(70.00);
        menu.setOnionDosa(50.23);
        menu.setIdli(60.45);
        menu.setUpma(80.41);
        menu.setSandwich(45.54);
        menu.setWatermelonJuice(100.00);
        menu.setMosambiJuice(80.45);
        menu.setMangoMilkShake(60.56);
        menu.setStrawberryMilkShake(60.00);
        menu.setChocMilkShake(120.00);
    }
}
