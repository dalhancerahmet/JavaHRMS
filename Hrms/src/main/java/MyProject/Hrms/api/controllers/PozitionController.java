package MyProject.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import MyProject.Hrms.business.abstracts.PozitionService;
import MyProject.Hrms.core.utilities.results.DataResult;
import MyProject.Hrms.core.utilities.results.Result;
import MyProject.Hrms.entities.Pozition;

@RestController
@RequestMapping("/api/pozitions")
public class PozitionController {
	
	PozitionService pozitionService;
	
	@Autowired
	public PozitionController(PozitionService pozitionService) {
		super();
		this.pozitionService = pozitionService;
	}

	@GetMapping("/getall")
	public DataResult<List<Pozition>> getAll(){
		return this.pozitionService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Pozition pozition) {
		
			return this.pozitionService.add(pozition);
			
	}

}
