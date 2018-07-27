package registraclinic.triagem;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registraclinic.atendimento.Atendimento;
import registraclinic.paciente.Paciente;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Triagem.class)
public abstract class Triagem_ {

	public static volatile SingularAttribute<Triagem, String> prioridadeDoAtendimento;
	public static volatile SingularAttribute<Triagem, Paciente> paciente;
	public static volatile SingularAttribute<Triagem, Date> dataTriagem;
	public static volatile SingularAttribute<Triagem, Integer> idTriagem;
	public static volatile SingularAttribute<Triagem, Atendimento> tipoAtendimento;

}

