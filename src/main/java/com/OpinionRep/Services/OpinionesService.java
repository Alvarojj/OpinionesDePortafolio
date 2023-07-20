package com.OpinionRep.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.OpinionRep.Models.OpinionesModel;
import com.OpinionRep.Repositories.OpinionesRep;

@Service
public class OpinionesService {

    @Autowired
    OpinionesRep opinionesRep;


    public OpinionesModel guardarOpinion(OpinionesModel opinion){
        return opinionesRep.save(opinion);
    }
}
