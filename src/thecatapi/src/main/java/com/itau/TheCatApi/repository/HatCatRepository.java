package com.itau.TheCatApi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itau.TheCatApi.model.HatCatModel;

public interface HatCatRepository extends JpaRepository<HatCatModel, Long>{
	public List<HatCatModel> findAllByUrlContainingIgnoreCase(String url);

}
