package com.example.demo.service;

import org.springframework.web.bind.annotation.RequestBody;


import com.example.demo.entities.Service;

public interface ServiceService {
	public void saveService (@RequestBody Service service);

}
