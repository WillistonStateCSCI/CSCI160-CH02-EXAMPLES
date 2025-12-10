/* Temperature Conversion
   Anderson, Franceschi
*/

public class TemperatureConversion
{
   public static void main( String [] args )
   {
      //***** 1. declare any constants here
	   final int FREEZING_TEMPERATURE_F = 32;
      final double CONVERSION_RATIO = ( double ) 5 / 9;
			
      //***** 2.  declare temperature in Fahrenheit as an int 
	   int fahrenheitTemperature;
      fahrenheitTemperature = 86;
	  		
      //***** 3. calculate equivalent Celsius temperature	
	   double celsiusTemperature;
	  	celsiusTemperature = CONVERSION_RATIO * ( fahrenheitTemperature - FREEZING_TEMPERATURE_F );
         
      //***** 4. output the temperature in Celsius
	   System.out.println( fahrenheitTemperature + " degrees F = " + celsiusTemperature + " degrees C" );
												  
      //***** 5. convert Celsius temperature back to Fahrenheit
		double calculateFahrenheitTemperature = celsiusTemperature / CONVERSION_RATIO + FREEZING_TEMPERATURE_F;
				
      //***** 6. output Fahrenheit temperature to check correctness 
		System.out.println( "The recalculated temperature in Fahrenheit is " + fahrenheitTemperature + " degrees F" );

				
   }
} 