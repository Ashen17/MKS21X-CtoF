public class CtoFTester{
  public static void main(String[] args){
    System.out.println(celsiusToFahrenheit(7));
    System.out.println(celsiusToFahrenheit(7.0));
    System.out.println(celsiusToFahrenheit(30));
    System.out.println(celsiusToFahrenheit(30.0));
  }
  public static double celsiusToFahrenheit(double celcius){
    return celcius * 1.8 + 32;
  }
  public static double farenheitToCelcius(double farenheit){
    return (farenheit - 32) / 1.8;
  }
}
