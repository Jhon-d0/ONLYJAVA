package atividade1;

public class Principal {
    public static void main(String[] args) {
        livro c1 = new livro();

        c1.setNome("Angel and Demon");
        c1.setPaginas(533);

        System.out.println("o livro " + c1.getNome() + " tem " + c1.getPaginas() + " Paginas");
    }
}
