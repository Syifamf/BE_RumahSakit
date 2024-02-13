package com.example.rumahsakit.controller;

import com.example.rumahsakit.entity.Pasien;
import com.example.rumahsakit.service.PasienService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/pasiens")
public class PasienController {

   @Autowired
   private PasienService pasienService;

   @PostMapping
   public Pasien savePasien(@RequestBody Pasien pasien){
       return pasienService.savePasien(pasien);
   }
   @GetMapping
   public List<Pasien> getAllPasien() {
       return pasienService.getAllPasien();
   }

    @GetMapping("/{id}")
    public Pasien getPasien(@PathVariable Long id) {
        return pasienService.getPasien(id);
    }

    @PutMapping("/{id}")
    public Pasien editPasien( @PathVariable Long id, @RequestBody Pasien pasien) {
        return pasienService.editPasien(id, pasien);
    }

    @DeleteMapping("/{id}")
    public void deletePasien(@PathVariable Long id) {
        pasienService.deletePasien(id);
    }
}
