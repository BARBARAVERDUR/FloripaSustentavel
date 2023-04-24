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
@Table(name="CITY")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class City {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    
    @Column(name="City_Name")
    private String cityName;
    
    @OneToMany(mappedBy = "city")
    @Column(name="Region_Id")
    private Region region;
       
}
