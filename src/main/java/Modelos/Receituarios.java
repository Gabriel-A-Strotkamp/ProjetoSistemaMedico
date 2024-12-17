/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import java.io.Serializable;
import java.util.*;
import javax.persistence.*;
/**
 *
 * @author 20221PF.CC0008
 */
@Entity
@Table(name = "tb_Receituarios")
public class Receituarios implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int id;
    
    @Column(nullable = false, length = 200)
    private String prescricao;
    
    @OneToOne
    @JoinColumn(name = "medico_id", nullable = true)
    private Medicos medico;
    
    @OneToOne
    @JoinColumn(name = "paciente_id", nullable = true)
    private Pacientes paciente;
    
    @OneToMany(mappedBy = "descricao", cascade = CascadeType.ALL, orphanRemoval = true)    
    private final List<Medicamentos> medicamentos;

    
    public Receituarios() {
        this.medicamentos = new ArrayList<>();
    }

    public Receituarios(int id, Medicos medico, Pacientes paciente) {
        this.id = id;
        this.medico = medico;
        this.paciente = paciente;
        this.medicamentos = new ArrayList<>();
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public Medicos getMedico() {
        return medico;
    }

    public void setMedico(Medicos medico) {
        this.medico = medico;
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }
    
    public void addMedicamento(Medicamentos medicamento){
        medicamentos.add(medicamento);
    }
    
    public void remMedicamento(Medicamentos medicamento){
        medicamentos.remove(medicamento);    
        }
    public Medicamentos getMedicamentos(){
        return (Medicamentos) medicamentos;
    }
    
    public String verMedicamentos(){
        String txt = "";
        for(Medicamentos m: medicamentos){
            txt+= m.getDescricao()+", ";
        }
        return txt;
    }
    
    

    @Override
    public String toString() {
        String txt = "teste"; //verMedicamentos();
        return "Receita{ medico:" + medico.getNome() + " |paciente: " + paciente.getNome() + 
                " |prescricao: " + prescricao + " |Medicamentos: [ " + txt +"]}";
    }
    
}
