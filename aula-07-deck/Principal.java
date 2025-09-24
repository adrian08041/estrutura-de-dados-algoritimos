public class Principal {

    public static void main(String[] args) {
        Deque<Integer> deque = new Deque<Integer>();

        deque.addInicio(1);
        deque.addInicio(2);
        deque.addFinal(3);
        deque.addFinal(4);
        System.out.println(deque);

        deque.removeInicio();
        System.out.println(deque);

        deque.removeFinal();
        System.out.println(deque);

        deque.removeInicio();
        deque.removeFinal();
        System.out.println(deque);

        deque.removeInicio();
    }
    
}
