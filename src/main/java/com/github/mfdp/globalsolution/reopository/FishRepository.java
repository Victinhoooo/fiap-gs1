package com.github.mfdp.globalsolution.reopository;

import com.github.mfdp.globalsolution.model.Peixes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface FishRepository extends JpaRepository<Peixes, String> {

}