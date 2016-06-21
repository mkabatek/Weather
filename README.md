# Example Weather app

This is an example program GetWeatherData using the bare minimum java instalation
* This app uses the FAA airport info API [services.faa.gov](http://services.faa.gov/docs/services/airport/)
* List of [Airport Codes](http://www.airportcodes.org/), working codes depend on [services.faa.gov](http://services.faa.gov/docs/services/airport/), some codes in the list return NULL.



# Build

Compile the two sources make sure the json jar file is in the class path:

## Linux

* javac -cp json-20160212.jar:. weather.java GetWeatherData.java

## Windows

* javac -cp "json-20160212.jar;." weather.java GetWeatherData.java

# Run

Run the program, make sure the json jar is in the class path, examples shown below:

## Linux

* java -cp json-20160212.jar:. weather SFO
* java -cp json-20160212.jar:. weather JFK
* java -cp json-20160212.jar:. weather DEN


## Windows

* java -cp "json-20160212.jar;." weather SFO
* java -cp "json-20160212.jar;." weather JFK
* java -cp "json-20160212.jar;." weather DEN


