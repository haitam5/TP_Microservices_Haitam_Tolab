package org.emsi.Voitures.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Client {
    private Long Id;
    private String Nom;
    private Float Age;
}
