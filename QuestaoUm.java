package Lista7;
/*Faça um programa que receba a temperatura
 média de cada mês do ano e armazene-as em uma lista.
  Após isto, calcule a média anual das temperaturas
   e mostre todas as temperaturas acima da média anual,
    e em que mês elas ocorreram
     (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro, . . . ). */
import java.util.Scanner;
import java.util.ArrayList;
public class QuestaoUm {
    public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            ArrayList<Double>[] tempMes = new ArrayList[12];
            String[] meses = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio",
             "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};            
            for(int i=0; i<12; i++){
                tempMes[i] = new ArrayList<>();
            }for(int i=0; i<12; i++){
                System.out.print("Infofrme a temperatura media de " + meses[i] + ": ");
                double temp = scanner.nextDouble();
                tempMes[i].add(temp);
            }double soma = 0;
            for(ArrayList<Double> lista : tempMes){
                for(double temp : lista){
                    soma += temp;
                }
            }double mediaAnual = soma/12;
            System.out.println("\nTemperaturas acima da média anual (" + soma/12 + "):");
            for(int i=0; i<12; i++){
                for(double temp : tempMes[i]){
                    if(temp > mediaAnual){
                        System.out.println("Mes " + meses[i] + ": " + temp);
                    }
                }
            scanner.close();
            }
        }
    }