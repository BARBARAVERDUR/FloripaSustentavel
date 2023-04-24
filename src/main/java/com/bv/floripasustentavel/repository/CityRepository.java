
package com.bv.floripasustentavel.repository;

import com.bv.floripasustentavel.model.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    
}
