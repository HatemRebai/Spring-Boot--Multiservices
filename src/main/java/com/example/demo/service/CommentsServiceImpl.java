package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Comments;
import com.example.demo.repositories.ClientRepository;
import com.example.demo.repositories.CommentsRepository;
import com.example.demo.repositories.OuvrierRepository;


@Service("commentsservice")
public class CommentsServiceImpl  implements CommentsService{

	@Autowired
	CommentsRepository commentsrepository;
	@Autowired
	OuvrierRepository ouvrierrepository;
	@Autowired
	ClientRepository clientrepository;
	@Override

	public void commouvr(Comments comments, Integer idouvrier) {
		commentsrepository.save(comments);

		/*Comments comments = commentsrepository.getOne(idcomments);
		Ouvrier ouvrier = ouvrierrepository.getOne(idouvrier);
		comments.setOuvrier(ouvrier);
		commentsrepository.saveAndFlush(comments);*/

	}
	/*@Override
	public void commclient(Integer idcomments, Integer idclient) {

		Comments comments = commentsrepository.getOne(idcomments);
		Client client = clientrepository.getOne(idclient);
		comments.setClient(client);
		commentsrepository.saveAndFlush(comments);

	}*/
	@Override
	public void savecomments(Comments comments) {
		// TODO Auto-generated method stub
		commentsrepository.save(comments);
	}

}
