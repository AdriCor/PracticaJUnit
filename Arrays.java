package Arrays;
public abstract class Arrays{
	int [] Array;
	/**
	 * Metodo que calcula media aritmetica del array
	 * @param array del que calcular la media
	 * @return media aritmetica
	 */
	public static double media(int array[]) {
		int suma = 0;
		for (int i = 0; i < array.length; i++) {
			suma = suma + array[i];
		}
		double media = (double) suma / array.length;
		return media;
	}
	/**
	 * metodo para calcular el valor maximo
	 * @param array del que calcular el maximo
	 * @return numero maximo
	 */
	public static int maximo(int[] array) {
		int maximo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (maximo < array[i]) {
				maximo = array[i];
			}
		}
		return maximo;
	}
	/**
	 * metodo para calcular el valor minimo
	 * @param array de l que calcular el minimo
	 * @return valor minimo
	 */
	public static int minimo(int[] array) {
		int minimo = array[0];
		for (int i = 1; i < array.length; i++) {
			if (minimo > array[i]) {
				minimo = array[i];
			}
		}
		return minimo;
	}
	
	
	
	
	
	
	
	
	
}