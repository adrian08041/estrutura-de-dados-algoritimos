public class Principal {
    public static void main(String[] args) {
        ListaDupla<String> lista = new ListaDupla<String>("Alunos");
        
        lista.addInicio("rafael");
        lista.addInicio("miguel");
        lista.addInicio("gabriel");
        lista.addFinal("asdfas");


        lista.addMeio("pedro", 2);
        lista.imprimeLista();



        lista.removeMeio(1);
        lista.imprimeLista();

        lista.removeMeio(2);

lista.imprimeLista();   

        /*  
        lista.imprimeLista();
        lista.removeInicio();
        lista.imprimeLista();
        lista.removeFinal(); */
    }
}