/* This program is used to set and convert temperatures from Celsius and Fahrenheit, and compare them. Four temperatures are created via. constructors, then the 
 * user is asked to set the temperatures to any value they would like (as long as the scale is Fahrenheit or Celsius). After the four temperatures are adjusted,
 * the program then lists out them in both Fahrenheit and Celsius, then compares the temperatures between one another (after ensuring they have the same scale). 
 * Then, based on these comparisons, the program will output the results: "___ is/isn't equal to, less than, or greater than ___". The output, will, of course, 
 * depend on the return value of the methods equals, isLessThan, and isGreaterThan.
 * 
 * Author: Kylie Heiland
 * 
 * Title: Project 9
 * 
 * Date: 4/6/22
 * 
 */

import java.util.Scanner;
public class Temperature
{
    //Private variables
    private double degree;
    private char scale;
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        
        //FIRST TEMPERATURE
        
        
        Temperature temp1;
        
        //The first temperature has been created using the default constructor.
        temp1 = new Temperature(); 
        System.out.println("FIRST TEMPERATURE USING THE DEFAULT CONSTRUCTOR:");
        
        //Default degree: 0.0 and the default scale is C.
        System.out.println("The default degree is: " + temp1.degree + ". And the default scale is: " + temp1.scale + "."); 
        
        //Outputs the temperature of temp1 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the first temperature in Celsius is: %.2f", temp1.getDegreesInCelsius()); 
        System.out.println(" " + temp1.scale + ".");
        System.out.printf("The degree of the first temperature in Fahrenheit is: %.2f", temp1.getDegreesInFahrenheit());
        System.out.println(" " + temp1.scale + ".\n");
        
        
        //Has user input a degree and scale.
        
        
        System.out.println("Let's set the first temperature!\n" + "Enter a degree for the first temperature: ");
        
        //Individually sets the temperature's degree.
        temp1.setDegree(input.nextDouble()); 
        
        System.out.println("Now enter the temperature's scale (F/C): ");
        
        //Individually sets the temperature's scale.
        temp1.setDegree(input.next().charAt(0));
        
        //Tests that the scale is valid; exits the program if not.
        if(temp1.scale != 'F' && temp1.scale != 'f' && temp1.scale !='C' && temp1.scale != 'c')
        {
            System.out.print("Invalid scale. You must use either C/c or F/f.");
            System.exit(1);
        }
        
        //Outputs the temperature of temp1 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the first temperature in Celsius is now: %.2f", temp1.getDegreesInCelsius()); 
        System.out.println(" " + temp1.scale + ".");
        System.out.printf("The degree of the first temperature in Fahrenheit is now: %.2f", temp1.getDegreesInFahrenheit());
        System.out.println(" " + temp1.scale + ".\n");
        
        
        //SECOND TEMPERATURE
        
        
        Temperature temp2;
        
        //The second temperature has been created using the constructor with the double argument.
        temp2 = new Temperature(32); 
        System.out.println("SECOND TEMPERATURE USING THE CONSTRUCTOR WITH DOUBLE ARGUMENT:");
        
        //Degree is 32, scale C.
        System.out.println("The degree is: " + temp2.degree + ". And the default scale is: " + temp2.scale + "."); 
        
        //Outputs the temperature of temp2 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the second temperature in Celsius is now: %.2f", temp2.getDegreesInCelsius()); 
        System.out.println(" " + temp2.scale + ".");
        System.out.printf("The degree of the second temperature in Fahrenheit is now: %.2f", temp2.getDegreesInFahrenheit());
        System.out.println(" " + temp2.scale + ".\n");
        
        
        //Has user input a degree and scale.
        
        
        System.out.println("Let's set the second temperature!\n" + "Enter a degree for the second temperature: ");
        
        //Individually sets the temperature's degree.
        temp2.setDegree(input.nextDouble());
        
        System.out.println("Now enter the temperature's scale (F/C): ");
        
        //Individually sets the temperature's scale.
        temp2.setDegree(input.next().charAt(0));
        
        //Tests that the scale is valid; exits the program if not.
        if(temp2.scale != 'F' && temp2.scale != 'f' && temp2.scale !='C' && temp2.scale != 'c')
        {
            System.out.print("Invalid scale. You must use either C/c or F/f.");
            System.exit(1);
        }
        
        //Outputs the temperature of temp2 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the second temperature in Celsius is now: %.2f", temp2.getDegreesInCelsius()); 
        System.out.println(" " + temp2.scale + ".");
        System.out.printf("The degree of the second temperature in Fahrenheit is now: %.2f", temp2.getDegreesInFahrenheit());
        System.out.println(" " + temp2.scale + ".\n");
        
        
        //THIRD TEMPERATURE
        
        
        Temperature temp3;
        
        //The third temperature has been created using the constructor with the scale argument.
        temp3 = new Temperature('F'); 
        System.out.println("THIRD TEMPERATURE USING THE CONSTRUCTOR WITH CHAR ARGUMENT:"); 
        
        //Degree is 0.0, scale F.
        System.out.println("The default degree is: " + temp3.degree + ". And the scale is: " + temp3.scale + "."); 
        
        //Outputs the temperature of temp3 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the third temperature in Celsius is now: %.2f", temp3.getDegreesInCelsius()); 
        System.out.println(" " + temp3.scale + ".");
        System.out.printf("The degree of the third temperature in Fahrenheit is now: %.2f", temp3.getDegreesInFahrenheit());
        System.out.println(" " + temp3.scale + ".\n");
                          
        
        //Has user input a degree and scale.
        
        
        System.out.println("Let's set the third temperature!\n" + "Enter a degree for the third temperature: ");
        double a = input.nextDouble();
        System.out.println("Now enter the temperature's scale (F/C): ");
        char b = input.next().charAt(0);
        
        //Sets the degree and scale all at once.
        temp3.setDegree(a, b);
        
        //Tests that the scale is valid; exits the program if not.
        if(temp3.scale != 'F' && temp3.scale != 'f' && temp3.scale !='C' && temp3.scale != 'c')
        {
            System.out.print("Invalid scale. You must use either C/c or F/f.");
            System.exit(1);
        }
        
        //Outputs the temperature of temp3 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the third temperature in Celsius is now: %.2f", temp3.getDegreesInCelsius()); 
        System.out.println(" " + temp3.scale + ".");
        System.out.printf("The degree of the third temperature in Fahrenheit is now: %.2f", temp3.getDegreesInFahrenheit());
        System.out.println(" " + temp3.scale + ".\n");
        
        //FOURTH TEMPERATURE
        
        
        Temperature temp4;
        
        //The fourth temperature has been created using the constructor with the degree and scale arguments.
        temp4 = new Temperature(98.6, 'F'); 
        System.out.println("FOURTH TEMPERATURE USING THE CONSTRUCTOR WITH CHAR ARGUMENT:");
        
        //Degree is 98.6, scale is F.
        System.out.println("The degree is: " + temp4.degree + ". And the scale is: " + temp4.scale + "."); 
        
        //Outputs the temperature of temp4 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the fourth temperature in Celsius is now: %.2f", temp4.getDegreesInCelsius()); 
        System.out.println(" " + temp4.scale + ".");
        System.out.printf("The degree of the fourth temperature in Fahrenheit is now: %.2f", temp4.getDegreesInFahrenheit());
        System.out.println(" " + temp4.scale + ".\n");
        
        
        //Has user input a degree and scale.
        
        
        System.out.println("Let's set the fourth temperature!\n" + "Enter a degree for the fourth temperature: ");
        a = input.nextDouble();
        System.out.println("Now enter the temperature's scale (F/C): ");
        b = input.next().charAt(0);
        
        //Sets the degree and scale all at once.
        temp4.setDegree(a, b);
        
        //Tests that the scale is valid; exits the program if not.
        if(temp4.scale != 'F' && temp4.scale != 'f' && temp4.scale !='C' && temp4.scale != 'c')
        {
            System.out.print("Invalid scale. You must use either C/c or F/f.");
            System.exit(1);
        }
        
        //Outputs the temperature of temp4 in both Celsius and Fahrenheit with two decimal places.
        System.out.printf("The degree of the fourth temperature in Celsius is now: %.2f", temp4.getDegreesInCelsius()); 
        System.out.println(" " + temp4.scale + ".");
        System.out.printf("The degree of the fourth temperature in Fahrenheit is now: %.2f", temp4.getDegreesInFahrenheit());
        System.out.println(" " + temp4.scale + ".\n");
        
        //Outputs all temps converted as Celsius.
        System.out.printf("In order of creation, the temperatures in Celsius are: %.2f", temp1.getDegreesInCelsius());
        System.out.printf(", %.2f", temp2.getDegreesInCelsius());
        System.out.printf(", %.2f", temp3.getDegreesInCelsius());
        System.out.printf(", %.2f", temp4.getDegreesInCelsius());
        System.out.println();
        
        //Outputs all temps converted as Fahrenheit.
        System.out.printf("In order of creation, the temperatures in Fahrenheit are: %.2f", temp1.getDegreesInFahrenheit());
        System.out.printf(", %.2f", temp2.getDegreesInFahrenheit());
        System.out.printf(", %.2f", temp3.getDegreesInFahrenheit());
        System.out.printf(", %.2f", temp4.getDegreesInFahrenheit());
        System.out.println();
        
        //Adds some spacing.
        System.out.println();
        
        //Tests if temp1 equals temp2.
        if(temp1.equals(temp2))
        {
            System.out.println("temp1 is equal to temp2.");  
            if(!temp1.isGreaterThan(temp2) && !temp1.isLessThan(temp2)) //Makes sure that temp1 really is equal to temp2.
            {
                System.out.println("temp1 is not less than temp2.");
                System.out.println("temp1 is not greater than temp2.");
            }
        }
        else
        {
            System.out.println("temp1 is not equal to temp2.");
            //Tests if temp1 is greater or lesser than temp2.
            if(temp1.isLessThan(temp2))
            {
                System.out.println("temp1 is less than temp2.");
                if(!temp1.isGreaterThan(temp2)) //Makes sure that temp1 really is less than temp2 before outputting. 
                {
                    System.out.println("temp1 is not greater than temp2."); 
                }
                
            }
            else if(temp1.isGreaterThan(temp2)) //If temp1 is NOT less than temp2, this body is implemented.
            {
                System.out.println("temp1 is not less than temp2.");
                System.out.println("temp1 is greater than temp2.");
            }
        }
        
        
        //Adds some spacing.
        System.out.println();
        
        //Tests if temp1 equals temp3.
        if(temp1.equals(temp3))
        {
            System.out.println("temp1 is equal to temp3.");  
            if(!temp1.isGreaterThan(temp3) && !temp1.isLessThan(temp3)) //Makes sure that temp1 really is equal to temp3 before outputting.
            {
                System.out.println("temp1 is not less than temp3.");
                System.out.println("temp1 is not greater than temp3.");
            }
        }
        else
        {
            System.out.println("temp1 is not equal to temp3.");
            //Tests if temp1 is greater or lesser than temp3.
            if(temp1.isLessThan(temp3))
            {
                System.out.println("temp1 is less than temp3.");
                if(!temp1.isGreaterThan(temp3)) //Makes sure that temp1 really is less than temp3 before outputting. 
                {
                    System.out.println("temp1 is not greater than temp3."); 
                }
                
            }
            else if(temp1.isGreaterThan(temp3)) //If temp1 is NOT less than temp3, this body is implemented.
            {
                System.out.println("temp1 is not less than temp3.");
                System.out.println("temp1 is greater than temp3.");
            }
        }
        
        //Adds some spacing.
        System.out.println();
        
        //Tests if temp1 equals temp4.
        if(temp1.equals(temp4))
        {
            System.out.println("temp1 is equal to temp4.");  
            if(!temp1.isGreaterThan(temp2) && !temp1.isLessThan(temp4)) //Makes sure that temp1 really is equal to temp4.
            {
                System.out.println("temp1 is not less than temp4.");
                System.out.println("temp1 is not greater than temp4.");
            }
        }
        else
        {
            System.out.println("temp1 is not equal to temp4.");
            //Tests if temp1 is greater or lesser than temp4.
            if(temp1.isLessThan(temp4))
            {
                System.out.println("temp1 is less than temp4.");
                if(!temp1.isGreaterThan(temp4)) //Makes sure that temp1 really is less than temp4 before outputting. 
                {
                    System.out.println("temp1 is not greater than temp4."); 
                }
                
            }
            else if(temp1.isGreaterThan(temp4)) //If temp1 is NOT less than temp4, this body is implemented.
            {
                System.out.println("temp1 is not less than temp4.");
                System.out.println("temp1 is greater than temp4.");
            }
        }
        
        //Adds some spacing.
        System.out.println();
        
        //Tests if temp2 equals temp3.
        if(temp2.equals(temp3))
        {
            System.out.println("temp2 is equal to temp3.");  
            if(!temp2.isGreaterThan(temp3) && !temp2.isLessThan(temp3)) //Makes sure that temp2 really is equal to temp3.
            {
                System.out.println("temp2 is not less than temp3.");
                System.out.println("temp2 is not greater than temp3.");
            }
        }
        else
        {
            System.out.println("temp2 is not equal to temp3.");
            //Tests if temp2 is greater or lesser than temp3.
            if(temp2.isLessThan(temp3))
            {
                System.out.println("temp2 is less than temp3.");
                if(!temp2.isGreaterThan(temp3)) //Makes sure that temp2 really is less than temp3 before outputting. 
                {
                    System.out.println("temp2 is not greater than temp3."); 
                }
                
            }
            else if(temp2.isGreaterThan(temp3)) //If temp2 is NOT less than temp3, this body is implemented.
            {
                System.out.println("temp2 is not less than temp3.");
                System.out.println("temp2 is greater than temp3.");
            }
        }
        
        //Adds some spacing.
        System.out.println();
        
        //Tests if temp2 equals temp4.
        if(temp2.equals(temp4))
        {
            System.out.println("temp2 is equal to temp4.");  
            if(!temp2.isGreaterThan(temp4) && !temp2.isLessThan(temp4)) //Makes sure that temp2 really is equal to temp4.
            {
                System.out.println("temp2 is not less than temp4.");
                System.out.println("temp2 is not greater than temp4.");
            }
        }
        else
        {
            System.out.println("temp2 is not equal to temp4.");
            //Tests if temp2 is greater or lesser than temp4.
            if(temp2.isLessThan(temp4))
            {
                System.out.println("temp2 is less than temp4.");
                if(!temp2.isGreaterThan(temp4)) //Makes sure that temp2 really is less than temp4 before outputting. 
                {
                    System.out.println("temp2 is not greater than temp4."); 
                }
                
            }
            else if(temp2.isGreaterThan(temp4)) //If temp2 is NOT less than temp4, this body is implemented.
            {
                System.out.println("temp2 is not less than temp4.");
                System.out.println("temp2 is greater than temp4.");
            }
        }
        
        //Adds some spacing.
        System.out.println();
        
        //Tests if temp3 equals temp4.
        if(temp3.equals(temp4))
        {
            System.out.println("temp3 is equal to temp4.");  
            if(!temp3.isGreaterThan(temp4) && !temp3.isLessThan(temp4)) //Makes sure that temp3 really is equal to temp4.
            {
                System.out.println("temp3 is not less than temp4.");
                System.out.println("temp3 is not greater than temp4.");
            }
        }
        else
        {
            System.out.println("temp3 is not equal to temp4.");
            //Tests if temp3 is greater or lesser than temp4.
            if(temp3.isLessThan(temp4))
            {
                System.out.println("temp3 is less than temp4.");
                if(!temp3.isGreaterThan(temp4)) //Makes sure that temp3 really is less than temp4 before outputting. 
                {
                    System.out.println("temp3 is not greater than temp4."); 
                }
                
            }
            else if(temp3.isGreaterThan(temp4)) //If temp3 is NOT less than temp4, this body is implemented.
            {
                System.out.println("temp3 is not less than temp4.");
                System.out.println("temp3 is greater than temp4.");
            }
        }
        
    }

    //Constructors
    public Temperature()
    {
        degree = 0.0;
        scale = 'C';
    }
    public Temperature(double degree)
    {
        this.degree = degree;
        this.scale = 'C';
    }
    public Temperature(char scale)
    {
        this.degree = 0.0;
        this.scale = scale;
    }
    public Temperature(double degree, char scale)
    { 
        this.degree = degree;
        this.scale = scale;
    }
    
    //Accessor methods
    public double getDegreesInCelsius()
    {
        if(scale == 'F' || scale == 'f')
        { //If the scale is F/f, it will be converted to C.
            scale = 'C';
            degree = (degree - 32) * 5/9;
        }
        scale = 'C';
        return degree; //If it is already in Celsius, nothing is changed.
    }
    
    public double getDegreesInFahrenheit()
    {
        if(scale == 'C' || scale == 'c')
        { //If the scale is C/c, it will be converted to F.
            scale = 'F';
            degree = (1.8 * this.degree) + 32;
        }
        scale = 'F';
        return degree; //If the temperature is already in Fahrenheit.
    }
    
    //Mutator methods
    public void setDegree(double degree)
    { //Sets just the degree to what the user inputted and the scake to C.
        this.degree = degree;
    }
    public void setDegree(char scale)
    { //Sets just the scale to what the user inputted and the degree to its default: 0.0.
        this.scale = scale;
    }
    public void setDegree(double degree, char scale)
    { //Sets both the degree and scale to what the user inputted.
        this.degree = degree;
        this.scale = scale;
    }
    
    //Comparison methods
    public boolean equals(Temperature obj)
    {
        if(this.scale == 'F' || this.scale == 'f')
        { //Checks whether this' scale is Fahrenheit.
            if(obj.scale == 'F' || obj.scale == 'f')
            { //Tests whether obj's scale is Fahrenheit
                if(this.degree == obj.degree)
                { //If it is Fahrenheit, both degrees are compared with ease.
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            { //If obj is not Fahrenheit, it is converted then compared to this' degree.
                if(this.degree == obj.getDegreesInFahrenheit())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else if(this.scale == 'C' || this.scale == 'c')
        { //If this is Celsius, then the body is executed.
            if(obj.scale == 'C' || obj.scale == 'c')
            { //Tests to see if obj has same scale.
                if(this.degree == obj.degree)
                { //If on the same scale, both degrees are compared without any conversion.
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            { //If obj does not have the same scale, it is converted to Celsius and then compared.
                if(this.degree == obj.getDegreesInCelsius())
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false; //Will not be used, but there to make my compiler happy!    
    }
    
    public boolean isLessThan(Temperature obj)
    {
        if(this.scale == 'F' || this.scale == 'f')
        {//Checks if this scale is either Fahrenheit or Celsius.
            if(obj.scale == 'F' || obj.scale == 'f')
            { //Checks if obj has the same scale as this.
                if(this.degree < obj.degree)
                { //Compares whether this is less than obj.
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            { //Is implemented if obj does not have the same scale as this. 
                if(this.degree < obj.getDegreesInFahrenheit())
                { //Compares whether this is greater than obj which scale has been converted to Fahrenheit..
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else if(this.scale == 'C' || this.scale == 'c')
        { //Is implemented if this has a scale of Celsius.
            if(obj.scale == 'C' || obj.scale == 'c')
            { //If the obj has the same scale (C), then no conversion is necessary.
                if(this.degree < obj.degree)
                { //Compares whether this is less than obj.
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            { //If obj does not have the same scale:
                if(this.degree < obj.getDegreesInCelsius())
                { //Compares this with obj converted to Celsius.
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false; //Will not be used, but there to make my compiler happy!
    }
    
    public boolean isGreaterThan(Temperature obj)
    {
        if(this.scale == 'F' || this.scale == 'f')
        { //Checks if this scale is either Fahrenheit or Celsius.
            if(obj.scale == 'F' || obj.scale == 'f')
            { //Checks if obj has the same scale as this.
                if(this.degree > obj.degree)
                { //Compares whether this is greater than obj.
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            { //Is implemented if obj does not have the same scale as this.
                if(this.degree > obj.getDegreesInFahrenheit())
                { //Compares whether this is greater than obj which scale has been converted to Fahrenheit.
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        else if(this.scale == 'C' || this.scale == 'c')
        { //Is implemented if this has a scale of Celsius.
            if(obj.scale == 'C' || obj.scale == 'c')
            { //If the obj has the same scale (C), then no conversion is necessary.
                if(this.degree > obj.degree)
                { //Compares whether this is greater than obj.
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            { //If obj does not have the same scale:
                if(this.degree > obj.getDegreesInCelsius())
                { //Compares this with obj converted to Celsius.
                    return true;
                }
                else
                {
                    return false;
                }
            }
        }
        return false; //Will not be used; there to make my compiler happy!
    }
}
/* OUTPUT:
FIRST TEMPERATURE USING THE DEFAULT CONSTRUCTOR:
The default degree is: 0.0. And the default scale is: C.
The degree of the first temperature in Celsius is: 0.0 C.
The degree of the first temperature in Fahrenheit is: 32.0 F.

Let's set the first temperature!
Enter a degree for the first temperature: 
100
Now enter the temperature's scale (F/C): 
d
Invalid scale. You must use either C/c or F/f.



FIRST TEMPERATURE USING THE DEFAULT CONSTRUCTOR:
The default degree is: 0.0. And the default scale is: C.
The degree of the first temperature in Celsius is: 0.00 C.
The degree of the first temperature in Fahrenheit is: 32.00 F.

Let's set the first temperature!
Enter a degree for the first temperature: 
77
Now enter the temperature's scale (F/C): 
c
The degree of the first temperature in Celsius is now: 77.00 C.
The degree of the first temperature in Fahrenheit is now: 170.60 F.

SECOND TEMPERATURE USING THE CONSTRUCTOR WITH DOUBLE ARGUMENT:
The degree is: 32.0. And the default scale is: C.
The degree of the second temperature in Celsius is now: 32.00 C.
The degree of the second temperature in Fahrenheit is now: 89.60 F.

Let's set the second temperature!
Enter a degree for the second temperature: 
77
Now enter the temperature's scale (F/C): 
F
The degree of the second temperature in Celsius is now: 25.00 C.
The degree of the second temperature in Fahrenheit is now: 77.00 F.

THIRD TEMPERATURE USING THE CONSTRUCTOR WITH CHAR ARGUMENT:
The default degree is: 0.0. And the scale is: F.
The degree of the third temperature in Celsius is now: -17.78 C.
The degree of the third temperature in Fahrenheit is now: 0.00 F.

Let's set the third temperature!
Enter a degree for the third temperature: 
25
Now enter the temperature's scale (F/C): 
c
The degree of the third temperature in Celsius is now: 25.00 C.
The degree of the third temperature in Fahrenheit is now: 77.00 F.

FOURTH TEMPERATURE USING THE CONSTRUCTOR WITH CHAR ARGUMENT:
The degree is: 98.6. And the scale is: F.
The degree of the fourth temperature in Celsius is now: 37.00 C.
The degree of the fourth temperature in Fahrenheit is now: 98.60 F.

Let's set the fourth temperature!
Enter a degree for the fourth temperature: 
100 
Now enter the temperature's scale (F/C): 
C
The degree of the fourth temperature in Celsius is now: 100.00 C.
The degree of the fourth temperature in Fahrenheit is now: 212.00 F.

In order of creation, the temperatures in Celsius are: 77.00, 25.00, 25.00, 100.00
In order of creation, the temperatures in Fahrenheit are: 170.60, 77.00, 77.00, 212.00

temp1 is not equal to temp2.
temp1 is not less than temp2.
temp1 is greater than temp2.

temp1 is not equal to temp3.
temp1 is not less than temp3.
temp1 is greater than temp3.

temp1 is not equal to temp4.
temp1 is less than temp4.
temp1 is not greater than temp4.

temp2 is equal to temp3.
temp2 is not less than temp3.
temp2 is not greater than temp3.

temp2 is not equal to temp4.
temp2 is less than temp4.
temp2 is not greater than temp4.

temp3 is not equal to temp4.
temp3 is less than temp4.
temp3 is not greater than temp4.



FIRST TEMPERATURE USING THE DEFAULT CONSTRUCTOR:
The default degree is: 0.0. And the default scale is: C.
The degree of the first temperature in Celsius is: 0.00 C.
The degree of the first temperature in Fahrenheit is: 32.00 F.

Let's set the first temperature!
Enter a degree for the first temperature: 
45
Now enter the temperature's scale (F/C): 
f
The degree of the first temperature in Celsius is now: 7.22 C.
The degree of the first temperature in Fahrenheit is now: 45.00 F.

SECOND TEMPERATURE USING THE CONSTRUCTOR WITH DOUBLE ARGUMENT:
The degree is: 32.0. And the default scale is: C.
The degree of the second temperature in Celsius is now: 32.00 C.
The degree of the second temperature in Fahrenheit is now: 89.60 F.

Let's set the second temperature!
Enter a degree for the second temperature: 
16
Now enter the temperature's scale (F/C): 
c
The degree of the second temperature in Celsius is now: 16.00 C.
The degree of the second temperature in Fahrenheit is now: 60.80 F.

THIRD TEMPERATURE USING THE CONSTRUCTOR WITH CHAR ARGUMENT:
The default degree is: 0.0. And the scale is: F.
The degree of the third temperature in Celsius is now: -17.78 C.
The degree of the third temperature in Fahrenheit is now: 0.00 F.

Let's set the third temperature!
Enter a degree for the third temperature: 
72
Now enter the temperature's scale (F/C): 
F
The degree of the third temperature in Celsius is now: 22.22 C.
The degree of the third temperature in Fahrenheit is now: 72.00 F.

FOURTH TEMPERATURE USING THE CONSTRUCTOR WITH CHAR ARGUMENT:
The degree is: 98.6. And the scale is: F.
The degree of the fourth temperature in Celsius is now: 37.00 C.
The degree of the fourth temperature in Fahrenheit is now: 98.60 F.

Let's set the fourth temperature!
Enter a degree for the fourth temperature: 
54
Now enter the temperature's scale (F/C): 
F
The degree of the fourth temperature in Celsius is now: 12.22 C.
The degree of the fourth temperature in Fahrenheit is now: 54.00 F.

In order of creation, the temperatures in Celsius are: 7.22, 16.00, 22.22, 12.22
In order of creation, the temperatures in Fahrenheit are: 45.00, 60.80, 72.00, 54.00

temp1 is not equal to temp2.
temp1 is less than temp2.
temp1 is not greater than temp2.

temp1 is not equal to temp3.
temp1 is less than temp3.
temp1 is not greater than temp3.

temp1 is not equal to temp4.
temp1 is less than temp4.
temp1 is not greater than temp4.

temp2 is not equal to temp3.
temp2 is less than temp3.
temp2 is not greater than temp3.

temp2 is not equal to temp4.
temp2 is not less than temp4.
temp2 is greater than temp4.

temp3 is not equal to temp4.
temp3 is not less than temp4.
temp3 is greater than temp4.
 */
