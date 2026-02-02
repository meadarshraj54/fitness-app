package com.project.fitnessApp.repository;

import com.project.fitnessApp.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ActivityRepo extends JpaRepository<Activity,String > {
    List<Activity> findByUserId(String userId);
}
