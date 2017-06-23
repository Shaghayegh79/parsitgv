package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.VoceIngextra;
import com.example.repository.VoceIngextraRepository;

@Service
public class VoceIngextraService {
	@Autowired
	private VoceIngextraRepository voceIngextraRepository;
	public VoceIngextra addVoceIngextra(VoceIngextra voceIngextra)
	{
		voceIngextraRepository.save(voceIngextra);
		return voceIngextra;
	}
	
}
