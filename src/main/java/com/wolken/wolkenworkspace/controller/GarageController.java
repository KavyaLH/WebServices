package com.wolken.wolkenworkspace.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wolken.wolkenworkspace.dto.VehicleDto;

@RestController
@RequestMapping("/")
public class GarageController {
	
	VehicleDto dto = new VehicleDto();
	

	public GarageController() {
	dto.setVid(1);
	dto.setType("bike");
	dto.setNoOfWhl(2);
	dto.setColor("black");
	}

@GetMapping("/getAll")
	public VehicleDto getAll()
	{
		return dto;
	}

@PostMapping("/save")
public String save(@RequestBody VehicleDto dto)
{
return "saved "+ dto.getType()+" "+ dto.getVid();	
}

@PutMapping("/update")
public String update(@RequestBody VehicleDto dto)
{
	return "updated "+ dto.getType()+" "+ dto.getVid();
}

@DeleteMapping("/delete")
public String del(@RequestBody VehicleDto dto)
{
	return "deleted " + dto.getType()+" "+ dto.getVid();
}
}
