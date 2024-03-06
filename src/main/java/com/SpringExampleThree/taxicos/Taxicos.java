package com.SpringExampleThree.taxicos;

import com.SpringExampleThree.vehicles.Vehicles;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;
import java.util.Set;

@Entity(name = "taxicos")
@Table(name = "taxicos")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Taxicos {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name")
    private String name;

    @ManyToMany(mappedBy = "taxicos", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Set<Vehicles> vehicles = new HashSet<>();

}
