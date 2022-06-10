package com.acsi.gpa.service.roleservice;

import com.acsi.gpa.dto.roledto.RoleRequest;
import com.acsi.gpa.dto.roledto.RoleResponse;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RoleServiceImpl implements RoleService {

    @Override
    public RoleResponse saveRole(RoleRequest roleRequest) {
        return null;
    }
}
