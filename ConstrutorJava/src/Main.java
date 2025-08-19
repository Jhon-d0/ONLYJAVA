public class Main {
    public static void main(String[] args) {

        cliente c1 = new cliente("Carla", 18);


//        c1.setNome("Carla");
//        c1.setIdade(18);


        System.out.println("Meu nome é: " + c1.getNome());
        System.out.println("Minha idade é: " + c1.getIdade());

    }
}