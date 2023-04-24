
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
@Table(name="NEIGHBORHOOD")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Neighborhood {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    
    @Column(name="Neigh_Name")
    private String neighName;
    
    @OneToMany
    @Column(name="Point_Id")
    private Point point;
}
