package com.jm.desafio2.model;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 *
 * @author michel
 */
@XmlType(propOrder = {"rakingGeral",
    "rakingEstadual",
    "avaliacaoGeral",
    "total",
    "presencaSessoes",
    "privilegios",
    "processosJudiciais",
    "outros",
    "qualidadeLegislativa"
})
@XmlAccessorType(XmlAccessType.FIELD)
public class PontuacaoJS implements Serializable {

    @XmlElement
    private Long rakingGeral;

    @XmlElement
    private Long rakingEstadual;

    @XmlElement
    private Float avaliacaoGeral;

    @XmlElement
    private Long total;

    @XmlElement
    private Long presencaSessoes;

    @XmlElement
    private Long privilegios;

    @XmlElement
    private Long processosJudiciais;

    @XmlElement
    private Long outros;

    @XmlElement
    private Long qualidadeLegislativa;

    public PontuacaoJS() {
    }

    public PontuacaoJS(Long rakingGeral, Long rakingEstadual, Float avaliacaoGeral, Long total, Long presencaSessoes, Long privilegios, Long processosJudiciais, Long outros, Long qualidadeLegislativa) {
        this.rakingGeral = rakingGeral;
        this.rakingEstadual = rakingEstadual;
        this.avaliacaoGeral = avaliacaoGeral;
        this.total = total;
        this.presencaSessoes = presencaSessoes;
        this.privilegios = privilegios;
        this.processosJudiciais = processosJudiciais;
        this.outros = outros;
        this.qualidadeLegislativa = qualidadeLegislativa;
    }

    
    public Long getRakingGeral() {
        return rakingGeral;
    }

    public void setRakingGeral(Long rakingGeral) {
        this.rakingGeral = rakingGeral;
    }

    public Long getRakingEstadual() {
        return rakingEstadual;
    }

    public void setRakingEstadual(Long rakingEstadual) {
        this.rakingEstadual = rakingEstadual;
    }

    public Float getAvaliacaoGeral() {
        return avaliacaoGeral;
    }

    public void setAvaliacaoGeral(Float avaliacaoGeral) {
        this.avaliacaoGeral = avaliacaoGeral;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Long getPresencaSessoes() {
        return presencaSessoes;
    }

    public void setPresencaSessoes(Long presencaSessoes) {
        this.presencaSessoes = presencaSessoes;
    }

    public Long getPrivilegios() {
        return privilegios;
    }

    public void setPrivilegios(Long privilegios) {
        this.privilegios = privilegios;
    }

    public Long getProcessosJudiciais() {
        return processosJudiciais;
    }

    public void setProcessosJudiciais(Long processosJudiciais) {
        this.processosJudiciais = processosJudiciais;
    }

    public Long getOutros() {
        return outros;
    }

    public void setOutros(Long outros) {
        this.outros = outros;
    }

    public Long getQualidadeLegislativa() {
        return qualidadeLegislativa;
    }

    public void setQualidadeLegislativa(Long qualidadeLegislativa) {
        this.qualidadeLegislativa = qualidadeLegislativa;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.rakingGeral);
        hash = 83 * hash + Objects.hashCode(this.rakingEstadual);
        hash = 83 * hash + Objects.hashCode(this.avaliacaoGeral);
        hash = 83 * hash + Objects.hashCode(this.total);
        hash = 83 * hash + Objects.hashCode(this.presencaSessoes);
        hash = 83 * hash + Objects.hashCode(this.privilegios);
        hash = 83 * hash + Objects.hashCode(this.processosJudiciais);
        hash = 83 * hash + Objects.hashCode(this.outros);
        hash = 83 * hash + Objects.hashCode(this.qualidadeLegislativa);
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
        final PontuacaoJS other = (PontuacaoJS) obj;
        if (!Objects.equals(this.rakingGeral, other.rakingGeral)) {
            return false;
        }
        if (!Objects.equals(this.rakingEstadual, other.rakingEstadual)) {
            return false;
        }
        if (!Objects.equals(this.avaliacaoGeral, other.avaliacaoGeral)) {
            return false;
        }
        if (!Objects.equals(this.total, other.total)) {
            return false;
        }
        if (!Objects.equals(this.presencaSessoes, other.presencaSessoes)) {
            return false;
        }
        if (!Objects.equals(this.privilegios, other.privilegios)) {
            return false;
        }
        if (!Objects.equals(this.processosJudiciais, other.processosJudiciais)) {
            return false;
        }
        if (!Objects.equals(this.outros, other.outros)) {
            return false;
        }
        if (!Objects.equals(this.qualidadeLegislativa, other.qualidadeLegislativa)) {
            return false;
        }
        return true;
    }

    
}
