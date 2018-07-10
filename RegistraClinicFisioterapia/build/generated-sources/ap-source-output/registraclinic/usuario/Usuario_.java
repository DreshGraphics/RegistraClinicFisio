package registraclinic.usuario;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Usuario.class)
public abstract class Usuario_ extends registraclinic.pessoa.Pessoa_ {

	public static volatile SingularAttribute<Usuario, String> senhaUsuario;
	public static volatile SingularAttribute<Usuario, String> tipoUsuario;
	public static volatile SingularAttribute<Usuario, String> emailUsuario;
	public static volatile SingularAttribute<Usuario, String> loginUsuario;

}

