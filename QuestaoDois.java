package Lista7;
import java.util.ArrayList;
/* Utilizando listas faça um programa que
 faça 5 perguntas para uma pessoa sobre um crime. 
 As perguntas são:"Telefonou para a vítima?""Esteve no local do crime?""Mora perto da vítima?"
"Devia para a vítima?""Já trabalhou com a vítima?" 
O programa deve no final emitir uma classificação
 sobre a participação da pessoa no crime.
  Se a pessoa responder positivamente a 2 questões
   ela deve ser classificada como "Suspeita", entre 3 e 4 como "Cúmplice" e 5 como "Assassino".
    Caso contrário, ele será classificado como "Inocente".*/
    import java.util.Scanner;
    import java.util.ArrayList;
public class QuestaoDois {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> respo = new ArrayList<>();

        System.out.println("Responda sim ou nao para as perguntas abaixo ");
        System.out.println("Telefonou para a vítima?");
        respo.add(scanner.nextLine());
        System.out.println("Esteve no local do crime?");
        respo.add(scanner.nextLine());
        System.out.println("Mora perto da vítima?");
        respo.add(scanner.nextLine());
        System.out.println("Devia para a vítima?");
        respo.add(scanner.nextLine());
        System.out.println("Já trabalhou com a vítima?");
        respo.add(scanner.nextLine());

        int respoSim = 0;
        for (String escolha : respo){
            if (escolha.equalsIgnoreCase("sim")){
                respoSim++;
            }
        }if (respoSim == 2){
            System.out.println("Possivel SUSPEITO(a).");
        }else if (respoSim ==3 || respoSim == 4){
            System.out.println("Possivel CUMPLICE.");
        }else if (respoSim == 5){
            System.out.println("ASSASSINO, pode dar voz de prisao!!!");
        }else{
            System.out.println("inocente!!");
        }
        scanner.close();
    }    
}