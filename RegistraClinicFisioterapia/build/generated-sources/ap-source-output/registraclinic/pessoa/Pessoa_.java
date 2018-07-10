package registraclinic.pessoa;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import registraclinic.cidade.Cidade;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Pessoa.class)
public abstract class Pessoa_ {

	public static volatile SingularAttribute<Pessoa, String> enderecoPessoa;
	public static volatile SingularAttribute<Pessoa, Cidade> cidade;
	public static volatile SingularAttribute<Pessoa, String> naturalidadePessoa;
	public static volatile SingularAttribute<Pessoa, String> bairroPessoa;
	public static volatile SingularAttribute<Pessoa, String> ocupacaoPessoa;
	public static volatile SingularAttribute<Pessoa, String> rgPessoa;
	public static volatile SingularAttribute<Pessoa, Integer> idPessoa;
	public static volatile SingularAttribute<Pessoa, String> idadePessoa;
	public static volatile SingularAttribute<Pessoa, String> estadoCivilPessoa;
	public static volatile SingularAttribute<Pessoa, String> enderecoNumeroPessoa;
	public static volatile SingularAttribute<Pessoa, String> sexoPessoa;
	public static volatile SingularAttribute<Pessoa, String> complementoPessoa;
	public static volatile SingularAttribute<Pessoa, String> nomePessoa;
	public static volatile SingularAttribute<Pessoa, String> telefonePessoa;
	public static volatile SingularAttribute<Pessoa, Date> dataNascimentoPessoa;
	public static volatile SingularAttribute<Pessoa, String> cpfPessoa;

}

