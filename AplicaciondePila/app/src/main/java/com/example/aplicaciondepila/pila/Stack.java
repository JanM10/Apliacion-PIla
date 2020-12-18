package com.example.aplicaciondepila.pila;

public class Stack {
    private LinkedList list;

    public Stack(){
        list = new LinkedList();
    }

    public void push(int dato){
        try{
            this.list.addFirst(dato);
        }catch (Exception e){

        }

    }

    public void pop(){
        try{
            Node actualHead = this.list.getHead();
            this.list.deleteFirst();
        }catch (Exception e){

        }
        //return actualHead.getData();
    }

    public void printS(){
        this.list.printL();
    }

    public String getStack(){
        return this.list.getStack();
    }
}
