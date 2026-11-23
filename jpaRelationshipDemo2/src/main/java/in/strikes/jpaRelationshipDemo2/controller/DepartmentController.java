package in.strikes.jpaRelationshipDemo2.controller;

import in.strikes.jpaRelationshipDemo2.model.Department;
import in.strikes.jpaRelationshipDemo2.service.DepartmentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/department")
public class DepartmentController {
    DepartmentService departmentService;

    public DepartmentController(DepartmentService departmentService){
        this.departmentService=departmentService;
    }

    @PostMapping
    public ResponseEntity<String> createDepartment(@RequestBody Department department) {
        departmentService.createDepartment(department);
        return ResponseEntity.ok("DONE");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteDepartment(@PathVariable Long id) {
        departmentService.removeDepartment(id);
        return ResponseEntity.ok("DONE");
    }
}
