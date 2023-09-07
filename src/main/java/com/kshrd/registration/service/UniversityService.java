package com.kshrd.registration.service;

import com.kshrd.registration.model.University;
import com.kshrd.registration.payload.request.UniversityReq;

import java.util.List;

public interface UniversityService {
    List<University> getAllUniversity() throws Exception;
    University addNewUniversity(String abbreviation) throws Exception;
//    University getUniversityByName(String abbreviation) throws Exception;
}
