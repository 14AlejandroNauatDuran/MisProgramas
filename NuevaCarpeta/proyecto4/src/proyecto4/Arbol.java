
package proyecto4;

public class Arbol {
    
    Nodo raiz;
    public Arbol(){//constructor de iniciar el arbol
        raiz=null;
    }
    
    public void inserar(int i, Object valor){//creación del nodo
        Nodo n = new Nodo(i);//se asigna identificación al nodo
        n.contenido = valor;//se asigna lo que tendra almacenado dico nodo
        
        if(raiz==null){
            raiz=n;//si no hay nada, es el primero en llenarse
        }else{
            Nodo aux=raiz;//de lo contrario, se genera su descendiente
            while(aux!=null){
                n.padre = aux;//se crea el padre, con el valor antiguo de la raiz
                if(n.llave >= aux.llave){//compara las indentificación numero 2, para saber en que posición va
                    aux=aux.derecha;
                }else{
                    aux=aux.izquierda;
                }
            }
            
            if(n.llave < n.padre.llave){
                n.padre.izquierda = n;
            }else{
                n.padre.derecha = n;
            }
        }
    }
    
    public void recorrer(Nodo n){//recorrido del arbol entero
        if(n!=null){
            recorrer(n.izquierda);//empezando con los menores
            System.out.println("indice" + n.llave+ " valor " + n.contenido);
            recorrer(n.derecha);//hasta los mayores que la raiz
        }
    }

    public void valoresMay(){
        if(raiz!=null){
            Nodo n=raiz;
            while(n.derecha!=null){
                n=n.derecha;
                //System.out.println(n.llave+"..."+n.contenido);
                if((n.izquierda !=null) && (n.derecha !=null)){
                    //while(n.izquierda!=null){
                    //n=n.izquierda;
                    System.out.println(n.llave+"..."+n.contenido);
                    }
               // System.out.println(n.llave+"..."+n.contenido);
                }    
                          
            }
        }
    
    //buscador en forma recursiva, atraves de laindentificación que tiene el nodo
    public String buscar(int i){
        if(buscar(this.raiz, i)) return "encontrado";
        return "no encontrado";
    }
    //esta es la seccio´n de evaluación y recorrido
    private boolean buscar(Nodo n, int i){
        if(n!=null){
            if(n.llave == i) return true;
            boolean ok1 = buscar(n.izquierda, i);
            boolean ok2 = buscar(n.derecha, i);
            if((ok1 == true)||(ok2 == true)) return true;
            }
        return false;
    }

    
    //parte inicial, la creación de todos los conceptos del arbol
    private class Nodo{
        public Nodo padre;//puede ser padre o raiz, segun sea el caso
        public Nodo derecha;
        public Nodo izquierda;
        public int llave;//indentificación del nodo
        public Object contenido;//lo que el nodo almacenara
                
        public Nodo(int indice){//constructor
             llave = indice;
             derecha=null;
             izquierda=null;
             padre=null;
             contenido=null;
            }
    }
}
