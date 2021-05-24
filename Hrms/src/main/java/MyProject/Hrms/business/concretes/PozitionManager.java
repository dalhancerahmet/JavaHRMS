package MyProject.Hrms.business.concretes;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyProject.Hrms.business.abstracts.PozitionService;
import MyProject.Hrms.core.utilities.messages.Messages;
import MyProject.Hrms.core.utilities.results.DataResult;
import MyProject.Hrms.core.utilities.results.Result;
import MyProject.Hrms.core.utilities.results.SuccessDataResult;
import MyProject.Hrms.core.utilities.results.SuccessResult;
import MyProject.Hrms.dataAccess.abstracts.PozitionDao;
import MyProject.Hrms.entities.Pozition;

@Service
public class PozitionManager implements PozitionService {
	
	PozitionDao pozitionDao;

	@Autowired
	public PozitionManager(PozitionDao pozitionDao) {
		super();
		this.pozitionDao = pozitionDao;
	}

	@Override
	public DataResult<List<Pozition>> getAll() {
		
		return new SuccessDataResult<List<Pozition>>(this.pozitionDao.findAll(),Messages.pozitionListed);		
	}

	@Override
	public Result add(Pozition pozition) {
		
		 this.pozitionDao.save(pozition);
		 return new SuccessResult(Messages.pozitionAdded);
	}

}
