package com.kshrd.registration.service.serviceimp;

import com.kshrd.registration.model.University;
import com.kshrd.registration.payload.request.UniversityReq;
import com.kshrd.registration.repository.UniversityRepo;
import com.kshrd.registration.service.UniversityService;
import com.kshrd.registration.utillity.GenerateId;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UniversityImp implements UniversityService {

    private final UniversityRepo universityRepo;

    public UniversityImp(UniversityRepo universityRepo) {
        this.universityRepo = universityRepo;
    }

    @Override
    public List<University> getAllUniversity() throws Exception {
        try{
            List<University> universities = universityRepo.getAllUniversity();
            return  universities;
        }catch (Exception ex){
            throw new Exception(ex.getMessage());
        }
    }

    @Override
    public University addNewUniversity(String abbreviation) throws Exception {
        try{
            University findUniversityByName = universityRepo.getUniversityByName(abbreviation);
//            System.out.printf("findUniversityByName:", findUniversityByName);
            if(findUniversityByName != null){
                return findUniversityByName;
            }
            University university = universityRepo.addNewUniversity(GenerateId.id(), abbreviation);
            return university;
        }catch (Exception ex){
            throw  new Exception(ex.getMessage());
        }
    }


}
