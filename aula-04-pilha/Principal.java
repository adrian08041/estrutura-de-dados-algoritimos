public class Principal {

    public static void main(String[] args) {
        Pilha <String> pilha = new Pilha<String>
        ("letras");

        pilha.push("A");
        pilha.push("B");
        pilha.push("C");

        System.out.println("Dado" + pilha.pop() + "removido");
        pilha.imprimePilha();
    }
}