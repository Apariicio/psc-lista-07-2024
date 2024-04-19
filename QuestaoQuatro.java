package Lista7;
/*Utilize uma lista para resolver o problema a seguir. Uma empresa paga seus 
vendedores com base em comissões. O vendedor recebe $200 por semana 
mais 9% de suas vendas brutas daquela semana.  
Por exemplo, um vendedor que teve vendas brutas de $3000 em uma semana 
recebe $200 mais 9 por cento de $3000, ou seja, um total de $470.  
Escreva um programa (usando um array de contadores) que determine 
quantos vendedores receberam salários nos seguintes intervalos de valores: 
$200 - $299 
$300 - $399 
$400 - $499 
$500 - $599 
$600 - $699 
$700 - $799 
$800 - $899 
$900 - $999 
$1000 em diante */
import java.util.Scanner;
import java.util.ArrayList;
public class QuestaoQuatro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> vendBru= new ArrayList<>();

        System.out.println("Informe a quantidade de vendedores: ");
        int vendedores = scanner.nextInt();

        for(int i=0; i<vendedores; i++){
            System.out.println("Informe a venda bruta do vendedor " + (i) + ": ");
            double vendas = scanner.nextDouble();
            vendBru.add(vendas);
        }
        int[] contadores = new int[9];
        for(double vendas : vendBru){
            double salario = 200 + (0.09*vendas);
            if(salario>=200 && salario<300){
                contadores[0]++;
            }else if(salario>300 && salario<=400){
                contadores[1]++;
            }else if(salario>400 && salario<=500){
                contadores[2]++;
            }else if(salario>500 && salario<=600){
                contadores[3]++;
            }else if(salario>600 && salario<=700){
                contadores[4]++;
            }else if(salario>700 && salario<=800){
                contadores[5]++;
            }else if(salario>800 && salario<=900){
                contadores[6]++;
            }else if(salario>900 && salario<=1000){
                contadores[7]++;
            }else {
                contadores[8]++;
            }
        }
        System.out.println("Numero de vendedores em cada faixa salarial:");
        for(int i=0; i<9; i++){
            int faixaI = 200 + (i*100);
            int faixaF = faixaI + 99;
            if(i==8){
                System.out.println("$" + faixaI + " ou mais: " + contadores[i] + " vendedores");
            } else {
                    System.out.println("$" + faixaI + " - $" + faixaF + ": " + contadores[i] + " vendedores");
            }
        }
    scanner.close();
    }
}