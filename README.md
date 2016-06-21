# Example Weather app

* This is an example program GetWeatherData using the bare minimum java instalation

# Build

Compile the two sources make sure the json jar file is in the class path
* javac -cp json-20160212.jar:. weather.java GetWeatherData.java

# Run

Run the program make sure the json jar in in the class path
* java -cp json-20160212.jar:. weather SFO
* java -cp json-20160212.jar:. weather JFK
* java -cp json-20160212.jar:. weather DEN
