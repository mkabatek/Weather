/* TriHydro GetWeatherData.java
 * Michael J Kabatek
 * 2016 06 21 
 * Constructor runs the static function getHTML, and parses JSON response
 */


// imports for handling GET request from REST api, and parsing json response
import java.io.*;
import java.net.*;
import org.json.*;
import org.json.JSONObject;

public class GetWeatherData {
   
   //Declare varaibles for weather data
   public int Visibility;
   public String Weather;
   public String Temp;
   public String Wind;

   //Static function to initiate GET request
   public static String getHTML(String urlToRead) throws Exception {
      
      //StringBuilder to collect json string result from REST API
      StringBuilder result = new StringBuilder();
      
      //Using airport REST API from faa.gov
      String apiURL = "http://services.faa.gov/airport/status/";
      //query parameters to get json data back
      String formatURL = "?format=application/json";

      //concatinate strings to form URL for GET request
      URL url = new URL(apiURL + urlToRead + formatURL);

      //create connection object using above URL
      HttpURLConnection conn = (HttpURLConnection) url.openConnection();

      //Set connection method to GET request
      conn.setRequestMethod("GET");

      //Read the incoming stream
      BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
      String line;
      while ((line = rd.readLine()) != null) {
         result.append(line);
      }
      rd.close();
      return result.toString();
   }

        
   // Constructor take in AIRPORT_CODE
   GetWeatherData(String AIRPORT_CODE) {

      try{
         //create a new JSON object to parse incoming JSON string
         JSONObject obj = new JSONObject(getHTML(AIRPORT_CODE));
         //Assign member variables for the weather data.
         Visibility = obj.getJSONObject("weather").getInt("visibility");
         Weather    = obj.getJSONObject("weather").getString("weather");
         Temp       = obj.getJSONObject("weather").getString("temp");
         Wind       = obj.getJSONObject("weather").getString("wind");

       
      } catch(Exception e){
         //Catch the exception if something went wrong.
         System.out.println("Error parsing data.");
         //Print out error message
         System.out.println(e.getMessage());
         
      }
      
   }

 
}
