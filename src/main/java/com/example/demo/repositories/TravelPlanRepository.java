package com.example.demo.repositories;

import com.example.demo.models.TravelPlan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TravelPlanRepository extends JpaRepository<TravelPlan,Long> {

}
