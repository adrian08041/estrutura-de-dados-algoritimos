public class ListaDupla<T> {
    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;
    private String nomeLista;
    private int tamanho;

    public ListaDupla(String nomeLista) {
        this.nomeLista = nomeLista;
        this.primeiroNo = null;
        this.ultimoNo = null;
        this.tamanho = 0;
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

        atualizaIndice(); // Atualiza os índices após inserção
        tamanho++;
    }

    public void atualizaIndice() {
        NoDuplo<T> atual = primeiroNo; // Corrigido de noDuplo para NoDuplo
        int indice = 0;
        while (atual != null) {
            atual.setIndice(indice);
            atual = atual.getProximoNo();
            indice++;
        }
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

        atualizaIndice(); // Atualiza os índices após inserção
        tamanho++;
    }

    public void imprimeLista() {
        if (primeiroNo == null) {
            System.out.println("Lista vazia");
        } else {
            System.out.println("Dados da lista: " + nomeLista);
            NoDuplo<T> aux = primeiroNo; // Corrigido de No<T> para NoDuplo<T>
            while (aux != null) {
                System.out.println(aux);
                aux = aux.getProximoNo();
            }
        }
    }

    public void removeInicio(){
       if (primeiroNo==null) {
            System.out.println("fila vazia");
           
        }else{
            System.out.println("dado: " + primeiroNo.getDado() + "removido!");

            primeiroNo = primeiroNo.getProximoNo();
            if (primeiroNo != null) {
                primeiroNo.setAnteriorNo(null);
                
            }else{
                ultimoNo = null;
            }

            atualizaIndice();
            tamanho--;
            
    }  
    public void removeFinal(){
        if (ultimoNo == null) {
            System.out.println("lista vazia");
            
        }else{
            System.out.println("dado: " + ultimoNo.getDado() + "removido");
            ultimoNo = ultimoNo.getAnteriorNo();
        }
            if (ultimoNo != null) {
                ultimoNo.setProximoNo(null);
                
            }else{
                primeiroNo = null;
            }
            
        }

        
    }

    
}
}