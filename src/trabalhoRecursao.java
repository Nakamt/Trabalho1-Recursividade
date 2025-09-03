import java.util.Scanner;

public class trabalhoRecursao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = tamanhoCorreto(scanner);

        int[] vetor = new int[tamanho];
        insereValoresRecursao(vetor, 0, scanner);
        exibeRecursivo(vetor, 0);
    }

    public static int tamanhoCorreto(Scanner scanner) {
        System.out.println("Informe o tamanho do vetor: ");
            int tamanho = scanner.nextInt();
        if(tamanho <= 0){
            System.out.println("Digite um tamanho de vetor valido!");
            return(tamanhoCorreto(scanner));
        }
        return tamanho;
    }

    static void insereValoresRecursao(int[] vetor, int tamanho, Scanner scanner){
        if(tamanho >= vetor.length ){
            return;
        }
        System.out.println("Informe o valor da " + (tamanho+1) + "° posição: ");
        int valor = scanner.nextInt();
        vetor[tamanho] = valor;
        insereValoresRecursao(vetor, tamanho + 1, scanner);
    }

    public static int exibeRecursivo(int[] vetor, int tamanho){
        if(tamanho >= vetor.length ){
            return -1;
        }
        System.out.println((tamanho+1) +"° valor: " + vetor[tamanho]);
        return exibeRecursivo(vetor, tamanho + 1);
    }
}
