/*
 * ${COMPANY}
 * Sistema: ${SYSTEM_NAME}
 * Creado: 22-dic-2017 - 09:43:30
 * 
 * Los contenidos de este archivo son propiedad intelectual de Gestorinc S.A.
 * y se encuentran protegidos por la licencia: "GESTOR FIDUCIA/FONDOS G5".
 * 
 * Usted puede encontrar una copia de esta licencia en: 
 *   http://www.gestorinc.com
 * 
 * Copyright 2015-2018 Gestorinc S.A. Todos los derechos reservados.
 */
package com.gestor.bots.admin.console.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Gestor
 */
@Entity
@Table(name = "REGISTRO_LOGIN")
public class RegistroLogin implements Serializable {

    @Id
    @Column(name = "SEC_LOG", nullable = false, length = 8)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SEC_LOGIN")
    @SequenceGenerator(name = "SEC_LOGIN", sequenceName = "SEC_REGISTRO_LOGIN", allocationSize = 1)
    private Integer secLog;

    @Column(name = "USERNAME", nullable = false, length = 50)
    private String username;

    @Column(name = "IP", nullable = false, length = 16)
    private String ip;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "FECHA", nullable = false)
    private Date fecha;
    @Column(name = "RESULTADO", nullable = false, length = 3)
    private String resultado;

    public RegistroLogin() {
    }

    public RegistroLogin(Integer secLog) {
        this.secLog = secLog;
    }

    public Integer getSecLog() {
        return secLog;
    }

    public void setSecLog(Integer secLog) {
        this.secLog = secLog;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getResultado() {
        return resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.secLog);
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
        final RegistroLogin other = (RegistroLogin) obj;
        if (!Objects.equals(this.secLog, other.secLog)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RegistroLogin{" + "secLog=" + secLog + '}';
    }

}
