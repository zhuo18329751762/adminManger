package Test;

import Test.utils.CelsiusAndFahrenheit;

public class Test6_8 {
    public static void main(String[] args) {
        System.out.println("摄氏度\t华氏度\t\t华氏度\t摄氏度");
        double celsius=40.0;
        double fahrenheit=120.0;
        while (celsius>=31.0&&fahrenheit>=30.0){
            double f = CelsiusAndFahrenheit.celsiusToFahrenheit(celsius);
            double c = CelsiusAndFahrenheit.fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f\t%.2f\t\t%.2f\t%.2f\n",celsius,f,fahrenheit,c);
            celsius=celsius-1;
            fahrenheit=fahrenheit-10;
        }
    }
}
