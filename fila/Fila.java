public class Fila <T> {

    private No<T> primeiroNo;
    private No<T> ultimoNo;
    private String nomeFila;
    
    public Fila(){
        this("");
    }
    
    public Fila( String nomeFila){
        this.nomeFila = nomeFila;
        primeiroNo= null;
        ultimoNo = null;

    }
    public void enfileirar(T dado){
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo ==null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else{
            ultimoNo.setNextNo(novoNo);
            ultimoNo = novoNo;
         }
    }


 public T desinfileirar (){
        if (primeiroNo==null) {
            System.out.println("fila vazia");
            return null;
        }
            T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getNextNo();
            if (primeiroNo== null) {
                ultimoNo = null;
                
            } return dadoTemp;
           
         
    }
    public void imprimeFila(){
        if (primeiroNo == null) {
            System.out.println("fila vazia");
            
        } else{
            System.out.println("dados da fila");
            No<T> aux = primeiroNo;

            while (aux != null) {
                System.out.println( aux.toString());
                aux = aux.getNextNo();
                
            }
            System.out.println();
        }
       
    
    }
}