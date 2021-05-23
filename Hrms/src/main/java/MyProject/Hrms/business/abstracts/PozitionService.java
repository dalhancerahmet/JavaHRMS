package MyProject.Hrms.business.abstracts;

import java.util.List;

import MyProject.Hrms.entities.Pozition;

public interface PozitionService {
	
	List<Pozition> getAll();
	Pozition add(Pozition pozition);

}
