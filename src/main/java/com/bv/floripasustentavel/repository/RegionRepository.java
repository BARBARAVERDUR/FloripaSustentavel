
package com.bv.floripasustentavel.repository;

import com.bv.floripasustentavel.model.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Region, Long>{
    
}
