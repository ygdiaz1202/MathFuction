/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathfunction;

import java.util.LinkedList;

/**
 *
 * @author Yanir Gonzalez Diaz
 */
public class MathFunction {
    
    private int number1;
    private int number2;
    private int number3;
    
    public MathFunction(int number1,int number2, int number3){
       this.number1=number1;
       this.number2 =number2;
       this.number3 =number3;
    }
    
    public String mathFunction(int number1,int number2,int number3){
       String result="";
       if(number1*number2==number3)
            result+="*";
        if(number2!=0 && number1/number2==number3)
            result+="/";
        if(number1+number2==number3)
            result+="+";
        if(number1-number2==number3)
            result+="-";
 
       if (result.isBlank())
           return "None";
       return result;
    }
    
    public void runExample(){
        String solution="mathFunction("+number1+","
                                       +number2+","
                                       +number3+
                                       ") returns "+mathFunction(number1,number2,number3);
        System.out.println(solution);
    }
    
     private void setNumbers(int number1, int number2, int number3) {
       this.number1=number1;
       this.number2 =number2;
       this.number3 =number3;
     }
    
    
    /**
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MathFunction examp=new MathFunction(1,2,3);
        examp.runExample();
        examp.setNumbers(2,2,4);
        examp.runExample();
        examp.setNumbers(3,-3,-9);
        examp.runExample();
        examp.setNumbers(1,2,-1);
        examp.runExample();
        examp.setNumbers(3,3,1);
        examp.runExample();
        examp.setNumbers(7,1,11);
        examp.runExample();
        examp.setNumbers(0,0,0);
        examp.runExample();
   
    }
    
}
