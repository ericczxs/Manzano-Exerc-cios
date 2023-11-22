package exerciciosManzano;

public class Exercicio08 {

	public static void main(String[] args) {
		
		 System.out.println("Celsius   |   Fahrenheit");
	        System.out.println("------------------------");

	        for (int celsius = 10; celsius <= 100; celsius += 10) {
	            double fahrenheit = converterParaFahrenheit(celsius);
	            System.out.printf("%-9d |   %-9.2f\n", celsius, fahrenheit);
	        }
	    }

	   
	    private static double converterParaFahrenheit(int celsius) {
	        return (9.0 * celsius + 160.0) / 5.0;

	}

}
