package packFusionar2ArraysOrdenadosEnListaCircular;



public class DoubleCircularLinkedList {// Estekadura bikoitzeko zerrenda zirkularra ordenan

    private class DoubleNode {
        String data;
        DoubleNode prev;
        DoubleNode next;

        public DoubleNode(String s){
            data = s;
        }
    }

    DoubleNode first;




    public void añadirAlFinal(String s ){
        DoubleNode nuevo = new DoubleNode(s);





    }

    private void copiarRestantes(String[] s, int i){
        // copiar los valores del array s desde la posición i




    }


    public void fusionarSecuencias(String[] s1, String[] s2){
        //Pre: las secuencias s1 y s2 están ordenadas ascendentemente
        //Post: se devolverá una lista circular doblemente enlazada con los elementos de s1 y s2. Esta lista estará ordenada ascendentemente.
        this.first = null;
        int i1 = 0;
        int i2 = 0;







    }

    public void print(){
        if (first == null){}
        else{
            System.out.println(first.data);
            DoubleNode unekoa = first.next;
            while (unekoa != first){
                System.out.println(unekoa.data);
                unekoa = unekoa.next;
            }
        }
    }

    public static void main(String[] args) {
        String[] s1 = {"ama", "oso"};
        String[] s2 = {};
        String[] s3 = {"aba", "eba", "ema", "pao", "zao"};
        DoubleCircularLinkedList l = new DoubleCircularLinkedList();
        l.fusionarSecuencias(s1, s2);
        System.out.println("Prueba 1. Debería dar: (ama, oso) ");
        l.print();

        l.fusionarSecuencias(s1, s3);
        System.out.println("Prueba 2. Debería dar: (aba, ama, eba, ema, oso, pao, zao) ");
        l.print();

        String[] s4 = {"col", "oir", "pan"};
        String[] s5 = {"ama", "gas", "mar", "rio", "zar"};
        l.fusionarSecuencias(s4, s5);
        System.out.println("Prueba 3. Debería dar: (ama, col, gas, mar, oir, pan, rio, zar) ");
        l.print();

    }
}
