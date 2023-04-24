
package com.bv.floripasustentavel.model.dto.request;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@JsonFormat
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter @Setter @ToString
public class PointRequestDto {
   
    private String pointName;
  
    private String street;
    
    private String number;
    
    private String latitude;
    
    private String longitude;
    
    private Date openingHours;
    
    private String phone;
}
