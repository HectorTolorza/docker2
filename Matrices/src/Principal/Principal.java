package Principal;

import Matrices.MultiplicarMatrices;
import Matrices.SumaMatrices;
import Recursividad.FactorialIteractivo;
import Recursividad.FactorialRecursivo;
import Recursividad.Recursiva;

public class Principal {

	
	public static void main(String[] args) {
		SumaMatrices suma = new SumaMatrices();
		MultiplicarMatrices multiplicar = new MultiplicarMatrices();
		Recursiva re = new Recursiva();
		
		int[][] matriz1 = {
                {10, 5, 12},
                {98, 5, 6},
                {8, 4, 6},
        };
        int[][] matriz2 = {
                {8, 7, 5},
                {19, 56, 4},
                {8, 76, 90},
        };
       //suma.sumarMatrices(matriz1, matriz2);
        multiplicar.multiplicarMatrices(matriz1, matriz2);
        //re.recursivo();
        
	}

}
