package com.kshrd.registration.repository;

import com.kshrd.registration.model.Province;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProvinceRepo {
    @Select("SELECT * FROM province WHERE id = #{proId}")
    Province getProvinceById(String proId);

    @Select("SELECT * FROM province")
    List<Province> getAllProvince();
}
