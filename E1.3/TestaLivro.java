
public class TestaLivro {
	public static void main(String[] args) {
		
		// lista extraída de https://www.amazon.com/Best-Sellers-Books/zgbs/books, 03/10/2023 às 14:00
		
		Livro livro1 = new Livro();
		livro1.setTitulo("Iron Flame");
		livro1.setAutor("Rebecca Yarros");
		livro1.setEditora("Entangled: Red Tower Books");
		livro1.setAno(2023);
		
		Livro livro2 = new Livro();
		livro2.setTitulo("Going Infinite: The Rise and Fall of a New Tycoon");
		livro2.setAutor("Michael Lewis");
		livro2.setEditora("W. W. Norton & Company");
		livro2.setAno(2023);
		
		Livro livro3 = new Livro();
		livro3.setTitulo("8 Little Planets: A Solar System Book for Kids with Unique Planet Cutouts");
		livro3.setAutor("Chris Ferrie");
		livro3.setEditora("Sourcebooks Explore");
		livro3.setAno(2018);
		
		System.out.println("Livro 1:");
		System.out.println(livro1.getTitulo());
		System.out.println(livro1.getAutor());
		System.out.println(livro1.getEditora() + ", " + livro1.getAno() + "\n");
		
		System.out.println("Livro 2:");
		System.out.println(livro2.getTitulo());
		System.out.println(livro2.getAutor());
		System.out.println(livro2.getEditora() + ", " + livro2.getAno() + "\n");
		
		System.out.println("Livro 3:");
		System.out.println(livro3.getTitulo());
		System.out.println(livro3.getAutor());
		System.out.println(livro3.getEditora() + ", " + livro3.getAno() + "\n");
	}
}
