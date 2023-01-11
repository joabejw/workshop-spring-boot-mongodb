package com.joabejw.workshopmongo.resources;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.joabejw.workshopmongo.entities.Post;
import com.joabejw.workshopmongo.resources.util.URL;
import com.joabejw.workshopmongo.services.PostService;

@RestController
@RequestMapping(value = "/posts")
public class PostResource {

	@Autowired
	private PostService postrService;


	@GetMapping
	@RequestMapping(value = "/{id}")
	public ResponseEntity<Post> findById(@PathVariable String id) {
		Post obj = postrService.findById(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@GetMapping
	@RequestMapping(value = "/titlesearch")
	public ResponseEntity<List<Post>> findByTitle(@RequestParam(value= "text", defaultValue = "") String text) {
		text = URL.decodeParam(text);
		List<Post> list = postrService.findByTitle(text);
		return ResponseEntity.ok().body(list);
	}

}
