public class Algoritmos {
    public int comprobarUltimo(ListaOrdinal lista){
        int resultado;
        if(lista.vacia())
            resultado= 0;
        else{
            Iterador it = lista.getIterador();
            int ultimo= it.next();
            int numElementos= 0;
            while(it.hasNext()){
                ultimo= it.next();
                numElementos++;
            }
            if(ultimo==numElementos)
                return  0;
            else if(ultimo<numElementos)
                return -1;
            else
                return 1;
        }
        return resultado;
    }

    public ListaOrdinal interseccion(ListaOrdinal lista1, ListaOrdinal lista2){
        ListaOrdinal listaResultado = new ListaOrdinal();
        Iterador it = lista1.getIterador();
        while(it.hasNext()){
            int elemento= it.next();
            if(lista2.contiene(elemento) && !listaResultado.contiene(elemento))
                listaResultado.insertar(elemento);
        }
        return listaResultado;
    }


}
