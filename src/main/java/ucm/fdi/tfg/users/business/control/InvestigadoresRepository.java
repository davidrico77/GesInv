package ucm.fdi.tfg.users.business.control;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ucm.fdi.tfg.users.business.entity.Investigador;
import ucm.fdi.tfg.users.business.entity.User;

/*@Repository
public interface InvestigadoresRepository extends JpaRepository<Investigador, Long> {
	@Query("SELECT i FROM Investigador i JOIN FETCH i.proyectosDirigidos p WHERE p.investigadorPrincipal.id =:idInvestigador")
	public Investigador findInvestigadorPrincipal(@Param("idInvestigador") Long idInvestigador);
}
*/

public interface InvestigadoresRepository extends BaseRepository<Investigador> { 
	@Query("SELECT i FROM Investigador i JOIN FETCH i.proyectosDirigidos p WHERE p.investigadorPrincipal.id =:idInvestigador")
	public Investigador findInvestigadorPrincipal(@Param("idInvestigador") Long idInvestigador);
}