package com.cropdeal.crop.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cropdeal.crop.Exception.CropException;
import com.cropdeal.crop.Model.Crop;
import com.cropdeal.crop.Repository.CropRepository;

@Service
public class CropServiceImp implements CropService{

	@Autowired
	private CropRepository cropRepository;
	@Override
	public Crop addCrop(Crop crop) {
		// TODO Auto-generated method stub
		return cropRepository.save(crop);
	}

	@Override
	public List<Crop> getAllCrop() {
		// TODO Auto-generated method stub
		return cropRepository.findAll();
	}

	@Override
	public Optional<Crop> getCropById(int cropId) {
		// TODO Auto-generated method stub
		return cropRepository.findById(cropId);
	}

	@Override
	public Optional<Crop> getCropByName(String cropName) {
		// TODO Auto-generated method stub
		return cropRepository.findByCropName(cropName);
	}

	@Override
	public Crop updateCrop(Crop crop) {
		// TODO Auto-generated method stub
		Crop  updateCrop = cropRepository.findById(crop.getCropId()).orElseThrow(()-> new CropException("Crop Not Found"));
				updateCrop.setCropId(crop.getCropId());
				updateCrop.setCropName(crop.getCropName());
				updateCrop.setCropQuantity(crop.getCropName());
				updateCrop.setCropPrice(crop.getCropPrice());
				updateCrop.setCropTypes(crop.getCropTypes());
				return updateCrop;
	}

	@Override
	public void deleteCropById(int cropId) {
		// TODO Auto-generated method stu
		cropRepository.deleteById(cropId);
	}

	@Override
	public List<Crop> getCropByType(String cropType) {
		// TODO Auto-generated method stub
		return cropRepository.findByCropType(cropType);
	}
}
