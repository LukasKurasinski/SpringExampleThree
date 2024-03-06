package com.SpringExampleThree.vehicles;

import com.SpringExampleThree.taxicos.Taxicos;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "vehicles")
@Table(name = "vehicles")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Vehicles {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "year")
    private Integer year;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "vehicles_taxicos",
            joinColumns = @JoinColumn(name="vehicles_id"),
            inverseJoinColumns =  @JoinColumn(name="taxicos_id")
    )
    private Set<Taxicos> taxicos = new HashSet<>();
}
