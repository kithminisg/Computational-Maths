/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bisection_method_app;
import java.lang.Math;
/**
 *
 * @author Kithmini
 */
public class RootFinder {
    float a;          // lower limit
    float b;          // upper limit
    float e;          // accuracy
    int n;            // number of iterations
    float fa;         // function value of lower limit
    float fb;         // function value of upper limit
    
    public RootFinder(float lower, float upper, float accuracy){
        this.a = lower;
        this.b = upper;
        this.e = accuracy;
                
    }
    
    public void calcNoOfIterations(){
        int n;
        n = (int) Math.round((Math.log10(b-a)-Math.log10(e))/Math.log10(2));
        this.n = n;
    }
           
    public boolean isThereARoot(){
        fa = findFunctionValue(a);
        fb = findFunctionValue(b);
        return (fa*fb)<0;         // return true or false according to the provided condition
        
    }
    
    public float findFunctionValue(float x){
        return (float) ((Math.pow(x,2.0))-3); // assigning given value to the function
        
        
    }
    public void calcRoot(){
        
        float p,p1 = 0,fp;
        if(isThereARoot()){
            calcNoOfIterations();
            for(int i=1;i<=n;i++){
                p1 = (a+b)/2;      // intermediate value between a and b
                fp =findFunctionValue(p1);
                if((fa*fp)<0){
                    System.out.println(i+"\t"+a+"\t"+b+"\t"+p1+"\t"+fa+"\t"+fb+"\t"+fp+"\t"+"b=p");
                    b = p1;  // shortening the interval by carrying b to p1
                    fb = fp;
                   
                }
                else if((fa*fp)>0){
                    System.out.println(i+"\t"+a+"\t"+b+"\t"+p1+"\t"+fa+"\t"+fb+"\t"+fp+"\t"+"a=p");
                    a = p1;  // shortening the interval by carrying a to p1
                    fa = fp;
                    
                }
                else
                   p=p1;
                
                
            }
            System.out.print("Root is  :"+p1);
        }
        
        
        else{
            System.out.print("There is no root in the given interval!!!!");
            
        }
}}
