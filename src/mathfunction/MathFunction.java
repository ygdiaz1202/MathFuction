/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mathfunction;

/**
 *
 * @author Yanir Gonzalez Diaz
 */
public class MathFunction {
    
    public static String mathFunction(int number1,int number2,int number3){
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
    
    
    /**
     * @param args The command-line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(mathFunction(3, 0, 3));
    }
    
}
