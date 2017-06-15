package com.example.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.model.Ingextra;
import com.example.service.IngextraService;;
@CrossOrigin
@RestController
public class IngextraController {
	@Autowired
	private IngextraService ingextraService;
	@GetMapping("/allingextra")
	public ResponseEntity<List<Ingextra>> getAllIngextra()
	{
		List<Ingextra> listaIngextra = ingextraService.getAllIngextra();
		return new ResponseEntity<List<Ingextra>>(listaIngextra ,HttpStatus.OK);
	}
	@GetMapping("/ingextra")
	public ResponseEntity<Ingextra> getIngextra(String nome)
	{
		return new ResponseEntity<Ingextra>(ingextraService.getIngextra(nome) ,HttpStatus.OK);
	}
	

}
