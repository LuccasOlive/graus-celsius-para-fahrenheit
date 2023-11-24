public class Main {
   // Projeto de Graus Celsius em Fahrenheit
    public static void main(String[] args) {
        double temEmCelsius = 12.8;
        // Usei a temperadura me
        double temEmFahrenheit = (temEmCelsius * 1.8) + 32;

        String mensagem = String.format("A temperatura de %f Celsius é equivalente a %f Fahrenheit", temEmCelsius, temEmFahrenheit);

        System.out.println(mensagem);

        int tempEmFahrenheirtInteira = (int) temEmFahrenheit;
        System.out.println("A temperatura em Fahrenheit inteira é: " + tempEmFahrenheirtInteira);

        System.out.println("Só quero fazer um testes rapido, tenho que ver se vai ser atualizado no Git. ");
        System.out.println("fazendo testes. ");

    }
}