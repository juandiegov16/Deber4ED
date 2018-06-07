/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deber4ed;

/**
 *
 * @author Juandi
 * @param <E>
 */
public class ArrayStack<E>{
    public static final int CAPACITY = 1000;
    private E[] data;
    private int t = -1;
    public ArrayStack() {this(CAPACITY);}
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
    
    
}
