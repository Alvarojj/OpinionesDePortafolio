package com.OpinionRep.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "opinion_repo")
public class OpinionesModel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_opinion;

    private String txt_opinion;

    public String getTxt_opinion(){
        return txt_opinion;
    }
    
}