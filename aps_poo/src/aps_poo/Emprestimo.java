package aps_poo;

public class Emprestimo extends EmprestimoAbstrato{
	public Emprestimo(Livro livro, String nomeMembro, String dataEmprestimo) {
		super(livro, nomeMembro, dataEmprestimo);
		livro.Emprestar();
	}
	
	@Override
	public void retornoLivro(String dataRetorno) {
		this.dataRetorno = dataRetorno;
		livro.retornoLivro();
	}
}
