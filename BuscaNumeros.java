import java.util.Scanner;

public class BuscaNumeros {
    public static void main(String[] args) {
        
        int [] numbers = new int[10];

        for(int i=0;i<numbers.length;i++){
            numbers[i] = (int)(Math.random()*10);
            System.out.println(numbers[i]);
        }
        System.out.println("Digite um número:");
        Scanner teclado = new Scanner(System.in);
        int busca = teclado.nextInt();

        boolean encontrando = false;
        for(int i=0; i<numbers.length;i++){
            if(numbers[i] == busca){
                System.out.println("Achou");
                encontrando = true;
                break;
            //}else{
        //System.out.println("Não achou");
    }
        }
    }
}