package elhassanmahmoud.rezeptapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rezepte")
public class RezeptController {

    @GetMapping
    public List<Rezept> getRezepte() {
        return List.of(
                new Rezept(1L, "Pfannkuchen", "Eier, Milch, Mehl"),
                new Rezept(2L, "Nudeln", "Tomatensoße und Parmesan")
        );
    }
}
