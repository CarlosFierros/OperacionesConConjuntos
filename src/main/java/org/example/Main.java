package org.example;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashSet<String> letras = new HashSet<String>();
        HashSet<String> numeros = new HashSet<String>();

        //a
        letras.add("a");
        letras.add("b");
        letras.add("c");

        //b
        numeros.add("1");
        numeros.add("2");
        numeros.add("3");

        System.out.println("Operaciones con conjuntos entre A y B");
        System.out.println("a = {a,b,c} ");
        System.out.println("b = {1,2,3} ");
        System.out.println("");
        System.out.println("Unión: " + union(letras, numeros));
        System.out.println("Intersecion " + interseccion(letras, numeros));
        System.out.println("Diferencia " + diferencia(letras, numeros));
        System.out.println("Es subconjunto: " + EsSubConjunto(letras, numeros));
        System.out.println("Cartesiano: " + cartesiano(letras, numeros));
    }
    public static Set<String> union(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>(a);
        resultado.addAll(b);
        return resultado;
    }
    public static Set<String> interseccion(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>(a);
        resultado.retainAll(b);
        return resultado;
    }
    public static Set<String> diferencia(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>(a);
        resultado.removeAll(b);
        return resultado;
    }
    public static boolean EsSubConjunto(Set<String> a, Set<String> b) {
        return a.containsAll(b);
    }
    public static Set<String> cartesiano(Set<String> a, Set<String> b) {
        Set<String> resultado = new HashSet<>();
        for (String ElementoA : a) {
            for (String ElementoB : b) {
                resultado.add("(" + ElementoA + ", " + ElementoB + ")");
            }
        }
        return resultado;
    }
}