package com.flywheelcabs.repositories;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flywheelcabs.modules.*;
@Repository
public interface DriverDAO extends JpaRepository<Driver, Integer>{

//		public Optional<Driver> findByUserUsername(String name);
//		
//		public Optional<Driver>findByUserMobile(String mobile);
//		
//		public List<Driver> findByCabAvailable(String bool);
//		
////		@Query("select * from Driver b  where b.rating>4.5")
//		public List<Driver>findByRatingGreaterThan(float r);
		
		
}
