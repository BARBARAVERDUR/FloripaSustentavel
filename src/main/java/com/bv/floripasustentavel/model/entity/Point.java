
package com.bv.floripasustentavel.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="POINT")
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class Point {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="Id")
    private Long id;
    
    @Column(name="Point_Name")
    private String pointName;
  
    @Column(name = "Street")
    private String street;
    
    @Column(name = "Number")
    private String number;
    
    @Column(name = "Latitude")
    private String latitude;
    
    @Column(name = "Longitude")
    private String longitude;
    
    @Column(name = "Opening_Hours")
    private String openingHours;
    
    @Column(name = "Phone")
    private String phone;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Neighborhood_Id")
    private Neighborhood neighborhoods;

    
    
    
    
}
