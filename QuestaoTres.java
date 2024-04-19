package Lista7;
/*Faça um programa que leia um número indeterminado de valores
 correspondentes a notas, encerrando a entrada de dados quando
  for informado um valor igual a -1 (que não deve ser armazenado). Após esta entrada de dados, faça:
Mostre a quantidade de valores que foram lidos;
Exiba todos os valores na ordem em que foram informados, um ao lado do outro;
Exiba todos os valores na ordem inversa à que foram informados, um abaixo do outro;
Calcule e mostre a soma dos valores;
Calcule e mostre a média dos valores;
Calcule e mostre a quantidade de valores acima da média calculada;
Calcule e mostre a quantidade de valores abaixo de sete;
Encerre o programa com uma mensagem. */
import java.util.Scanner;
import java.util.ArrayList;
public class QuestaoTres {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> notas = new ArrayList<>();        

        System.out.println("POR FAVOR, INSIRA A NOTA" + "\n Mas atenção!!***\nSe a nota for -1 encerre:\n");
        double nota = scanner.nextDouble();
        while(true){            
            if(nota == -1)break;
            notas.add(nota);
            nota = scanner.nextDouble();            
            }            
            System.out.println("Foram lido um total de " + notas.size() + " notas.");
            System.out.println("As notas inseridas em ordem sao  " + notas + " ");
            System.out.println("As notas inseridas em ordem inversa sao " + notas.reversed() + "\n");            
            scanner.close(); 
            double soma = 0;
            for(double n : notas){                
                soma += n;
            }System.out.println("A soma dos valores e " + soma);            
            double media = soma / notas.size();
            System.out.println("A media das somas das notas inserida é " + media + "\n");
            System.out.println("As notas que estão acima da média sao: ");                       
            for(int i = 0; i < notas.size(); i++){
                if(notas.get(i) > media){
                    System.out.print(notas.get(i) + " ");
                }
            }System.out.println("\nAs notas inseridas que estão abaixo de 7 sao: ");
            for (double n : notas){
                if (n < 7){
                    System.out.print(n + " ");
                }
            }
        System.out.println("\n----OBRIGADO E VOLTE SEMPRE.----");                  
    }
}