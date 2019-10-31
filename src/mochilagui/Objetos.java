
package mochilagui;

 

import java.util.StringTokenizer;


public class Objetos {

    private int peso;
    private int beneficio;

    public Objetos(int peso, int beneficio) {

        this.peso = peso;
        this.beneficio = beneficio;
    }

    public Objetos() {
        peso = 0;
        beneficio = 0;
    }

    public int getPeso() {
        return peso;
    }

    public int getBeneficio() {
        return beneficio;
    }
//
//    public void ObtenirPesBenefici(String s) {
//
//        StringTokenizer st = new StringTokenizer(s, ",");       
//        peso = Integer.parseInt(st.nextToken());
//        beneficio = Integer.parseInt(st.nextToken());
//    }

    @Override
    public String toString() {

        return "Item {" + "peso = " + peso + ", valor = " + beneficio + '}';
    }

}