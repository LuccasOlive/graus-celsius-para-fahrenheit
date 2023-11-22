public class Main {
   // Projeto de Graus Celsius em Fahrenheit
    public static void main(String[] args) {
        double temEmCelsius = 26.8;
        // Usei a temperadura me
        double temEmFahrenheit = (temEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temEmCelsius, temEmFahrenheit);

        System.out.println(mensagem);

        int tempEmFahrenheirtInteira = (int) temEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + tempEmFahrenheirtInteira);


    }
}