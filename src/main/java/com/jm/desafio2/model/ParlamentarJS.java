package com.jm.desafio2.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 *
 * @author michel
 */
@XmlType(propOrder = {"nome",
    "cpf",
    "uf",
    "cargo",
    "apelido",
    "dtNascimento",
    "formacaoAcademica",
    "filiacaoPartidaria",
    "partido",
    "email",
    "profissao",
    "orgao"})
@XmlAccessorType(XmlAccessType.FIELD)
public class ParlamentarJS implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @XmlElement
    private String nome;
    
    @XmlElement
    private String cpf;
    
    @XmlElement
    private String uf;
    
    @XmlElement
    private String cargo;
    
    @XmlElement
    private String apelido;
    
    @XmlElement
    private LocalDate dtNascimento;
    
    @XmlElement
    private String formacaoAcademica;
    
    @XmlElement
    private String filiacaoPartidaria;
    
    @XmlElement
    private String partida;
    
    @XmlElement
    private String email;
    
    @XmlElement
    private String profissao;
    
    @XmlElement
    private String orgao;

    @XmlElement
    private String idImpeachment;
    
    @XmlElement
    private PontuacaoJS pontuacaoJS;
    
    public ParlamentarJS() {
    }

    public ParlamentarJS(String nome, String cpf, String uf, String cargo, String apelido, LocalDate dtNascimento, String formacaoAcademica, String filiacaoPartidaria, String partida, String email, String profissao, String orgao, String idImpeachment,PontuacaoJS pontuacaoJS) {
        this.nome = nome;
        this.cpf = cpf;
        this.uf = uf;
        this.cargo = cargo;
        this.apelido = apelido;
        this.dtNascimento = dtNascimento;
        this.formacaoAcademica = formacaoAcademica;
        this.filiacaoPartidaria = filiacaoPartidaria;
        this.partida = partida;
        this.email = email;
        this.profissao = profissao;
        this.orgao = orgao;
        this.idImpeachment = idImpeachment;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public LocalDate getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getFormacaoAcademica() {
        return formacaoAcademica;
    }

    public void setFormacaoAcademica(String formacaoAcademica) {
        this.formacaoAcademica = formacaoAcademica;
    }

    public String getFiliacaoPartidaria() {
        return filiacaoPartidaria;
    }

    public void setFiliacaoPartidaria(String filiacaoPartidaria) {
        this.filiacaoPartidaria = filiacaoPartidaria;
    }

    public String getPartida() {
        return partida;
    }

    public void setPartida(String partida) {
        this.partida = partida;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getOrgao() {
        return orgao;
    }

    public void setOrgao(String orgao) {
        this.orgao = orgao;
    }

    public String getIdImpeachment() {
        return idImpeachment;
    }

    public void setIdImpeachment(String idImpeachment) {
        this.idImpeachment = idImpeachment;
    }

    public PontuacaoJS getPontuacaoJS() {
        return pontuacaoJS;
    }

    public void setPontuacaoJS(PontuacaoJS pontuacaoJS) {
        this.pontuacaoJS = pontuacaoJS;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nome);
        hash = 47 * hash + Objects.hashCode(this.cpf);
        hash = 47 * hash + Objects.hashCode(this.uf);
        hash = 47 * hash + Objects.hashCode(this.cargo);
        hash = 47 * hash + Objects.hashCode(this.apelido);
        hash = 47 * hash + Objects.hashCode(this.dtNascimento);
        hash = 47 * hash + Objects.hashCode(this.formacaoAcademica);
        hash = 47 * hash + Objects.hashCode(this.filiacaoPartidaria);
        hash = 47 * hash + Objects.hashCode(this.partida);
        hash = 47 * hash + Objects.hashCode(this.email);
        hash = 47 * hash + Objects.hashCode(this.profissao);
        hash = 47 * hash + Objects.hashCode(this.orgao);
        hash = 47 * hash + Objects.hashCode(this.idImpeachment);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ParlamentarJS other = (ParlamentarJS) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.apelido, other.apelido)) {
            return false;
        }
        if (!Objects.equals(this.formacaoAcademica, other.formacaoAcademica)) {
            return false;
        }
        if (!Objects.equals(this.filiacaoPartidaria, other.filiacaoPartidaria)) {
            return false;
        }
        if (!Objects.equals(this.partida, other.partida)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.profissao, other.profissao)) {
            return false;
        }
        if (!Objects.equals(this.orgao, other.orgao)) {
            return false;
        }
        if (!Objects.equals(this.idImpeachment, other.idImpeachment)) {
            return false;
        }
        if (!Objects.equals(this.dtNascimento, other.dtNascimento)) {
            return false;
        }
        return true;
    }

    
    
}
