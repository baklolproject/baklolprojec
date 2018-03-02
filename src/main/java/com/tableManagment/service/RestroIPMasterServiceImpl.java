package com.tableManagment.service;

import java.util.List;

import javax.inject.Inject;

import com.tableManagment.DTO.RestroIPMasterDTO;
import com.tableManagment.model.RestroIPMasterModel;
import com.tableManagment.repository.RestroIPMasterRepository;

public class RestroIPMasterServiceImpl implements RestroIPMasterService {
@Inject
private RestroIPMasterRepository restroMasteRepository;
	@SuppressWarnings("null")
	@Override
	public RestroIPMasterDTO getRestroDetails() {
		
		RestroIPMasterDTO restroIpMasterDto = null;
		List <RestroIPMasterModel> restroIpMasterModel =restroMasteRepository.findAll();
		restroIpMasterDto.setId(restroIpMasterModel.get(0).getId());
		restroIpMasterDto.setIp_Address(restroIpMasterModel.get(0).getIp_Address());
		restroIpMasterDto.setRestroName(restroIpMasterModel.get(0).getRestroName());
		return restroIpMasterDto;
	}

}
