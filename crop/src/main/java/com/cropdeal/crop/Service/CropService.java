package com.cropdeal.crop.Service;

import java.util.List;
import java.util.Optional;

import com.cropdeal.crop.Model.Crop;

public interface CropService {


public Crop addCrop(Crop crop);
public List<Crop> getAllCrop();
public Optional<Crop> getCropById(int cropId);
public Optional<Crop> getCropByName(String cropName);
public Crop updateCrop(Crop crop);
public void deleteCropById(int cropId);

public List<Crop> getCropByType(String cropType);
}
