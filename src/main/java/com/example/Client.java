package com.example;

public class Client 
{
    private String nom;
    private String city;
    private String adr;

    public Client(String nom, String city, String adr)
    {
        this.nom = nom;
        this.city = city;
        this.adr = adr;
    }

    public String getNom()
    {
        return this.nom;
    }

    public String getCity()
    {
        return this.city;
    }

    public String getAdr()
    {
        return this.adr;
    }
}
