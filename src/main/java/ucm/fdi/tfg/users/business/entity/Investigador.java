package ucm.fdi.tfg.users.business.entity;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import ucm.fdi.tfg.centros.business.entity.Centro;
import ucm.fdi.tfg.departamentos.business.entity.Departamento;
import ucm.fdi.tfg.proyecto.business.entity.Proyecto;

@Entity
@Table(name = "Investigadores")
public class Investigador extends User{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*//@Id
	@Column(name = "investigadorId")
	private Long idinv; */
	
	@OneToMany(mappedBy="investigadorPrincipal")
	private Collection<Proyecto> proyectosDirigidos;
	
	@ManyToMany(mappedBy="investigadores")
	private Collection<Proyecto> proyectos;
	
	public Investigador() {

	}

	/*public Investigador(Long id) {
		this.idinv = id;
	}

	public Long getId() {
		return idinv;
	}
*/
	
	public Collection<Proyecto> getProyectosDirigidos() {
		return proyectosDirigidos;
	}

}
