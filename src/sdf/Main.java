package sdf;

import java.io.Console;

public class Main{
    public static void main(String[] args) {
        
        Console cons = System.console(); 
        System.out.println("Welcome.");
        String calculations = cons.readLine(">"); 
        String calculatedString; 
        double calculated; 

        if(calculations.equalsIgnoreCase("Exit")){
        System.out.println("Bye bye");
        } 
        // else {
        //     String[] toCalculate = calculations.split(" "); 
             
        //     String valueOne = toCalculate[0]; 
        //     double valueOneDouble = Double.parseDouble(valueOne);  

        //     String valueThree = toCalculate[2]; 
        //     double valueThreeDouble = Double.parseDouble(valueThree); 

        //     String operation = toCalculate[1]; 

        //     switch(operation){
        //         case "+" -> { calculated = valueOneDouble + valueThreeDouble; }
        //         case "-" -> { calculated = valueOneDouble - valueThreeDouble; }
        //         case "*" -> { calculated = valueOneDouble * valueThreeDouble; }
        //         case "/" -> { calculated = valueOneDouble / valueThreeDouble; }
        //         default -> System.out.println("Please input a valid operation: '+ or - or * or / ");
        //     }

        //     calculatedString = Double.toString(calculated); 
        //     System.out.println(calculatedString);
        // }
    }
}