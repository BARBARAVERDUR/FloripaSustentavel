
package com.bv.floripasustentavel.model.dto.request;

import com.bv.floripasustentavel.model.entity.Point;
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
public class NeighborhoodRequestDto {
    
    private String neighName;
    
    private Point point;
}
