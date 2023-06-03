package Test.utils;

public class CelsiusAndFahrenheit {
    public static double celsiusToFahrenheit(double celsius){
        //摄氏度转华氏度
        return (9.0/5)*celsius+32;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        //摄氏度转华氏度
        return (5.0/9)*(fahrenheit-32);
    }
}
