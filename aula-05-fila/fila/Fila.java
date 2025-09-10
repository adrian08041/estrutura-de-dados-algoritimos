

public class Fila <T>{

    private ArrayList<String> nomeAlunos;

    
    public Fila() {
        nomeAlunos = new ArrayList<>();
    }
    
    public void addFila(String nome) {
        nomeAlunos.add(nome);
    }

    public String removeInicio() {
        if (nomeAlunos.isEmpty()) {
            System.out.println("Fila vazia!");
            return null;
        }
        return nomeAlunos.remove(0);
    }

    public void mostrar() {
        System.out.println("Fila: " + nomeAlunos);
    }
}
