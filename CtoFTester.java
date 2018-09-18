public class CtoFTester{
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(7));
    System.out.println(celsiusToFahrenheit(7.0));
    System.out.println(celsiusToFahrenheit(30));
    System.out.println(celsiusToFahrenheit(30.0));
    System.out.println(farenheitToCelcius(44.6));
    System.out.println(farenheitToCelcius(80));
    System.out.println(farenheitToCelcius(86));
    System.out.println(farenheitToCelcius(-5));
    System.out.println(farenheitToCelcius(celsiusToFahrenheit(5)));
    System.out.println(celsiusToFahrenheit(farenheitToCelcius(5)));
  }
  public static double celsiusToFahrenheit(double celcius){
    return celcius * 1.8 + 32;
  }
  public static double farenheitToCelcius(double farenheit){
    return (farenheit - 32) / 1.8;
  }
}
