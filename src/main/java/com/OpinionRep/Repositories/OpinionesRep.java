package com.OpinionRep.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.OpinionRep.Models.OpinionesModel;

@Repository
public interface OpinionesRep extends CrudRepository<OpinionesModel, Integer>{
     
}
