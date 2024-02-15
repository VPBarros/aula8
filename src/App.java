import java.util.Scanner;

public class App {

    ///Logica de Programação Estrutura Repetitiva
		// Enquanto = While(não se sabe previamente quantas vezes a repetiçao será realizada)
		//V= executa e volta F= pula fora
    public static void main(String[] args) throws Exception {
        System.out.println("Digite os numeros e programa imprimirá se e decresente ou crescente: ");
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();
		while(X != Y) {
			if(X < Y) {
				System.out.println("numeros crescente");
			}
			else {
				System.out.println("numeros decresente");
			}
			X = sc.nextInt();
			Y = sc.nextInt();
		}
        sc.close();
    }
}
