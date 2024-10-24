package aps_poo;

public abstract class EmprestimoAbstrato {
	protected Livro livro;
	protected String nomeMembro;
	protected String dataEmprestimo;
	protected String dataRetorno;
	
	public EmprestimoAbstrato(Livro livro, String nomeMembro, String dataEmprestimo) {
		this.livro = livro;
		this.nomeMembro = nomeMembro;
		this.dataEmprestimo = dataEmprestimo;	
		this.dataRetorno = null;
	}

	public abstract void retornoLivro(String dataRetorno);
	
	public void mostrarInfo() {
		System.out.println(livro.getTitulo());
	}
	
	public Livro getLivro() {
		return livro;
	}
	
	public String getNomeMembro() {
		return nomeMembro;
	}
	
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public String getDataRetorno() {
		return dataRetorno;
	}
}
