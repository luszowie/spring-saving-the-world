package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;


@Repository
public interface TypSkladnikaDAO extends OurCrudRespository<TypSkladnika,Long> {



}
