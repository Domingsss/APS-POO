package aps_poo;

public class Emprestimo extends EmprestimoAbstrato{
	public Emprestimo(Livro livro, Membro membro, String dataEmprestimo) {
		super(livro, membro, dataEmprestimo);
		livro.Emprestar();
	}
	
	@Override
	public void retornoLivro(String dataRetorno) {
		this.dataRetorno = dataRetorno;
		livro.retornoLivro();
	}
}
