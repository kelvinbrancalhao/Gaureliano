
package geuleriano;
import java.util.Scanner;

public class Geuleriano {
    public static void main(String[] args) {
        Scanner entVal = new Scanner(System.in); 
        int cVertices, i, j, impar;
        char fProg = 's';
        while(fProg != 'n'){
            System.out.print("Quantos vertices tem o grafo? => ");
            cVertices = entVal.nextInt();
            int[] vertice = new int[cVertices];
            j = 0;
            impar = 0;
            for(i = 0; i < cVertices; i++){
                j++;
                System.out.print("Qual o grau do vertice " + j + ": ");
                vertice[i] = entVal.nextInt();
                if(vertice[i]%2 != 0){
                    impar++;
                }
            }
            if(impar == 2 || impar == 0){
                System.out.println("Este Grafo possui Caminho Euleriano!");
            } else {
                System.out.println("Este Grafo não possui Caminho Euleriano!");
            }
            System.out.println("Dejesa continuar testando os Grafos[S/N]? ");
            fProg = (char)entVal.next().charAt(0);
        }
    }
    
}
