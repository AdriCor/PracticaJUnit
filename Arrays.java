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
	 * metodo para calcular la mediana (si el numero es par utilizamos
	 * los dos numeros centrales, si es impar, solamente el numero central)
	 * @param array del que calcular el maximo
	 * @return numero maximo
	 */
	public static double mediana(int[] array) {
		Arrays.sort(array);
		double mediana;
		int mitad = array.length / 2;
		if (array.length % 2 == 0) {
			mediana = (double) (array[mitad - 1] + array[mitad]) / 2;
		} else {
			mediana = (double) array[mitad];
		}
		return mediana;
	}
	
	
	
	
	
	
	
	
}