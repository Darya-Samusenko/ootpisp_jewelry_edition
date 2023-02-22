package com.example.ootpisp_jewelry_edition;

public class base_jew {
    String MeName;
    stone incr;
    double weight;
    Integer cost;
    Client customer;
}

class stone{
    String name;
    double size;
    private Integer selfcost;

    stone(){
        this(0,"",0);
    }
    stone(int sz, String nme, Integer money){
        this.name = nme;
        this.size = sz;
        this.selfcost = money;
    }
}
