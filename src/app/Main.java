package app;

public class Main {
    public static void main(String[] args) {
        System.out.println("Converter App.");
        System.out.println("App for temperature converting.");
        System.out.println("Version 1.0.");
    }

    // Фаренгейт в Цельсії
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

}
