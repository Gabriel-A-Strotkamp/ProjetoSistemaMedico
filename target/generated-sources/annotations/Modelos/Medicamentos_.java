package Modelos;

import Modelos.Receituarios;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2024-12-17T12:06:02", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Medicamentos.class)
public class Medicamentos_ { 

    public static volatile SingularAttribute<Medicamentos, Receituarios> receita;
    public static volatile SingularAttribute<Medicamentos, Integer> id;
    public static volatile SingularAttribute<Medicamentos, String> laboratorio;
    public static volatile SingularAttribute<Medicamentos, String> descricao;

}