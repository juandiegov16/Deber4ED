/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber4ed;

import java.util.Arrays;

/**
 *
 * @author Juandi
 * @param <E>
 */
public class ArrayStack<E> {
    public static final int CAPACIDAD = 10;
    static Object eliminarBase (ArrayStack s){
        Object tope =  s.pop();
        if (s.isEmpty()){return tope;}
        else {
            Object base = eliminarBase(s);
            s.push(tope);
            return base;
        }        
    }
    //Escribir el método estático reemplazarElementos que tenga como argumentos
    //una pila de enteros y dos números (buscar y reemplazo), de forma que todas
    //las apariciones del número 'buscar' en la pila sean reemplazadas por el número
    // de reemplazo.
    static void reemplazarElementos(ArrayStack s, int n1, int n2){}
    private E[] data;
    private int t = -1;
    public ArrayStack() {this(CAPACIDAD);}
    public ArrayStack(int capacity) {
        data = (E[]) new Object[capacity];    
    }    
    public int size() {return (t+1);}    
    public boolean isEmpty() {return (t == -1);}    
    public void push(E e) throws IllegalStateException {
        if (size() == data.length) throw new IllegalStateException("Pila está llena.");
        data[++t] = e;    
    }
    public E top(){
        if (isEmpty()) return null;
        return data[t];
    }
    public E pop(){
        if (isEmpty()) return null;
        E answer = data[t];
        data[t] = null;
        t--;
        return answer;
    }
    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    
}
