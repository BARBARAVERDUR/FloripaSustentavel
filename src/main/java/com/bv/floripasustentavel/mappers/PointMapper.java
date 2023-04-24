
package com.bv.floripasustentavel.mappers;

import com.bv.floripasustentavel.model.dto.request.PointRequestDto;
import com.bv.floripasustentavel.model.dto.response.PointResponseDto;
import com.bv.floripasustentavel.model.entity.Point;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Component;

@Component
public class PointMapper {

    public Point map(PointRequestDto request){
        
        Point point = new Point();
        
        point.setPointName(request.getPointName());
        point.setStreet(request.getStreet());
        point.setNumber(request.getNumber());
        point.setLatitude(request.getLatitude());
        point.setLongitude(request.getLongitude());
        point.setOpeningHours(request.getOpeningHours());
        point.setPhone(request.getPhone());

        return point;
    }
    
    public PointResponseDto map(Point point){
        
        PointResponseDto response = new PointResponseDto();
        
        
        response.setPointName(point.getPointName());
        response.setOpeningHours(point.getOpeningHours());
        response.setPhone(point.getPhone());
        
        String street = point.getStreet();
        String number  = point.getNumber();
        String neighborhoodName = point.getNeighborhoods().getNeighName();
        String city = point.getNeighborhoods().getRegion().getCity().getCityName();
        String addressL = (street + " " + number + " "+ neighborhoodName + " " + city);
        
        response.setAddress(addressL);
        
        return response;
    }
    
    public List<PointResponseDto> map(List<Point> point){
       List<PointResponseDto> listPointResponse =  new ArrayList<>();
        
        for (Point p : point) {
            listPointResponse.add((PointResponseDto) map(p));
        }      
        return listPointResponse;
    }
            
    
    
}
