package com.tableManagment.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.tableManagment.DTO.RestroIPMasterDTO;
import com.tableManagment.model.RestroIPMasterModel;
import com.tableManagment.repository.RestroIPMasterRepository;
@Service
public class RestroIPMasterServiceImpl implements RestroIPMasterService {
@Inject
private RestroIPMasterRepository restroMasteRepository;
	@SuppressWarnings("null")
	
	public RestroIPMasterDTO getRestroDetails() {
		
		RestroIPMasterDTO restroIpMasterDto = null;
		List <RestroIPMasterModel> restroIpMasterModel =restroMasteRepository.findAll();
		restroIpMasterDto.setId(restroIpMasterModel.get(0).getRestoIdentityModel().getId());
		restroIpMasterDto.setIp_Address(restroIpMasterModel.get(0).getRestoIdentityModel().getIp_Address());
		restroIpMasterDto.setRestroName(restroIpMasterModel.get(0).getRestroName());
		return restroIpMasterDto;
	}

}
