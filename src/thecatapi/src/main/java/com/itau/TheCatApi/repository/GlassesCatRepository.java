package com.itau.TheCatApi.repository;

import org.springframework.stereotype.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.itau.TheCatApi.model.GlassesCatModel;

@Repository
public interface GlassesCatRepository extends JpaRepository<GlassesCatModel, Long>{
	public List<GlassesCatModel> findAllByUrlContainingIgnoreCase(String url);
}
