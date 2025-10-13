package com.example.project.services;


import com.example.project.module.College;
import com.example.project.repo.CollegeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CollegeService {

    @Autowired
    private CollegeRepository collegeRepository;

    // CREATE
    public College addCollege(College college) {
        return collegeRepository.save(college);
    }

    // READ ALL
    public List<College> getAllColleges() {
        return collegeRepository.findAll();
    }

    // READ BY ID
    public College getCollegeById(Long id) {
        return collegeRepository.findById(id).orElse(null);
    }

    // UPDATE
    public College updateCollege(Long id, College updatedCollege) {
        College existing = collegeRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setCollegeName(updatedCollege.getCollegeName());
            existing.setLocation(updatedCollege.getLocation());
            existing.setAdminName(updatedCollege.getAdminName());
            return collegeRepository.save(existing);
        }
        return null;
    }

    // DELETE
    public void deleteCollege(Long id) {
        collegeRepository.deleteById(id);
    }
}
