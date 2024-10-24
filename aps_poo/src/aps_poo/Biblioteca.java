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
	
	public void emprestarLivro(Livro livro, String nomeMembro, String dataEmprestimo) {
	    if (livro.getDisponibilidade()) {
	        EmprestimoAbstrato emprestimo = new Emprestimo(livro, nomeMembro, dataEmprestimo);
	        listaEmprestimos.add(emprestimo);
	        livro.setDisponibilidade(false);
	    } else {
	        System.out.println("O livro não está disponível!");
	    }
	}

	public void retornoLivro(Livro livro, String dataRetorno) {
	    for (int i = 0; i < listaEmprestimos.size(); i++) {
	        EmprestimoAbstrato emprestimo = listaEmprestimos.get(i);
	        if (emprestimo.getLivro().equals(livro) && emprestimo.getDataRetorno() == null) {
	            emprestimo.retornoLivro(dataRetorno);
	            livro.setDisponibilidade(true); 
	            System.out.println("Livro devolvido: " + livro.getTitulo());
	            listaEmprestimos.remove(i);
	            return; 
	        }
	    }
	    System.out.println("Empréstimo não encontrado para o livro: " + livro.getTitulo());
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
