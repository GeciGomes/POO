public class ConversorTemperatura {

    // Requisito 1: Atributo pertencente à classe (static) e imutável (final)
    public static final double KELVIN_OFFSET = 273.15;

    // Requisito 2 e 3: Métodos estáticos que retornam valores em ponto flutuante (double)
    public static double celsiusParaFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32.0;
    }

    public static double fahrenheitParaCelsius(double fahrenheit) {
        return (fahrenheit - 32.0) * 5.0 / 9.0;
    }

    // Requisito 4: Classe interna estática para testes
    public static class TesteConversor {

        public static void main(String[] args) {
            double tempCelsius = 25.0;
            double tempFahrenheit = 77.0;

            // Testando a constante
            System.out.println("Offset Kelvin: " + ConversorTemperatura.KELVIN_OFFSET);

            // Testando os métodos estáticos sem instanciar a classe externa
            double fahrenheitResultado = ConversorTemperatura.celsiusParaFahrenheit(tempCelsius);
            System.out.println(tempCelsius + " °C = " + fahrenheitResultado + " °F");

            double celsiusResultado = ConversorTemperatura.fahrenheitParaCelsius(tempFahrenheit);
            System.out.println(tempFahrenheit + " °F = " + celsiusResultado + " °C");
        }
    }
}