package aps_poo;
import java.util.ArrayList;
import java.util.List;

class Biblioteca {
	private List<Livro> listaLivros = new ArrayList<>();
	private List<Membro> listaMembros = new ArrayList<>();
	private List<EmprestimoAbstrato> listaEmprestimos = new ArrayList<>();
	
	public void addLivro(Livro livro) {
		listaLivros.add(livro);
	}
	
	public void registrarMembro(Membro membro) {
		listaMembros.add(membro);
	}
	
	public void EmprestarLivro(Livro livro, Membro membro, String dataEmprestimo) {
		if (livro.getDisponibilidade()) {
			EmprestimoAbstrato emprestimo = new Emprestimo(livro, membro, dataEmprestimo);
			listaEmprestimos.add(emprestimo);
		} else {
			System.out.println("O livro não está disponível!");
		}
	}
	
	public void retornoLivro(Livro livro, String dataRetorno) {
		for(EmprestimoAbstrato emprestimo : listaEmprestimos) {
			if(emprestimo.getLivro().equals(livro) && emprestimo.getDataRetorno() == null) {
				emprestimo.retornoLivro(dataRetorno);
				break;
			}
		}
	}
	
	public List<Livro> getLivros(){
		return listaLivros;
	}
	
	public List<Membro> getMembros(){
		return listaMembros;
	}
	
	public List<EmprestimoAbstrato> getEmprestimos(){
		return listaEmprestimos;
	}
	
}
