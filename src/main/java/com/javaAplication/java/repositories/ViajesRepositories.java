package com.javaAplication.java.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javaAplication.java.models.BusesViajesInfoModel;

public interface ViajesRepositories extends JpaRepository<BusesViajesInfoModel, Long> 
{

}
