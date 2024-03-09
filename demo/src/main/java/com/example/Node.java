package com.example;

public class Node {
    private String name;
    private Node leftNode=null, rightNode=null;

    public Node(String name){
        this.name=name;
    }
    public Node(){}

    public boolean addName(String name){
        if(this.name==null) {
            this.name=name;
            return true;
        }
        if(name.compareTo(this.name)<0){
            if(leftNode==null) leftNode=new Node(name);
            else leftNode.addName(name);
            return true;
        }
        if(name.compareTo(this.name)>0){
            if(rightNode==null) rightNode=new Node(name);
            else rightNode.addName(name);
            return true;
        }
        return false;
    }

    public boolean findName(String name){
        if(this.name==name) return true;
        if(name.compareTo(this.name)>0){
            if(rightNode==null) return false;
            return rightNode.findName(name);
        }
        if(name.compareTo(this.name)<0){
            if(leftNode==null) return false;
            return leftNode.findName(name);
        }
        return false;
    }
}
