import java.util.Scanner;
public class convertorDeTemperaturaApp {
    double celsius;
    double kelvin;
    double fahrenheit;

    public void obeterDadosDeTemperatura(){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Vamos lá me fala qual a temperatura está agora em Celsius?");
        celsius = leitor.nextDouble();

        System.out.println("Muito bem, agora espera um minutinho que vou calcular para você");
        calcularConversorDeTemperatura();
    }

    public void calcularConversorDeTemperatura(){
        kelvin = celsius+ 275.15;
        fahrenheit = (celsius*1.8)+32;

        exibirResultadosDoConversor();
    }

    public void exibirResultadosDoConversor(){
        System.out.println("olha é o segunte.");
        System.out.println("O graus Celsius " + celsius + " que você falou convertido é o seguinte:");
        System.out.println("Em Kelvin deu: " + kelvin + ".");
        System.out.println("Em Fahrenheit deu: " + fahrenheit + ".");
        System.out.println("Espero ter ajudado, tenha um bom dia");
    }
}
