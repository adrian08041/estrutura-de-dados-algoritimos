public class Principal {
    public static void main(String[] args) {
        Pilha<String> pilha = new Pilha<String>("letras");

        // empilha 3 linguagem
        pilha.push("Python");
        pilha.push("Java");
        pilha.push("JavaScript");

        // imprimindo pilha
        pilha.imprimePilha();

        // remove e mostra o topo
        String removido = pilha.pop();
        System.out.println("\nelemento removido do topo " + removido);

        // Mostra como ficou
        System.out.println("\nPilha apos remover:");
        pilha.imprimePilha();

        pilha.push("C#");
        pilha.push("Go");
        System.out.println("\nPilha após adicionar mais duas linguagens:");
        pilha.imprimePilha();
    }
}