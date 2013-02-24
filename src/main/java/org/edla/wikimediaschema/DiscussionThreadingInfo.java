//
// Ce fichier a �t� g�n�r� par l'impl�mentation de r�f�rence JavaTM Architecture for XML Binding (JAXB), v2.2.6 
// Voir <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Toute modification apport�e � ce fichier sera perdue lors de la recompilation du sch�ma source. 
// G�n�r� le : 2013.02.24 � 10:33:56 PM CET 
//


package org.edla.wikimediaschema;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour DiscussionThreadingInfo complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="DiscussionThreadingInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ThreadSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ThreadParent" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="ThreadAncestor" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="ThreadPage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ThreadID" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *         &lt;element name="ThreadAuthor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ThreadEditStatus" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ThreadType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiscussionThreadingInfo", propOrder = {
    "threadSubject",
    "threadParent",
    "threadAncestor",
    "threadPage",
    "threadID",
    "threadAuthor",
    "threadEditStatus",
    "threadType"
})
public class DiscussionThreadingInfo {

    @XmlElement(name = "ThreadSubject", required = true)
    protected String threadSubject;
    @XmlElement(name = "ThreadParent", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger threadParent;
    @XmlElement(name = "ThreadAncestor", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger threadAncestor;
    @XmlElement(name = "ThreadPage", required = true)
    protected String threadPage;
    @XmlElement(name = "ThreadID", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger threadID;
    @XmlElement(name = "ThreadAuthor", required = true)
    protected String threadAuthor;
    @XmlElement(name = "ThreadEditStatus", required = true)
    protected String threadEditStatus;
    @XmlElement(name = "ThreadType", required = true)
    protected String threadType;

    /**
     * Obtient la valeur de la propri�t� threadSubject.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadSubject() {
        return threadSubject;
    }

    /**
     * D�finit la valeur de la propri�t� threadSubject.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadSubject(String value) {
        this.threadSubject = value;
    }

    /**
     * Obtient la valeur de la propri�t� threadParent.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThreadParent() {
        return threadParent;
    }

    /**
     * D�finit la valeur de la propri�t� threadParent.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThreadParent(BigInteger value) {
        this.threadParent = value;
    }

    /**
     * Obtient la valeur de la propri�t� threadAncestor.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThreadAncestor() {
        return threadAncestor;
    }

    /**
     * D�finit la valeur de la propri�t� threadAncestor.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThreadAncestor(BigInteger value) {
        this.threadAncestor = value;
    }

    /**
     * Obtient la valeur de la propri�t� threadPage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadPage() {
        return threadPage;
    }

    /**
     * D�finit la valeur de la propri�t� threadPage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadPage(String value) {
        this.threadPage = value;
    }

    /**
     * Obtient la valeur de la propri�t� threadID.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getThreadID() {
        return threadID;
    }

    /**
     * D�finit la valeur de la propri�t� threadID.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setThreadID(BigInteger value) {
        this.threadID = value;
    }

    /**
     * Obtient la valeur de la propri�t� threadAuthor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadAuthor() {
        return threadAuthor;
    }

    /**
     * D�finit la valeur de la propri�t� threadAuthor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadAuthor(String value) {
        this.threadAuthor = value;
    }

    /**
     * Obtient la valeur de la propri�t� threadEditStatus.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadEditStatus() {
        return threadEditStatus;
    }

    /**
     * D�finit la valeur de la propri�t� threadEditStatus.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadEditStatus(String value) {
        this.threadEditStatus = value;
    }

    /**
     * Obtient la valeur de la propri�t� threadType.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getThreadType() {
        return threadType;
    }

    /**
     * D�finit la valeur de la propri�t� threadType.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setThreadType(String value) {
        this.threadType = value;
    }

}
