package com.example.aplicaciondepila.pila;

public class Node {

    private int dato;
    private Node next;
    private Node prev;

    public Node(int dato){
        this.dato = dato;
        this.next = null;
        this.prev = null;
    }

    public Node getNext(){
        return this.next;
    }

    public void setNext(Node next){
        this.next = next;
    }

    public void setPrev(Node prev){
        this.prev = prev;
    }

    public Node getPrev(){
        return this.prev;
    }

    public int getData(){
        return this.dato;
    }

}