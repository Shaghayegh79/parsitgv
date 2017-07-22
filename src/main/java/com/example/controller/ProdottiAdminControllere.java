package com.example.controller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.example.model.OrdineVoce;
import com.example.model.Prodotto;
import com.example.service.ProdottoService;
import com.example.service.UploadService;
import com.google.common.net.MediaType;
@CrossOrigin
@RestController
public class ProdottiAdminControllere {
	private static final String Srystem = null;
	@Autowired 
	private UploadService uploadService;
	@Autowired 
	private ProdottoService prodottoService;
	
	@PostMapping(value = "/prodottiAdmin")
	public String aggiungiNuovoProotto(@RequestPart("nome") String nome,
										@RequestPart("tipoprodotto") String tipoprodotto,
										@RequestPart("prezzo") String prezzo,
										@RequestPart("ingredienti") String ingredienti,
										@RequestPart("foto") String foto,
										@RequestPart("disponibile") String disponibile,							
										@RequestPart("file") MultipartFile file) {
		//String ro be decimal tabdil mikone
		BigDecimal prezzoDecimal=new BigDecimal(prezzo);
		//String ro be boolean tabdil mikone
		boolean disponibilità = (disponibile=="disponibile");
		Prodotto prodotto=new Prodotto();
		prodotto.setNome(nome);
		prodotto.setTipoprodotto(tipoprodotto);
		prodotto.setPrezzo(prezzoDecimal);
		prodotto.setIngredienti(ingredienti);
		prodotto.setFoto(foto);
		prodotto.setDisponibile(disponibilità);
		
		/*if(uploadService.saveFile(file)=="1"){
			prodottoService.addProdotto(prodotto);
			return "file salvato";
		}
		else return "file non salvato";*/
		try{
			uploadService.saveFile(file);
		}catch(Exception exc){
			System.out.print("errore upload"+exc);
		}
		return "test";
		
    	
	}
}