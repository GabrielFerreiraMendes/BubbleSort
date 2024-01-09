import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        int[] listaNumeros = new int[]{100, 110, 50, 80, 10, 11, 15, 8, 9};
       

        for (int i = 0; i < listaNumeros.length; i++) {
            for (int j = 0; j < listaNumeros.length - 1; j++) {
                if (listaNumeros[j] >= listaNumeros[j + 1]) {
                    //Swap listaNumeros
                    int aux = listaNumeros[j];
                    listaNumeros[j] = listaNumeros[j + 1];
                    listaNumeros[j + 1] = aux;
                }
            }            
        }

        for(int i = 0; i < listaNumeros.length; i++)
        System.out.println(listaNumeros[i]);
    }
}
