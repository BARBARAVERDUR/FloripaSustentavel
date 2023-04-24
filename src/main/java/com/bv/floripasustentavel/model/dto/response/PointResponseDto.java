
package com.bv.floripasustentavel.model.dto.response;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Entity;
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
public class PointResponseDto {
    
    private String pointName;
    
    private String address;
    
    private String openingHours;
    
    private String phone;
}
