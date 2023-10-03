
public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int ano;
	
	public void setTitulo(String umTitulo) {
		titulo = umTitulo;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setAutor(String umAutor) {
		autor = umAutor;
	}
	
	public String getAutor() {
		return autor;
	}
	
	public void setEditora(String umaEditora) {
		editora = umaEditora;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public void setAno(int umAno) {
		ano = umAno;
	}
	
	public int getAno() {
		return ano;
	}
	
	public String toString() {
		return "Titulo: " + titulo + "\nAutor(a): " + autor + "\nEditora: " + editora + "\nAno: " + ano + "\n";
	}
	
}
