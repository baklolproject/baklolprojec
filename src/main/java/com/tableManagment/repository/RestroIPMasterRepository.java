package com.tableManagment.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.tableManagment.model.RestoIdentityModel;
import com.tableManagment.model.RestroIPMasterModel;
public interface RestroIPMasterRepository extends JpaRepository<RestroIPMasterModel ,RestoIdentityModel > {

}
