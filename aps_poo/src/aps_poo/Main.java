package aps_poo;

public class Main {

    public static void main(String[] args) {
        
        Biblioteca biblioteca = new Biblioteca();
        
        biblioteca.addLivro(new Livro("O Programador Pragmático", "Andrew Hunt"));
        biblioteca.addLivro(new Livro("O Código Limpo", "Robert C. Martin"));
        biblioteca.addLivro(new Livro("Entendendo algoritmos", "Aditya Y. Bhargava"));
        biblioteca.addLivro(new Livro("Lógica de Programação e Algoritmos com JavaScript", "Edécio Fernando Iepsen"));
        biblioteca.addLivro(new Livro("Estruturas de Dados e Algoritmos com Javascript", "Loianer Groner"));
        biblioteca.addLivro(new Livro("Java - Guia do Programador", "Peter Jandl Junior"));
        biblioteca.addLivro(new Livro("Como ser um programador melhor", "Pete Goodliffe"));
        biblioteca.addLivro(new Livro("Cientista da Computação Autodidata", "Cory Althoff"));
        
        biblioteca.registrarMembro(new Membro("João da Silva", 1));
        biblioteca.registrarMembro(new Membro("Lucas Gonçalves", 2));
        biblioteca.registrarMembro(new Membro("Gustavo Meireles", 3));
        biblioteca.registrarMembro(new Membro("Maicon Lima", 4));
        biblioteca.registrarMembro(new Membro("Wellington Santos", 5));

        imprimirTitulosLivros(biblioteca);
        
        imprimirNomesMembros(biblioteca);
       
        imprimirListaEmprestimos(biblioteca);
        
        realizarEmprestimo(biblioteca, "O Programador Pragmático", "João da Silva", "2024-10-20");
        realizarEmprestimo(biblioteca, "Java - Guia do Programador", "Lucas Gonçalves", "2024-10-21");
        realizarEmprestimo(biblioteca, "O Código Limpo", "Gustavo Meireles", "2024-10-23");
        realizarEmprestimo(biblioteca, "Como ser um programador melhor", "Maicon Lima", "2024-10-24");
        
        imprimirListaEmprestimos(biblioteca);
        
        System.out.println("\n");
        
        realizarRetorno(biblioteca, "O Programador Pragmático", "João da Silva", "2024-10-25");
        realizarRetorno(biblioteca, "Java - Guia do Programador", "Lucas Gonçalves", "2024-10-26");

        System.out.println("\n");
        
        imprimirListaEmprestimos(biblioteca);
    }
    
    public static void imprimirTitulosLivros(Biblioteca biblioteca) {
        System.out.println("\nTítulo dos livros:\n");
        for (Livro livro : biblioteca.getLivros()) {
            System.out.println(livro.getTitulo());
        }
        System.out.println("\n---------------------------------------------------");
    }
       
    public static void imprimirNomesMembros(Biblioteca biblioteca) {
        System.out.println("\nLista dos membros da biblioteca:\n");
        for (Membro membro : biblioteca.getMembros()) {
            System.out.println(membro.getNome());
        }
        System.out.println("\n---------------------------------------------------");
    }
    
    public static void realizarEmprestimo(Biblioteca biblioteca, String titulo, String nomeMembro, String dataEmprestimo) {
        for (Livro livro : biblioteca.getLivros()) {
            if (livro.getTitulo().equals(titulo)) {
                biblioteca.emprestarLivro(livro, nomeMembro, dataEmprestimo);
                return; 
            }
        }
        System.out.println("Livro não encontrado: " + titulo); 
    }

    public static void realizarRetorno(Biblioteca biblioteca, String titulo, String nomeMembro, String dataRetorno) {
    	for (Livro livro : biblioteca.getLivros()) {
            if (livro.getTitulo().equals(titulo)) {
                biblioteca.retornoLivro(livro, dataRetorno);
                return; 
            }
        }
        System.out.println("Livro não encontrado: " + titulo); 
    }

    public static void imprimirListaEmprestimos(Biblioteca biblioteca) {
        System.out.println("Lista de empréstimos:\n");
        for (EmprestimoAbstrato emprestimo : biblioteca.getEmprestimos()) {
            System.out.println("Membro: " + emprestimo.getNomeMembro() +
                               " | Livro: " + emprestimo.getLivro().getTitulo() +
                               " | Data de Empréstimo: " + emprestimo.getDataEmprestimo() +
                               " | Data de Retorno: " + (emprestimo.getDataRetorno() != null ? emprestimo.getDataRetorno() : "Não devolvido"));
        }
        System.out.println("\n---------------------------------------------------");
    }
}
