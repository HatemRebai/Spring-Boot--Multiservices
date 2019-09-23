package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Client;
import com.example.demo.entities.Comments;
import com.example.demo.entities.Ouvrier;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.CommentsRepository;
import com.example.demo.repositories.OuvrierRepository;
import com.example.demo.service.CommentsService;

@CrossOrigin("*")
@RestController
@RequestMapping("/comments")


public class CommentsController {

	@Autowired
	CommentsRepository commentsrepository;
	@Autowired
	CommentsService commentsservice;
	
	@Autowired
	ClientRepository clientrepository;
	@Autowired
	OuvrierRepository ouvrierrepository;
	
	 @RequestMapping(value = "/addcommentsou/{idouvrier}", method = RequestMethod.POST)
		public void commouvr(@RequestBody Comments comments,@PathVariable("idouvrier") Integer idouvrier) {
		 Ouvrier ouvrier =ouvrierrepository.getOne(idouvrier);
		 comments.setOuvrier(ouvrier);
		 commentsrepository.save(comments);
	 }

	
	 @RequestMapping(value = "/addcommentscli/{idclient}", method = RequestMethod.POST)
		public void savecomments(@RequestBody Comments comments,@PathVariable("idclient") Integer idclient) {
		 Client client = clientrepository.getOne(idclient);
		 comments.setClient(client);
		 commentsrepository.save(comments);
	 }
		
}
