package elhassanmahmoud.rezeptapp;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rezept {

    @JsonProperty
    private Long id;

    @JsonProperty
    private String titel;

    @JsonProperty
    private String beschreibung;
}
//