package aula20;
import java.util.Scanner;

public class Exer4 {
    public static void main(String[]args){ 
    Scanner scan = new Scanner (System.in);
    String [][] compromissos = new String[31][24]; // [dia] [hora]
    boolean sair = false;
    int opcao, dia=0,hora=0;;
    
    while(sair != true){
        
        System.out.println("Digite 1 para adiciona compromisso");
        System.out.println("Digite 2 para verificar compromisso");
        System.out.println("Digite 0 para sair");
        opcao = scan.nextInt();
        
        if(opcao == 1) {
            
            boolean diaValido = false;
            while(!diaValido){
            
            System.out.println("Entre com o dia do mês");
            dia = scan.nextInt();
            if(dia > 0 && dia <= 31){
                diaValido = true;
                
            }else {
                System.out.println("Invalido");
            }
            
            }
            
            boolean horaValida = false;
            while(!horaValida){
            
            System.out.println("Entre com a hora do compromisso");
            hora = scan.nextInt();
            if(hora > 0 && hora <= 24){
                horaValida = true;
                
            }else {
                System.out.println("Invalido");
            }
            
            }
            
            dia --;
            System.out.println("Entre com o compromisso");
            compromissos[dia][hora] = scan.next();
            
            
        }else if (opcao == 2){
            
            boolean diaValido = false;
            while(!diaValido){
            
            System.out.println("Entre com o dia do mês");
            dia = scan.nextInt();
            if(dia > 0 && dia <= 31){
                diaValido = true;
                
            }else {
                System.out.println("Invalido");
            }
            
            }
            
            boolean horaValida = false;
            while(!horaValida){
            
            System.out.println("Entre com a hora do compromisso");
            hora = scan.nextInt();
            if(hora > 0 && hora <= 24){
                horaValida = true;
                
            }else {
                System.out.println("Invalido");
            }
            
            }
            
            dia --;
            System.out.println("O compromisso agendado e ");
            System.out.println(compromissos[dia][hora]);

        }else if (opcao == 0){
            sair = true;
        }
        else {
            System.out.println("Invalido");;
        }
        
    }
    
    
    }
}
