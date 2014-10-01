package com.pabloct.epgrecaudacion.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "recaudacion")
public class Recaudacion {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "moneda")
    private String moneda;

    @Column(name = "dependencia")
    private String dependencia;

    @Column(name = "concepto")
    private String concepto;

    @Column(name = "a")
    private String a;

    @Column(name = "b")
    private String b;

    @Column(name = "numero_recibo")
    private Long numeroRecibo;

    @Column(name = "codigo")
    private String codigo;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "importe")
    private float importe;

    @Column(name = "carnet")
    @Temporal(TemporalType.DATE)
    private Date carnet;

    @Column(name = "autoseguro")
    private String autoseguro;

    @Column(name = "ave")
    private String ave;

    @Column(name = "devolucion_transferencia")
    private String devolucionTransferencia;

    @Column(name = "observaciones")
    private String observaciones;

    @Column(name = "fecha")
    private String fechaDeposito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setMoneda(String moneda) {
        this.moneda = moneda;
    }

    public String getDependencia() {
        return dependencia;
    }

    public void setDependencia(String dependencia) {
        this.dependencia = dependencia;
    }

    public String getConcepto() {
        return concepto;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public void setB(String b) {
        this.b = b;
    }

    public Long getNumeroRecibo() {
        return numeroRecibo;
    }

    public void setNumeroRecibo(Long numeroRecibo) {
        this.numeroRecibo = numeroRecibo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public Date getCarnet() {
        return carnet;
    }

    public void setCarnet(Date carnet) {
        this.carnet = carnet;
    }

    public String getAutoseguro() {
        return autoseguro;
    }

    public void setAutoseguro(String autoseguro) {
        this.autoseguro = autoseguro;
    }

    public String getAve() {
        return ave;
    }

    public void setAve(String ave) {
        this.ave = ave;
    }

    public String getDevolucionTransferencia() {
        return devolucionTransferencia;
    }

    public void setDevolucionTransferencia(String devolucionTransferencia) {
        this.devolucionTransferencia = devolucionTransferencia;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public String getFechaDeposito() {
        return fechaDeposito;
    }

    public void setFechaDeposito(String fechaDeposito) {
        this.fechaDeposito = fechaDeposito;
    }
    
    
};
