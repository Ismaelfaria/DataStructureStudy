package array;

public class TwoPointer {

	public String reverseWords(String s) {
		// Nessa linha, separamos as palavras a cada espaço e as colocamos dentro de um
		// array de strings.
		String[] words = s.split("\\s+");
		// Nessa linha, instanciamos a classe 'StringBuilder', que nos permite usar o
		// método 'reverse()' da própria classe.
		StringBuilder reversed = new StringBuilder();
		// Nessa linha, criamos um 'for' aprimorado para iterar sobre os elementos
		// (palavras separadas) do array words.
		for (String word : words) {
			// Nessa linha, criamos outra instância de StringBuilder, porém passando uma
			// palavra a cada vez que o for iterar.
			StringBuilder reversedWord = new StringBuilder(word);
			// Nessa linha, aplicamos o método reverse(), revertendo assim a palavra da vez.
			reversedWord.reverse();
			// Nessa linha, adicionamos as palavras no StringBuilder 'reversed', aplicando
			// um espaço no final de cada palavra adicionada.
			reversed.append(reversedWord).append(" ");
		}
		// Nessa linha, convertemos o 'StringBuilder' para o tipo 'String' e removemos
		// os espaços presentes no início e no final da String.
		return reversed.toString().trim();
	}
}
