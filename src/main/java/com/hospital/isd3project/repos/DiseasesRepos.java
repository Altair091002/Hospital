package com.hospital.isd3project.repos;

import com.hospital.isd3project.models.Diseases;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiseasesRepos extends JpaRepository<Diseases, Integer> {
}
