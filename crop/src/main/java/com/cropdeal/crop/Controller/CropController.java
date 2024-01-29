package com.cropdeal.crop.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cropdeal.crop.Model.Crop;
import com.cropdeal.crop.Service.CropService;

@RestController
@RequestMapping("/Crops")
public class CropController {
   
	@Autowired
	private CropService cropService;
	
	@PostMapping("/register")
	public Crop addCrop(@RequestBody Crop crop) {
		return cropService.addCrop(crop);
	}
	
	@GetMapping("/getAllCrop")
	public List<Crop> getAllCrop() {
		return cropService.getAllCrop();
	}
	
	@GetMapping("/cropId/{cropId}")
	public Optional<Crop> getCropById(@PathVariable int cropId) {
		return cropService.getCropById(cropId);
	}
	
	@GetMapping("/cropName/{cropName}")
	public Optional<Crop> getCropByName(@PathVariable String cropName) {
		return cropService.getCropByName(cropName);
	}
	
	@GetMapping("/updateCrop")
	public Crop updateCrop(@RequestBody Crop crop) {
		return cropService.updateCrop(crop);
	}
	
	@DeleteMapping("/deletecrop/{cropId}")
	public void deleteCropById(@PathVariable int cropId) {
		 cropService.deleteCropById(cropId);
	}
	
}
