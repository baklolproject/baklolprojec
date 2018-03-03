package com.tableManagment.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tableManagment.DTO.RestroIPMasterDTO;
import com.tableManagment.enums.ResponseKeyName;
import com.tableManagment.service.RestroIPMasterService;


@RestController
@RequestMapping(value="/v1")
public class RestroIPMasterController extends BaseRestController {
@Inject
private RestroIPMasterService restroMasterServive;

@RequestMapping(value="/getRstroDetails",method=RequestMethod.GET)
public ResponseEntity<Object>getAllNewOrder() {
	System.out.println("HI");
	RestroIPMasterDTO restroIPMasterDTO=restroMasterServive.getRestroDetails();
	System.out.println(restroIPMasterDTO.toString());
	return ResponseEntity.ok(createSuccessResponse(ResponseKeyName.GETRESTRODETAILS,restroIPMasterDTO));

}
}
