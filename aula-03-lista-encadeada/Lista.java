public class Lista <T>{

    private String nomeLista;
    private No<T> primeiroNo;
    private No <T> ultimoNo;
    
    public Lista (){
        this("Lista");
    }
    
    public Lista (String nomeLista){
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo= null;
        }

    
    

    public void addInicio(T dado){
        No<T> novoNo = new No<T>(dado);
        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else{
           novoNo.setNextNo(primeiroNo); 
            primeiroNo = novoNo;       
        }
       

    }
    public void imprimeLista(){
        if(primeiroNo == null){
            System.out.println("Lista vazia");
        }else{
            System.out.println("dados da lista" + nomeLista);
            No<T> aux = primeiroNo;
            while (aux != null) {
                System.out.println(aux.getDado());
                aux = aux.getNextNO();
            }
        }
    }
      public void addFinal(T dado){
        No<T> novoNo = new No<T>(dado);
        if (ultimoNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else{
           ultimoNo.setNextNo(novoNo); 
            ultimoNo = novoNo;       
        }
    }

    public void removerInicio(){
        if(primeiroNo == null){
            System.out.println("lista vazia");
        } else{
            System.out.println("dado"+ primeiroNo.getDado() + "removido.");
            if(primeiroNo == ultimoNo){
                primeiroNo = null;
                ultimoNo = null;
            }else{
                primeiroNo = primeiroNo.getNextNO();
            }
            

        }
    }

    public void removeFinal(){
        if(ultimoNo == null){
            System.out.println("lista vazia");
        } else{
            System.out.println("dado"+ ultimoNo.getDado() + "removido.");
            No<T> aux = primeiroNo;
             while (aux.getNextNO() != ultimoNo ) {
               aux = aux.getNextNO();
            }
            ultimoNo = aux;
            aux.setNextNo(null);
            
                
        }
    }   
}