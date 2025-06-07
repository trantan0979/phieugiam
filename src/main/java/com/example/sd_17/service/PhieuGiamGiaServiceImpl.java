package com.example.sd_17.service;

import com.example.sd_17.dto.request.PhieuGiamGiaRequest;
import com.example.sd_17.dto.request.PhieuGiamGiaRequestUpdate;
import com.example.sd_17.dto.response.PhieuGiamGiaResponse;
import com.example.sd_17.entity.PhieuGiamGia;
import com.example.sd_17.mapper.PhieuGiamGiaMapper;
import com.example.sd_17.repository.PhieuGiamGiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PhieuGiamGiaServiceImpl implements PhieuGiamGiaService{

    @Autowired
    private PhieuGiamGiaRepository phieuGiamGiaRepository;

    @Override
    public Page<PhieuGiamGiaResponse> getAllPhieuGiamGia(int page, int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<PhieuGiamGia> phieuGiamGiaPages = phieuGiamGiaRepository.findAll(pageable);
        return phieuGiamGiaPages.map(PhieuGiamGiaMapper.INSTANCE::toResponse);
    }

    @Override
    public PhieuGiamGiaResponse getPhieuGiamGiaById(int id) {
        PhieuGiamGia phieuGiamGia =  phieuGiamGiaRepository.findById(id).orElse(null);
        if(phieuGiamGia==null){
            return null;
        }
        else {
            return PhieuGiamGiaMapper.INSTANCE.toResponse(phieuGiamGia);
        }
    }

    @Override
    public PhieuGiamGiaResponse createPhieuGiamGia(PhieuGiamGiaRequest phieuGiamGiaRequest) {
        PhieuGiamGia phieuGiamGia = PhieuGiamGiaMapper.INSTANCE.toPhieuGiamGia(phieuGiamGiaRequest);
        phieuGiamGiaRepository.save(phieuGiamGia);
        return PhieuGiamGiaMapper.INSTANCE.toResponse(phieuGiamGia);
    }

    @Override
    public PhieuGiamGiaResponse updatePhieuGiamGia(PhieuGiamGiaRequestUpdate phieuGiamGiaRequestUpdate) {
        PhieuGiamGia phieuGiamGia = phieuGiamGiaRepository.findById(phieuGiamGiaRequestUpdate.getId()).orElse(null);
        if(phieuGiamGia==null){
            return null;
        }
        else {
            PhieuGiamGiaMapper.INSTANCE.updatePhieuGiamGia(phieuGiamGia, phieuGiamGiaRequestUpdate);
            return PhieuGiamGiaMapper.INSTANCE.toResponse(phieuGiamGia);
        }
    }

    @Override
    public boolean deletePhieuGiamGia(int id) {
        PhieuGiamGia phieuGiamGia = phieuGiamGiaRepository.findById(id).orElse(null);
        if(phieuGiamGia==null){
            return false;
        }
        else {
            phieuGiamGia.setTrangThai(1);
            phieuGiamGiaRepository.save(phieuGiamGia);
            return true;
        }
    }
}
