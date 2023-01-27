package sdf;


import java.io.Console;

public class Main{
    public static void main(String[] args) { 
        Console cons = System.console(); 
        System.out.println("Welcome.");
        String calculations = cons.readLine(">"); 
         
        if(calculations.equalsIgnoreCase("Exit")){
        System.out.println("Bye bye");
        } 
        else {
            String[] toCalculate = calculations.trim().split(" "); 
            
            String valueOne = toCalculate[0]; 
            double valueOneDouble = Double.parseDouble(valueOne);  

            String valueThree = toCalculate[2]; 
            double valueThreeDouble = Double.parseDouble(valueThree); 

            String operation = toCalculate[1]; 

            String calculatedString;
            double result;

            switch(operation){
                case "+": 
                result = valueOneDouble + valueThreeDouble;          
                calculatedString = Double.toString(result); 
                System.out.println(calculatedString);
                break; 

                case "-":
                result = valueOneDouble - valueThreeDouble;
                calculatedString = Double.toString(result); 
                System.out.println(calculatedString);
                break; 

                case "*":
                result = valueOneDouble * valueThreeDouble;
                calculatedString = Double.toString(result); 
                System.out.println(calculatedString);
                break; 

                case "/":
                result = valueOneDouble / valueThreeDouble;
                calculatedString = Double.toString(result); 
                System.out.println(calculatedString);
                break; 

                default:
                System.out.println("Please input a valid operation: '+ or - or * or / ");
                break; 
            }

  
        } 
    }
}