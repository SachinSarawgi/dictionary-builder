//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.6 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2013.02.24 � 10:33:56 PM CET 
//


package org.edla.wikimediaschema;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour SiteInfoType complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="SiteInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sitename" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="base" type="{http://www.w3.org/2001/XMLSchema}anyURI" minOccurs="0"/>
 *         &lt;element name="generator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="case" type="{http://www.mediawiki.org/xml/export-0.8/}CaseType" minOccurs="0"/>
 *         &lt;element name="namespaces" type="{http://www.mediawiki.org/xml/export-0.8/}NamespacesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SiteInfoType", propOrder = {
    "sitename",
    "base",
    "generator",
    "_case",
    "namespaces"
})
public class SiteInfoType {

    protected String sitename;
    @XmlSchemaType(name = "anyURI")
    protected String base;
    protected String generator;
    @XmlElement(name = "case")
    protected CaseType _case;
    protected NamespacesType namespaces;

    /**
     * Obtient la valeur de la propri�t� sitename.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSitename() {
        return sitename;
    }

    /**
     * D�finit la valeur de la propri�t� sitename.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSitename(String value) {
        this.sitename = value;
    }

    /**
     * Obtient la valeur de la propri�t� base.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBase() {
        return base;
    }

    /**
     * D�finit la valeur de la propri�t� base.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBase(String value) {
        this.base = value;
    }

    /**
     * Obtient la valeur de la propri�t� generator.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGenerator() {
        return generator;
    }

    /**
     * D�finit la valeur de la propri�t� generator.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGenerator(String value) {
        this.generator = value;
    }

    /**
     * Obtient la valeur de la propri�t� case.
     * 
     * @return
     *     possible object is
     *     {@link CaseType }
     *     
     */
    public CaseType getCase() {
        return _case;
    }

    /**
     * D�finit la valeur de la propri�t� case.
     * 
     * @param value
     *     allowed object is
     *     {@link CaseType }
     *     
     */
    public void setCase(CaseType value) {
        this._case = value;
    }

    /**
     * Obtient la valeur de la propri�t� namespaces.
     * 
     * @return
     *     possible object is
     *     {@link NamespacesType }
     *     
     */
    public NamespacesType getNamespaces() {
        return namespaces;
    }

    /**
     * D�finit la valeur de la propri�t� namespaces.
     * 
     * @param value
     *     allowed object is
     *     {@link NamespacesType }
     *     
     */
    public void setNamespaces(NamespacesType value) {
        this.namespaces = value;
    }

}
