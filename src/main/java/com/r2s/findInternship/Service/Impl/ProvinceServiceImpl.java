package com.r2s.findInternship.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.r2s.findInternship.Repository.ProvinceRepository;
import com.r2s.findInternship.Service.ProvinceService;

public class ProvinceServiceImpl implements ProvinceService {
	@Autowired
	private ProvinceRepository provinceRepository;

}
