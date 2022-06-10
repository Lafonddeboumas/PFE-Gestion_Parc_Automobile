package com.acsi.gpa.mapper;

import com.acsi.gpa.dto.roledto.RoleRequest;
import com.acsi.gpa.dto.roledto.RoleResponse;
import com.acsi.gpa.entities.Roles;
import org.mapstruct.Mapper;

@Mapper(componentModel = "Spring")
public interface RoleMapper {

    //Mapping entité  vers Dto
    RoleResponse RoleToRoleResponseDto(Roles roles);

    //Mapping Dto vers entités
    Roles RoleRequestDtoToRole(RoleRequest roleRequest);

}
