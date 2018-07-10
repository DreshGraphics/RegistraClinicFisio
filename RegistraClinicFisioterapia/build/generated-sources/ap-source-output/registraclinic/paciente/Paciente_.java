package registraclinic.paciente;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registraclinic.atendimento.Atendimento;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Paciente.class)
public abstract class Paciente_ extends registraclinic.pessoa.Pessoa_ {

	public static volatile SingularAttribute<Paciente, String> cpfResponsavelPaciente;
	public static volatile SingularAttribute<Paciente, String> rgResponsavelPaciente;
	public static volatile SingularAttribute<Paciente, String> queixaDoPaciente;
	public static volatile SingularAttribute<Paciente, String> registroNascimentoPaciente;
	public static volatile SingularAttribute<Paciente, String> numeroProntuarioPaciente;
	public static volatile SingularAttribute<Paciente, String> postoDeSaudePaciente;
	public static volatile SingularAttribute<Paciente, String> situacaoPaciente;
	public static volatile SingularAttribute<Paciente, String> agenteDeSaudePaciente;
	public static volatile SingularAttribute<Paciente, String> alturaPaciente;
	public static volatile SingularAttribute<Paciente, String> pesoPaciente;
	public static volatile SingularAttribute<Paciente, String> tipoPaciente;
	public static volatile SingularAttribute<Paciente, String> nomeResponsavelPaciente;
	public static volatile SingularAttribute<Paciente, Atendimento> tipoAtendimento;

}

