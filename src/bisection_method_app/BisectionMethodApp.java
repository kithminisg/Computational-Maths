/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bisection_method_app;

import java.util.Scanner;

/**
 *
 * @author Kithmini
 */
public class BisectionMethodApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        System.out.print("Enter lower limit:");
        float lower = s.nextFloat();
        System.out.print("Enter upper limit:");
        float upper = s.nextFloat();
        System.out.print("Enter the accurcy:");
        float accuracy = s.nextFloat();
        
        RootFinder rf = new RootFinder(lower,upper,accuracy);
        rf.calcRoot();
   
      
        
        
        
        

    }
    
}
