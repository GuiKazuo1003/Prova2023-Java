package com.prova.prova_java.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prova.prova_java.repository.EmpresasRepository;

@RequestMapping("empresas")
@RestController
@Controller
public class EmpresasController {

    @Autowired
    

    @GetMapping

    public ResponseEntity <List<Empresas>> getEmpresas() {
        
        List<Empresas> clients = EmpresasRepository.getEmpregados();
        return ResponseEntity.ok().body(clients);
    }
}
