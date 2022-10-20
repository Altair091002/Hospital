package com.hospital.isd3project.repos;

import com.hospital.isd3project.models.Diseases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseasesRepo extends JpaRepository<Diseases, Integer> {
}
