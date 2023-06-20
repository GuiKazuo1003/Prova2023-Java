package com.prova.prova_java.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prova.prova_java.entities.Empresas;

@Service
public class EmpresasService {
    public Empresas getEmpresasByID(int id){
        return EmpresasService.findByAll(id).orElseThrow(
            () -> new EntityNotFoundException("Fornecedor não encontrado")
        );
    }
    public List<Empresas> getFornecedor() {
        return Empresas.findAll();
    }
}
