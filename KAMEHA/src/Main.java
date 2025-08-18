public class Main {
    public static void main(String[] args) {

        produto c1 = new produto();

        c1.setNome("Maçã");
        c1.setPreco(5.5);


        System.out.println("Nome: " + c1.getNome());
        System.out.println("Preço: R$ " + c1.getPreco());
    }
}