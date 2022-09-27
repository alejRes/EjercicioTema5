package com.alejrest;

public class Main {

    private static CocheCRUD cocheCRUD;

    public static void main(String[] args) {

        cocheCRUD = new CocheCRUDImpl();
        cocheCRUD.save();
        cocheCRUD.findAll();
        cocheCRUD.delete();
    }
}