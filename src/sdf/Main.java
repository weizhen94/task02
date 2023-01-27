package sdf;


import java.io.Console;


public class Main{
    public static void main(String[] args) { 
        try { 
        Console cons = System.console(); 
        Boolean exit = false; 
        System.out.println("Welcome.");
        
         
        while (!exit) {
            String calculations = cons.readLine(">");

            if(calculations.equalsIgnoreCase("exit")) {
                exit = true; 
            }

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
                System.out.println("Please input 'number' followed by '+ or - or * or /' followed by 'number' ");
                break; 
            }
        } 
    } catch (NumberFormatException e){
        System.out.println("Bye bye");
    }
}
} 

