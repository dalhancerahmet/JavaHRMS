package MyProject.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import MyProject.Hrms.entities.Pozition;

public interface PozitionDao extends JpaRepository<Pozition, Integer>{

}
