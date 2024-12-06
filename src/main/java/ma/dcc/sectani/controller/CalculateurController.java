package ma.dcc.sectani.controller;

import ma.dcc.sectani.entity.Nombres;
import ma.dcc.sectani.service.CalculService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Somme")
public class CalculateurController {
    private final CalculService calculService;

    public CalculateurController(CalculService calculService) {
        this.calculService = calculService;
    }

    @GetMapping("/{N1}/{N2}")
    public int getSomme(@PathVariable int N1, @PathVariable int N2){
        Nombres nombres = new Nombres(N1,N2);
        return calculService.add(nombres);
    }
}
