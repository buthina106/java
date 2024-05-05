import java.util.function.Function;

public class Temperature {

    public static void main(String[] args) {
        Function<Double, Double> celsiusToFahrenheit = (celsius) -> (celsius * 9/5) + 32;
        double celsius = 20.0;
        double fahrenheit = celsiusToFahrenheit.apply(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
        
        celsius = 37.5;
        fahrenheit = celsiusToFahrenheit.apply(celsius);
        System.out.println(celsius + " degrees Celsius is equal to " + fahrenheit + " degrees Fahrenheit.");
    }
}
