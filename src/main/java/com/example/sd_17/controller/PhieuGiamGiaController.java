package com.example.sd_17.controller;

import com.example.sd_17.dto.request.PhieuGiamGiaRequest;
import com.example.sd_17.dto.request.PhieuGiamGiaRequestUpdate;
import com.example.sd_17.dto.response.PhieuGiamGiaResponse;
import com.example.sd_17.entity.PhieuGiamGia;
import com.example.sd_17.service.PhieuGiamGiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/phieu_giam_gia")
public class PhieuGiamGiaController {
    @Autowired
    private PhieuGiamGiaService phieuGiamGiaService;

    @GetMapping("")
    public ResponseEntity<Page<PhieuGiamGiaResponse>> getAllPhieuGiamGia(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return ResponseEntity.ok(phieuGiamGiaService.getAllPhieuGiamGia(page, size));
    }
    @PostMapping("")
    public ResponseEntity<PhieuGiamGiaResponse> createPhieuGiamGia(@RequestBody PhieuGiamGiaRequest request) {
        return ResponseEntity.ok(phieuGiamGiaService.createPhieuGiamGia(request));
    }
    @GetMapping("/{id}")
    public ResponseEntity<PhieuGiamGiaResponse> getById(@PathVariable int id) {
        return ResponseEntity.ok(phieuGiamGiaService.getPhieuGiamGiaById(id));
    }
    @PutMapping("")
    public ResponseEntity<PhieuGiamGiaResponse> updatephieuGiamGia(@RequestBody PhieuGiamGiaRequestUpdate request) {
        return ResponseEntity.ok(phieuGiamGiaService.updatePhieuGiamGia(request));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable int id) {
        return ResponseEntity.ok(phieuGiamGiaService.deletePhieuGiamGia(id));
    }
}
