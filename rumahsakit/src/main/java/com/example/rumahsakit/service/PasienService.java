package com.example.rumahsakit.service;

import com.example.rumahsakit.entity.Pasien;
import  java.util.Date;

import java.util.List;

public interface PasienService {
    Pasien savePasien(Pasien pasien);

    Pasien getPasien(Long id);

    List<Pasien> getAllPasien();

    Pasien editPasien(Long id, Pasien pasien);

    void deletePasien(Long id);
}
