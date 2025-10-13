package com.example.project.controller;

import com.example.project.module.College;
import com.example.project.services.CollegeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/colleges")
@CrossOrigin("*")  // allows Postman or frontend to access APIs
public class CollegeController {

    @Autowired
    private CollegeService collegeService;

    // ✅ CREATE
    @PostMapping("/add")
    public College addCollege(@RequestBody College college) {
        return collegeService.addCollege(college);
    }

    // ✅ READ ALL
    @GetMapping("/all")
    public List<College> getAllColleges() {
        return collegeService.getAllColleges();
    }

    // ✅ READ BY ID
    @GetMapping("/{id}")
    public College getCollegeById(@PathVariable Long id) {
        return collegeService.getCollegeById(id);
    }

    // ✅ UPDATE
    @PutMapping("/update/{id}")
    public College updateCollege(@PathVariable Long id, @RequestBody College college) {
        return collegeService.updateCollege(id, college);
    }

    // ✅ DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteCollege(@PathVariable Long id) {
        collegeService.deleteCollege(id);
        return "College deleted successfully with ID: " + id;
    }
}
