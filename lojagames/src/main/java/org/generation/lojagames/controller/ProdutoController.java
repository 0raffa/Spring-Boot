package org.generation.lojagames.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.org.generation.lojadegames.model.ProdutoModel;

import org.generation.lojagames.repository.ProdutoRepository;

@RestController
@RequestMapping("/produto")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@GetMapping
	public ResponseEntity<List<ProdutoModel>> getAllProdutoModel(){
		return ResponseEntity.ok(produtoRepository.findAll());
	}
	
	

		
	@GetMapping("/{id}")
	public ResponseEntity<ProdutoModel> getByIdProduto(@PathVariable long id){
		return produtoRepository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<ProdutoModel>> getByNomeProduto(@PathVariable String nome){
		return ResponseEntity.ok(produtoRepository.findAllByNomeProdutoContainingIgnoreCase(nome));
	}
	
	@PostMapping
	public ResponseEntity<Produto> postProduto(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.CREATED).body(produtoRepository.save(produto));
	}
	
	@PutMapping
	public ResponseEntity<Produto> putProduto(@RequestBody Produto produto){
		return ResponseEntity.status(HttpStatus.OK).body(produtoRepository.save(produto));
	}
	
	@DeleteMapping("/{id}")
	public void deleteProduto(@PathVariable long id) {
		produtoRepository.deleteById(id);
	}
}