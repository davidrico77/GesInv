package ucm.fdi.tfg.users.business.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;

import ucm.fdi.tfg.users.business.entity.User;

@NoRepositoryBean
public interface BaseRepository<T extends User> 
extends JpaRepository<T, Long> {}
