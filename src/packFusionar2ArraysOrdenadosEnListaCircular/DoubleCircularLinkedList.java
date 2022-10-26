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

        if (first == null)
        {
            first = nuevo;
            first.next = nuevo;
            first.prev = nuevo;

        }
        else {
            first.prev.next = nuevo;
            nuevo.prev = first.prev;
            nuevo.next = first;
            first.prev = nuevo;
        }




    }

    private void copiarRestantes(String[] s, int i){
        // copiar los valores del array s desde la posición i
        while (i < s.length){
            añadirAlFinal(s[i]);
            i++;
        }
    }


    public void fusionarSecuencias(String[] s1, String[] s2){
        //Pre: las secuencias s1 y s2 están ordenadas ascendentemente
        //Post: se devolverá una lista circular doblemente enlazada con los elementos de s1 y s2. Esta lista estará ordenada ascendentemente.
        this.first = null;
        int i1 = 0;
        int i2 = 0;
        if (s1 == null && s2 == null){}
        else if(s1 == null){copiarRestantes(s2,i2);}
        else if (s2 == null){copiarRestantes(s1,i1);}
        else{
            while (i1 < s1.length && i2 < s2.length){
                if (s1[i1].compareTo(s2[i2]) < 0){
                    añadirAlFinal(s1[i1]);
                    i1++;
                }
                else{
                    añadirAlFinal(s2[i2]);
                    i2++;
                }
            }
            if (i1 < s1.length)
                copiarRestantes(s1, i1);
            else if (i2 < s2.length)
                copiarRestantes(s2,i2);
        }

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
