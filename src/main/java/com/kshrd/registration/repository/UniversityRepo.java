package com.kshrd.registration.repository;

import com.kshrd.registration.model.University;
import com.kshrd.registration.payload.request.UniversityReq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UniversityRepo {
    @Select("SELECT * FROM university WHERE id = #{universityId}")
    University getUniversityById(String universityId);

    @Select("SELECT * FROM university")
    List<University> getAllUniversity();

    @Select("INSERT INTO university(id, abbreviation) VALUES(#{id}, #{abbreviation}) RETURNING *")
    University addNewUniversity(String id, String abbreviation);

    @Select("SELECT * FROM university WHERE abbreviation = #{abbreviation}")
    University getUniversityByName(String abbreviation);
}
