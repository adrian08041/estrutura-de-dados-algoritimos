public class Principal {

    public static void main(String[] args) {
        Lista<String> lista = new Lista<String>("Alunos");
        
        

        lista.addInicio("Adrian");
        lista.addInicio("Fulano");
        lista.addFinal("Daniel");
        lista.imprimeLista();
        lista.removerInicio();
        lista.removeFinal();
    }
}

 