package pl.edu.wszib.savingtheworld.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import javax.persistence.Id;
import java.util.List;
@NoRepositoryBean
public interface OurCrudRespository <T, ID> extends CrudRepository<T, ID> {

    List<T> findAll();

}
