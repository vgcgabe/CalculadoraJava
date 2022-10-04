package POO;

import java.util.HashMap;
import java.util.Scanner;

public class TesteNumero {
    public static void main(String[] args) {
        Numero n = new Numero();

        boolean continuar = true;

        Scanner scan = new Scanner(System.in);
        while (continuar) {
            double x = 0.0;
            double y = 0.0;
            int operacao = 0;

            System.out.println("Digite a operação que deseja realizar: "
                                +"\n 1 para Soma"
                                +"\n 2 para Subtração"
                                +"\n 3 para Multiplicação"
                                +"\n 4 para Divisão"
                                +"\n 0 para Encerrar o Programa"
            );

            operacao = scan.nextInt();

            if (operacao == 0) {
                continuar = false;
                return;
            }

            System.out.println("Informe o valor do primeiro numero: ");
            x = scan.nextDouble();

            System.out.println("Informe o valor do segundo numero: ");
            y = scan.nextDouble();

            

            switch(operacao) {
                case 1:
                    imprimeCalculadora(operacao, n.soma(x, y), x, y);
                    break;
                case 2:
                    imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                    break;
                case 3:
                    imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);   
                    break;
                case 4:
                    imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                    break;
                
                default:
                    break;
            }
        }

        scan.close();
    }

    static void imprimeCalculadora (int operacao, double resultado, double x, double y) {
        HashMap<Integer, String> mapOperacao = new HashMap<>();

        mapOperacao.put( 1, " somado");
        mapOperacao.put( 2, " subtraido");
        mapOperacao.put( 3, " multiplicado");
        mapOperacao.put( 4, " dividido");

        System.out.println("\nO resultado de " + x + mapOperacao.get(operacao) + " por " + 
                            y + " é igual a: " + resultado + "\n");
    }
}
