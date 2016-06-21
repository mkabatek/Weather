/* TriHydro Weather Data Test Program weather.java 
 * Michael J Kabatek
 * 2016 06 21 
 * Takes one command line Arguemnt is 3 digit airport code
 * e.g weather JFK, or weather SFO
 */

public class weather {


   public static void main(String[] args) throws Exception
   {

     //create new GetWeatherData object
     //Must pass in 3 character weather data string
     //Uses API located here: http://services.faa.gov/docs/services/airport/
     GetWeatherData weatherData = new GetWeatherData(args[0]); 
          
     //Start test program
     System.out.println("###START TEST PROGRAM###");
     
     //Print output to the command line for test
     System.out.println("Visibility: " + weatherData.Visibility);
     System.out.println("Weather: "    + weatherData.Weather);
     System.out.println("Temp: "       + weatherData.Temp);
     System.out.println("Wind: "       + weatherData.Wind);

   }
}




