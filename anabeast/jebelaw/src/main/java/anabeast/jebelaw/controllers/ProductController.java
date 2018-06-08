package anabeast.jebelaw.controllers;
import org.json.JSONArray;
import org.json.JSONObject;


import org.springframework.web.bind.annotation.RestController;



import anabeast.jebelaw.models.Product;
import anabeast.jebelaw.repos.ProductRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ProductController {

	@Autowired
	private ProductRepository productRepo;
	
    @RequestMapping("/product")
    public List<Product> index() {
    
    	List<Product> allProds = productRepo.findAll();
    	return allProds;
    }

}