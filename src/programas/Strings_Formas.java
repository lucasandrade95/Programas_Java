package programas;

public class Strings_Formas {

	public static void main(String[] args) {
		
		String s = "potato apple lemon";
		
		String[] vect = s.split(" "); // Guarda cada palavra em um vetor
		
		System.out.println(vect[0]); // Imprime primeira palavra (potato)
		System.out.println(vect[1]); // Imprime segunda palavra  (apple)
		System.out.println(vect[2]); // Imprime terceira palavra (lemon)
		
		
		String original = "abcde FGHIJ ABC abc DEFG ";
		
		String s01 = original.toLowerCase();        // Frase minuscula
		String s02 = original.toUpperCase();        // Frase maiuscula
		String s03 = original.trim();               // Sem excesso de espaçemento
		String s04 = original.substring(2);         // Recorta a partir de um momento
		String s05 = original.substring(2, 9);      // Recorta uma frase desejada
		String s06 = original.replace('a', 'x');    // Retira uma determinada letra 
		String s07 = original.replace("abc", "xy"); // Retira uma determinada frase
		
		int i = original.indexOf("bc");     // Primeira ocorrência da palavra desejada
		int j = original.lastIndexOf("bc"); // Última ocorrêncoa da palavra desejada 
		
		System.out.println("Original: -" + original + "-");
		System.out.println("toLowerCase: -" + s01 + "-");
		System.out.println("toUpperCase: -" + s02 + "-");
		System.out.println("trim: -" + s03 + "-");
		System.out.println("substring(2): -" + s04 + "-");
		System.out.println("substring(2, 9): -" + s05 + "-");
		System.out.println("replace('a', 'x'): -" + s06 + "-");
		System.out.println("replace('abc', 'xy'): -" + s07 + "-");
		System.out.println("Index of 'bc': " + i);
		System.out.println("Last index of 'bc': " + j);
		
		
		
		
	}
}
