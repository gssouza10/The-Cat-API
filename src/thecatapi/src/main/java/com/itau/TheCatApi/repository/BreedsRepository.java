package com.itau.TheCatApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.itau.TheCatApi.model.BreedsModel;

	@Repository
	public interface BreedsRepository extends JpaRepository<BreedsModel, Long> {
		public List<BreedsModel>findAllByNameContainingIgnoreCase(String name);
		public List<BreedsModel>findAllByOriginContainingIgnoreCase(String origin);
		public List<BreedsModel>findAllByTemperamentContainingIgnoreCase(String temperament);
		
	}
