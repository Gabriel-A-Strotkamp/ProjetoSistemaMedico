package Modelos;

import Modelos.Medicos;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-17T12:06:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Pacientes.class)
public class Pacientes_ { 

    public static volatile SingularAttribute<Pacientes, Integer> idade;
    public static volatile SingularAttribute<Pacientes, String> doenca;
    public static volatile SingularAttribute<Pacientes, Medicos> medico;
    public static volatile SingularAttribute<Pacientes, String> cpf;
    public static volatile SingularAttribute<Pacientes, String> nome;
    public static volatile SingularAttribute<Pacientes, Integer> id;

}