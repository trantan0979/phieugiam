package com.example.sd_17.service;

import com.example.sd_17.dto.request.PhieuGiamGiaRequest;
import com.example.sd_17.dto.request.PhieuGiamGiaRequestUpdate;
import com.example.sd_17.dto.response.PhieuGiamGiaResponse;
import com.example.sd_17.entity.PhieuGiamGia;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

public interface PhieuGiamGiaService {
    Page<PhieuGiamGiaResponse> getAllPhieuGiamGia(int page, int size);
    PhieuGiamGiaResponse getPhieuGiamGiaById(int id);
    PhieuGiamGiaResponse createPhieuGiamGia(PhieuGiamGiaRequest phieuGiamGiaRequest);
    PhieuGiamGiaResponse updatePhieuGiamGia(PhieuGiamGiaRequestUpdate phieuGiamGiaRequestUpdate);
    boolean deletePhieuGiamGia(int id);
}
