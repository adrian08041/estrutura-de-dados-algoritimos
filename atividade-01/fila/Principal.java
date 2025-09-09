



public class Principal {
   public static void main (String [] args){

    Fila fila = new Fila();

    fila.addFila("Ana");
    fila.addFila("Bruno");
    fila.addFila("Carlos");

    fila.mostrar();

    String removido = fila.removeInicio();
    System.out.println("Aluno removido: " + removido);


    fila.mostrar();

    fila.addFila("Daniela");
    fila.addFila("Eduardo");

    fila.mostrar();

   }

   


}
