import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
        Operacoes n1 = new Operacoes();
        String continuar = "s";
        while (continuar.equals("S") || continuar.equals("s")){
            n1.getNumero1();
            n1.getNumero2();
            n1.getOperador();
            n1.retornar();
            System.out.printf("Deseja fazer outra operação? \n");
            continuar = leitor.next();
        }

    }
}