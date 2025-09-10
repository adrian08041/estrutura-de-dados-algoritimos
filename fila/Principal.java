public class Principal {

    public static void main(String[] args) {
        Fila<Integer> fila = new Fila<Integer>("numeros inteiros");
        fila.enfileirar(1);
        fila.enfileirar(2);
        fila.enfileirar(3);
        
        
        fila.imprimeFila();
        System.out.println("dado" + fila.desinfileirar() + "removido");
        fila.imprimeFila();


    }
}