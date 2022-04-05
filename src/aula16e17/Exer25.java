package aula16e17;
import java.util.Scanner;

public class Exer25 {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        boolean sair = false; String continuarCompra; int qtdProdutos; double preco;
        double total = 0; String output; double valorPago, troco;

        do {
            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.nextLine();
            if(continuarCompra.equalsIgnoreCase("S")){
                output = "Lojas tabajaras\n";
                System.out.println("Digite a quantidade de produtos na compra");
                qtdProdutos = scan.nextInt();
                for(int i = 0; i<qtdProdutos; i++){
                System.out.println("Informe o preco do produto " + (i+1));
                preco = scan.nextDouble();
                total += preco;
                output += "Produto" + i + ": R$ " + preco + "\n";
            }
                output =" total : R$ " + total ;
                System.out.println("total : R$ " + total +"\n");
                System.out.println("Entre com valor pago");
                valorPago = scan.nextDouble();
                output += "Dinheiro: R$ " + valorPago + "\n";
                troco = total-valorPago;
                output += "troco: R$ " + troco;
                System.out.println(output);
     
            }else {
                sair = true;
            }
            
        } while(!sair);
        
    }
}
