package com.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.google.common.net.MediaType;
@CrossOrigin
@RestController
public class ProdottiAdminControllere {
	@PostMapping(value = "/prodottiAdmin/{id}")
	public boolean aggiungiNuovoProotto(@RequestPart("nomeProdotto") String nomeProdotto, @RequestPart("file") MultipartFile file) {
		System.out.print(file+"    "+nomeProdotto);
		return true;
	}
}