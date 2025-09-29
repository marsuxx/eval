/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evalhashmap;

/**
 *
 * @author ituani
 */
public class Emprunt {

    private String titre;
    private String date;

    @Override
    public String toString() {
        return "Emprunt{" + "titre=" + titre + ", date=" + date + '}';
    }

    public String getTitre() {
        return titre;
    }

    public String getDate() {
        return date;
    }

    public Emprunt(String titre, String date) {
        this.titre = titre;
        this.date = date;
    }   
}

