package com.r2s.findInternship.Service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2s.findInternship.Entity.Partner;
import com.r2s.findInternship.Repository.PartnerRepository;
import com.r2s.findInternship.Service.PartnerService;
@Service
public class PartnerServiceImpl implements PartnerService{
		@Autowired
		private PartnerRepository partnerRepository;

		public <S extends Partner> S save(S entity) {
			return partnerRepository.save(entity);
		}

		public List<Partner> findAll() {
			return partnerRepository.findAll();
		}

		public long count() {
			return partnerRepository.count();
		}
		
}
