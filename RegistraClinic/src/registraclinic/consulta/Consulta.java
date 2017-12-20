/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registraclinic.consulta;

import registraclinic.paciente.Paciente;

/**
 *
 * @author Karlos
 */
public class Consulta {
    
    private int idConsulta;
    private String nomeConsulta;
    private Paciente paciente;
    private String dataConsulta;
    private String horaConsulta;
    private Funcionario funcionario; //ESSE ATENDENTE VIRIA DE UMA CLASSE ATENDENTE??
    
}
