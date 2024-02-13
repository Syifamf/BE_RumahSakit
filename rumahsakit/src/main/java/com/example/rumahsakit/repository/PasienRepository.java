package com.example.rumahsakit.repository;

import com.example.rumahsakit.entity.Pasien;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PasienRepository extends JpaRepository<Pasien, Long> {
}
