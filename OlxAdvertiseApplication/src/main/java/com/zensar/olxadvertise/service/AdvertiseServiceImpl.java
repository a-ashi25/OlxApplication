package com.zensar.olxadvertise.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olxadvertise.entity.Advertise;
import com.zensar.olxadvertise.repository.OlxAdvertiseRepository;

@Service
public class AdvertiseServiceImpl implements AdvertiseService {

	@Autowired
	private OlxAdvertiseRepository olxAdveriseRepository;
	
	@Override
	public List<Advertise> getAllAdvertises() {
		return olxAdveriseRepository.findAll();
	}

	@Override
	public Advertise createStock(Advertise advertise, String token) {
		if (token.equals("aa66471")) {
			return olxAdveriseRepository.save(advertise);
		} else {
			return null;
		}
	}

	@Override
	public Advertise getAdvertise(int advertiseId) {
		return olxAdveriseRepository.findById(advertiseId).get();
		/*
		 * for (Advertise advertise : advertises) if (advertise.getAdvertiseId() ==
		 * advertiseId) { return advertise; } return null;
		 */
	}

	@Override
	public Advertise updateStock(int advertiseId, Advertise advertise) {
		Advertise availableAdvertise = getAdvertise(advertiseId);
		availableAdvertise.setAdvertiseTitle(advertise.getAdvertiseTitle());
		availableAdvertise.setAdvertisePrice(advertise.getAdvertisePrice());
		availableAdvertise.setAdvertiseCategory(advertise.getAdvertiseCategory());
		availableAdvertise.setStatus(advertise.getStatus());
		availableAdvertise.setAdvertiseDescription(advertise.getAdvertiseDescription());
		return availableAdvertise;
	}

	@Override
	public List<Advertise> getAllAdvertisesByUser(String token) {
		if(token.equals("aa66471"))
		{
			return olxAdveriseRepository.findAll();
		}
		else
		{
			return null;
		}
	}

	@Override
	public Advertise getSpecificAdvertise(int postId, String token) {
	/*	if(token.equals("aa66471"))
		{
			for (Advertise advertise : advertises)
				if (advertise.getAdvertiseId() == postId) {
					return advertise;
				}
				else
				{
					return null;
				}
		}*/
		return null;
	}

	@Override
	public boolean deleteSpecificAdvertise(int postId, String token) {
		olxAdveriseRepository.deleteById(postId);
		return true;
	}
	/*
	 * if(token.equals("rm66633")) { for (Advertise advertise : advertises) if
	 * (advertise.getAdvertiseId() == postId) { advertises.remove(advertise); return
	 * true; } else { return false; } } return false; }
	 */

	@Override
	public Advertise filterBasedSearchAdvertise() {
		return null;
		/*
		 * String filterText = "open"; Optional<Advertise> findAny =
		 * advertises.stream().filter(criteria ->
		 * criteria.toString().toLowerCase().contains(filterText)).findAny();
		 * if(findAny.isPresent()) { return findAny.get(); } else { return null; }
		 */
	}

	@Override
	public Advertise searchAdvertise() {
		return null;
		/*
		 * String searchText = "closed"; Optional<Advertise> findAny =
		 * advertises.stream().filter(criteria ->
		 * criteria.toString().toLowerCase().contains(searchText)).findAny();
		 * if(findAny.isPresent()) { return findAny.get(); } else { return null; }
		 */
		
	}

	@Override
	public List<Advertise> getAllAdvertises(int postId2, String token) {
		/*
		 * if(token.equals("aa66471")) { for (Advertise advertise1 : advertises) if
		 * (advertise1.getAdvertiseId() == postId2) { return advertises; } else { return
		 * null; } }
		 */
		return null;
	}

	@Override
	public Advertise getAdvertise(long advertiseId) {
		// TODO Auto-generated method stub
		return null;
	}

}
