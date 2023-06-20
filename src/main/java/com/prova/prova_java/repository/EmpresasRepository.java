package com.prova.prova_java.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prova.prova_java.entities.Empresas;

public interface EmpresasRepository extends JpaRepository <Empresas, Integer>{
    
}
