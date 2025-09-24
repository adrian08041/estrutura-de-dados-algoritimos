public class Deque<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private int tamanho;
    private String nomeDeque;

    public Deque() {
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
        this.nomeDeque = nomeDeque;
    }

    public void atualizaIndice() {
        NoDuplo<T> atual = primeiroNo; 
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
    }

      public void addInicio(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        if (primeiroNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setProximoNo(primeiroNo);
            primeiroNo.setAnteriorNo(novoNo);
            primeiroNo = novoNo;
        }

        atualizaIndice(); 
        tamanho++;
    }

    public void addFinal(T dado) {
        NoDuplo<T> novoNo = new NoDuplo<T>(dado);

        if (ultimoNo == null) {
            primeiroNo = novoNo;
            ultimoNo = novoNo;
        } else {
            novoNo.setAnteriorNo(ultimoNo);
            ultimoNo.setProximoNo(novoNo);
            ultimoNo = novoNo;
        }

        atualizaIndice();
        tamanho++;
    }
    
     public void removeInicio(){
        if(primeiroNo == null){
            System.out.println("Listavazia!");
        }else{
            System.out.println("Dado: " + primeiroNo.getDado() + " removido!");
            //T dadoTemp = primeiroNo.getDado();
            primeiroNo = primeiroNo.getProximoNo();
            if(primeiroNo != null){
                primeiroNo.setAnteriorNo(null);
            }else{
                ultimoNo = null;
            }
        }
        atualizaIndice();
        tamanho--;
    }

    public void removeFinal(){
         if(ultimoNo == null){
            System.out.println("Lista vazia!");
        }else{
            System.out.println("Dado: " + ultimoNo.getDado() + " removido!");
            ultimoNo = ultimoNo.getAnteriorNo();
            if(ultimoNo != null){
                ultimoNo.setProximoNo(null);
            }else{
                primeiroNo = null;
            }
            tamanho--;
        }
    }
}
