package in.strikes.SpringPracticalDemo.service;

import in.strikes.SpringPracticalDemo.entity.Role;
import in.strikes.SpringPracticalDemo.repository.RoleRepository;
import org.springframework.stereotype.Service;

@Service
public class RoleService {

    private RoleRepository roleRepository;

    public RoleService(RoleRepository roleRepository) {
        this.roleRepository = roleRepository;
    }

    public void addRole(Role role) {
        roleRepository.save(role);
    }
}
