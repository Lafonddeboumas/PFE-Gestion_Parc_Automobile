package com.acsi.gpa.service.roleservice;

import com.acsi.gpa.dto.roledto.RoleRequest;
import com.acsi.gpa.dto.roledto.RoleResponse;

public interface RoleService {

    RoleResponse saveRole(RoleRequest roleRequest);
}
