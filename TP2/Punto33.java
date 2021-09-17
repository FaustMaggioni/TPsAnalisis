import java.util.ArrayList;

public class Punto33 {
    public static void main(String[] args) {
        int[] a = {2,5,5,5};
        int[] b = {2,2,3,5,5,7};
        ArrayList<Integer> iguales = encontrarLista(a,b);
        System.out.println(iguales);
    }

    public static ArrayList<Integer> encontrarLista(int[] lista1, int[] lista2){
        ArrayList<Integer> res = new ArrayList<Integer>(); //1
        encontrarListaAux(lista1,lista2,res);
        /* if(lista1.length >= lista2.length){ // 3 + 1
            encontrarListaAux(lista1,lista2,res);
        }else{
            encontrarListaAux(lista2,lista1,res);
        }*/
        return res;
    }

    private static void encontrarListaAux(int[] mayor, int[] menor, ArrayList<Integer> res){
        int tam1 = mayor.length; //2
        int tam2 = menor.length; //2
        int j=0; // 1
        int i=0;//1
        int comps=0;//1
            while (j<tam2 && i<tam1){ // m * (14) + 3
                int elem1 = mayor[i]; // 2
                int elem2 = menor[j]; // 2
                comps++; // 2
                if(elem1 == elem2){ // 1 + 4
                    res.add(elem1);
                    j++;
                    i++;
                }else{
                    if(elem1 > elem2){
                        j++;
                    }else{
                        i++;
                    }
                }
            }
        System.out.println("comps: "+comps);
    }
}