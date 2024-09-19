/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author BLACK
 */
public class DemoKonversiSuhu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KonversiSuhu konversiSuhu = new KonversiSuhu();
        KonversiSuhu2 konversiSuhu2 = new KonversiSuhu2();

        // Contoh konversi dari Celsius
        double celcius = 25;
        double fahrenheit = konversiSuhu.celciusToFahrenheit(celcius);
        double reamur = konversiSuhu.celciusToReamur(celcius);
        
        System.out.println(celcius + "°C = " + fahrenheit + "°F");
        System.out.println(celcius + "°C = " + reamur + "°R");

        // Contoh konversi dari Fahrenheit
        double fahrenheitValue = 77;
        double reamurFromFahrenheit = konversiSuhu2.fahrenheitToReamur(fahrenheitValue);
        
        System.out.println(fahrenheitValue + "°F = " + reamurFromFahrenheit + "°R");
    }
    
}
