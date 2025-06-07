package com.example.sd_17.mapper;

import com.example.sd_17.dto.request.PhieuGiamGiaRequest;
import com.example.sd_17.dto.request.PhieuGiamGiaRequestUpdate;
import com.example.sd_17.dto.response.PhieuGiamGiaResponse;
import com.example.sd_17.entity.PhieuGiamGia;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PhieuGiamGiaMapper {
    PhieuGiamGiaMapper INSTANCE = Mappers.getMapper(PhieuGiamGiaMapper.class);

    PhieuGiamGia toPhieuGiamGia(PhieuGiamGiaRequest request);

    @Mapping(target = "id", ignore = true)
    void updatePhieuGiamGia(@MappingTarget PhieuGiamGia phieuGiamGia, PhieuGiamGiaRequestUpdate request);

    PhieuGiamGiaResponse toResponse(PhieuGiamGia employee);
}
