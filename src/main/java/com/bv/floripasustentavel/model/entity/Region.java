
package com.bv.floripasustentavel.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="REGION")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Region {
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    
    @Column(name="Region_Name")
    private String regionName;
    
    @OneToMany
    @Column(name="Neigh_Id")
    private Neighborhood neighborhood;
    
    
}
