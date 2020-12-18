package com.example.aplicaciondepila.pila;

public class LinkedList {

    private Node head;
    private int largo;

    public LinkedList(){
        this.head = null;
        this.largo = 0;
    }

    public void addFirst(int dato){
        this.largo ++;
        if (this.head == null){
            this.head = new Node(dato);
        }
        else{
            Node tmp = this.head;
            this.head = new Node(dato);
            this.head.setNext(tmp);
        }
    }

    public void printL(){
        Node tmp = this.head;
        while (tmp != null){
            System.out.print("<"+tmp.getData()+">");
            tmp = tmp.getNext();
        }
        System.out.println();
        //System.out.println(this.largo);
    }
    public String getStack(){
        String out = "";
        Node tmp = this.head;
        while (tmp != null){
            out += "<"+tmp.getData()+">\n";
            tmp = tmp.getNext();
        }
        out += "\n";
        return out;
        //System.out.println(this.largo);
    }

    public void deleteFirst(){
        this.largo --;
        if (this.head != null){
            this.head = this.head.getNext();
        }
    }

    public Node getHead(){
        return this.head;
    }
}
