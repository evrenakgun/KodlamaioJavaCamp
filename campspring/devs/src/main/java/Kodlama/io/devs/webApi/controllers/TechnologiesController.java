package Kodlama.io.devs.webApi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Kodlama.io.devs.business.abstracts.TechnologyService;
import Kodlama.io.devs.business.requests.technologyRequests.CreateTechnologyRequest;
import Kodlama.io.devs.business.requests.technologyRequests.DeleteTechnologyRequest;
import Kodlama.io.devs.business.requests.technologyRequests.UpdateTechnologyRequest;
import Kodlama.io.devs.business.responses.technologyResponses.GetAllTechnologiesResponse;

@RestController
@RequestMapping("/api/technologies")
public class TechnologiesController {
	private TechnologyService technologyService;
	
	@Autowired
	public TechnologiesController(TechnologyService technologyService) {
		this.technologyService = technologyService;
	}
	
	@GetMapping("/getall")
	public List<GetAllTechnologiesResponse> getAll(){
		return technologyService.getAll();
	}
	
	@PostMapping("/add")
	public void add(CreateTechnologyRequest createTechnologyRequest) throws Exception {
		technologyService.add(createTechnologyRequest);
	}
	
	@PutMapping("/update")
	public void update(int id, UpdateTechnologyRequest updateTechnologyRequest) throws Exception {
		technologyService.update(id, updateTechnologyRequest);
	}
	
	@DeleteMapping
	public void delete(DeleteTechnologyRequest deleteTechnologyRequest) throws Exception {
		technologyService.delete(deleteTechnologyRequest);
	}
}
