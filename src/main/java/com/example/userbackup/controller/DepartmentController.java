package com.example.userbackup.controller;

import com.example.userbackup.model.Department;
import com.example.userbackup.repository.DeptRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class DepartmentController {
    @Autowired
    private DeptRepository departmentRepository;
    @Autowired
    private MongoTemplate mongoTemplate;

    @PostMapping
    public Department createDept(@RequestBody Department department) {
        departmentRepository.save(department);
        return department;
    }

    public Department save(Department department) {
        mongoTemplate.save(department);
        return department;
    }

    @GetMapping
    public List listDepts(){
        return departmentRepository.findAll();
    }

    public List findAll() {
        return mongoTemplate.findAll(Department.class);
    }

    @PutMapping("/{deptId}")
    public Department updateDept(@RequestBody Department department, @PathVariable String deptId) {
        department.setId(deptId);
        departmentRepository.save(department);
        return department;
    }

    public Department update(Department department){
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(department.getId()));
        Update update = new Update();
        update.set("name", department.getName());
        update.set("description", department.getDescription());
        return mongoTemplate.findAndModify(query, update, Department.class);
    }

    @DeleteMapping("/{deptId}")
    public String deleteDept(@PathVariable String deptId) {
        departmentRepository.deleteById(deptId);
        return deptId;
    }

    public void deleteById(String deptId) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(deptId));
        mongoTemplate.remove(query, Department.class);
    }

    @GetMapping("/{deptName}")
    public List findDeptByName(@PathVariable String deptName) {
        return departmentRepository.findDepartmentByName(deptName);
    }

    public List findDepartmentByName(String deptName){
        Query query = new Query();
        query.addCriteria(Criteria.where("name").is(deptName));
        return mongoTemplate.find(query, Department.class);
    }

}
