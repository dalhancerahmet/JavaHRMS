package MyProject.Hrms.business.abstracts;

import java.util.List;

import MyProject.Hrms.core.utilities.results.DataResult;
import MyProject.Hrms.core.utilities.results.Result;
import MyProject.Hrms.entities.Pozition;

public interface PozitionService {
	
	DataResult<List<Pozition>> getAll();
	Result add(Pozition pozition);

}
