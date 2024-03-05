import java.util.Scanner;

public class Operacoes {

    private double numero1 = 0;
    private double numero2 = 0;
    private String  operador;
    static String continuar = "S";

    Scanner leitor = new Scanner(System.in);


    public Operacoes(){
        this.numero1 = 0;
        this.numero2 = 0;
    }


    public double getNumero1(){
        System.out.printf("Digite o primeiro número: ");
        this.numero1 = leitor.nextDouble();

        return this.numero1;
    }

    public double getNumero2(){
        System.out.printf("\nDigite o segundo número: ");
        this.numero2 = leitor.nextDouble();

        return this.numero2;
    }

    public String getOperador() {
        System.out.printf("\nDigite qual operação deseja (+,-,*,/): ");
        this.operador = leitor.next();
        return this.operador;
    }

    public void retornar(){

        switch (this.operador) {
            case ("+") :{
                System.out.printf("------------------------------------\n");
                System.out.println("A soma dos números é:  \n" + (this.numero1 + this.numero2));
                System.out.printf("------------------------------------");
                break;
            }

            case ("-"): {
                System.out.printf("------------------------------------\n");
                System.out.println("A subtração dos números é: \n" + (this.numero1 - this.numero2));
                System.out.printf("------------------------------------");
                break;
            }
            case ("*") :{
                System.out.printf("------------------------------------\n");
                System.out.println("A multiplicação dos números é: \n" + (this.numero1 * this.numero2));
                System.out.printf("------------------------------------");
                break;
            }
            case ("/"):{
                System.out.printf("------------------------------------\n");
                System.out.println("A divisão dos números é: \n" + (this.numero1 / this.numero2));
                System.out.printf("------------------------------------");
                break;
            }
            default:  {
                System.out.printf("------------------------------------\n");
                System.out.println("Operação inválida\n");
                System.out.printf("------------------------------------");
                break;
            }
        }


    }


}
