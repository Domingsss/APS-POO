package aps_poo;

public abstract class EmprestimoAbstrato {
	protected Livro livro;
	protected Membro membro;
	protected String dataEmprestimo;
	protected String dataRetorno;
	
	public EmprestimoAbstrato(Livro livro, Membro membro, String dataEmprestimo) {
		this.livro = livro;
		this.membro = membro;
		this.dataEmprestimo = dataEmprestimo;	
		this.dataRetorno = null;
	}
	
	public abstract void retornoLivro(String dataRetorno);
	
	public Livro getLivro() {
		return livro;
	}
	
	public Membro getMembro() {
		return membro;
	}
	
	public String getDataEmprestimo() {
		return dataEmprestimo;
	}
	
	public String getDataRetorno() {
		return dataRetorno;
	}
}
