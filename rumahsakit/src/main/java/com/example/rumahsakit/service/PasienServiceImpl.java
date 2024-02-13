package com.example.rumahsakit.service;

import com.example.rumahsakit.entity.Pasien;
import com.example.rumahsakit.repository.PasienRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PasienServiceImpl implements  PasienService {

@Autowired
private PasienRepository pasienRepository;
    @Override
    public Pasien savePasien(Pasien pasien) {
        return pasienRepository.save(pasien);
    }

    @Override
    public Pasien getPasien(Long id) {
        return pasienRepository.findById(id).orElse(null);
    }

    @Override
    public List<Pasien> getAllPasien() {
        return pasienRepository.findAll();
    }

    @Override
    public Pasien editPasien(Long id, Pasien pasien) {
        pasien.setId(id);
        return pasienRepository.save(pasien);
    }

    @Override
    public void deletePasien(Long id) {
        pasienRepository.deleteById(id);

    }
}
