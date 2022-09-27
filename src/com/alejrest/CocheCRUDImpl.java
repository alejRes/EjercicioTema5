package com.alejrest;

public class CocheCRUDImpl implements CocheCRUD{
    @Override
    public void save() {
        System.out.println("Metodo save() implementado");
    }

    @Override
    public void findAll() {
        System.out.println("Metodo findAll() implementado");
    }

    @Override
    public void delete() {
        System.out.println("Metodo delete() implementado");
    }
}
