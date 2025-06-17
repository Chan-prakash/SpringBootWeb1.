package com.chan.demo;

import ch.qos.logback.core.net.SyslogOutputStream;

public class Alien {
    private int aid;

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public int getAid() {
        return aid;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                '}';
    }

    public void setAid(int aid) {
        this.aid = aid;
    }

    private String aname;

    public void display(int id ,String name){
        System.out.println("THE ID OF THE PERSON IS : "+ id);
        System.out.println("THE NAME OF THE PERSON IS : " + name);

    }


}
