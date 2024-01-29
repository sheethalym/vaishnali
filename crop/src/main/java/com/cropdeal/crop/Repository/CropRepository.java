package com.cropdeal.crop.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import com.cropdeal.crop.Model.Crop;

@Repository
public interface CropRepository extends MongoRepository<Crop, Integer> {
	@Query("{'cropName':?0}")
	Optional<Crop> findByCropName(String cropName);
	@Query("{'cropType':?0}")
	List<Crop> findByCropType(String cropType);
}
