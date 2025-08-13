import java.util.ArrayList;

public class Principal{

    public static void main (String[] args){
        Pessoa obj1 = new Pessoa();
        Pessoa obj2 = new Pessoa("Joaquim", 2);
        Pessoa obj3 = new Pessoa("Maria", 4, 153l);
        obj3.setNome("Ana");
        obj3.setIdade(5);
        obj3.setCpf(222l);

        Professor objP = new Professor("carlos", 22, 33l, 2323232);
        Aluno objA = new Aluno("joao", 22, 33l, 2323232);

       

        
         
 
        //System.out.println(obj3.toString());
       // System.out.println(objP.toString());
        //System.out.println(objA.toString());

        ArrayList<Pessoa> listaP = new ArrayList<Pessoa>();
        listaP.add(obj1);
        listaP.add(obj2);
        listaP.add(obj3);
        
        //System.out.println(listaP.get(0).toString());
       // System.out.println(listaP.get(1).toString());
        //System.out.println(listaP.get(2).toString());

        for(Pessoa auxP : listaP){
            System.out.println(auxP.toString());

        }
    }

    
    
   
}