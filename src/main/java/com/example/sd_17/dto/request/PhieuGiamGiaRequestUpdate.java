package com.example.sd_17.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

public class PhieuGiamGiaRequestUpdate {
    int id;

    String maPhieuGiamGia;

    String dieuKienGiam;

    String tenPhieu;

    int loaiPhieu;

    BigDecimal phamTramGiamGia;

    BigDecimal soTienGiam;

    BigDecimal giamToiDa;

    LocalDateTime ngayBatDau;

    LocalDateTime ngayKetThuc;

    LocalDateTime ngayTao;

    LocalDateTime ngayCapNhat;

    String ghiChu;

    int trangThai;

    BigDecimal soLuong;
}
