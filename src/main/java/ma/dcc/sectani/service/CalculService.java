package ma.dcc.sectani.service;

import ma.dcc.sectani.entity.Nombres;
import org.springframework.stereotype.Service;

@Service
public class CalculService {
    public int add(Nombres nombre){
        return nombre.getN1() + nombre.getN2() ;
    }
}
