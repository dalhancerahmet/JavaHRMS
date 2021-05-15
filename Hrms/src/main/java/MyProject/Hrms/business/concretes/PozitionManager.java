package MyProject.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import MyProject.Hrms.business.abstracts.PozitionService;
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
	public List<Pozition> getAll() {

		return this.pozitionDao.findAll();
	}

}
