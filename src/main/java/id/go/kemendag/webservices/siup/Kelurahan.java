//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.05 at 11:59:20 AM ICT 
//


package id.go.kemendag.webservices.siup;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://kemendag.go.id/webservices/siup}id"/>
 *         &lt;element ref="{http://kemendag.go.id/webservices/siup}kode"/>
 *         &lt;element ref="{http://kemendag.go.id/webservices/siup}nama"/>
 *         &lt;element ref="{http://kemendag.go.id/webservices/siup}kodepos"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "id",
    "kode",
    "nama",
    "kodepos"
})
@XmlRootElement(name = "kelurahan")
public class Kelurahan {

    @XmlElement(required = true)
    protected BigInteger id;
    @XmlElement(required = true)
    protected String kode;
    @XmlElement(required = true)
    protected String nama;
    @XmlElement(required = true)
    protected BigInteger kodepos;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setId(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the kode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKode() {
        return kode;
    }

    /**
     * Sets the value of the kode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKode(String value) {
        this.kode = value;
    }

    /**
     * Gets the value of the nama property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNama() {
        return nama;
    }

    /**
     * Sets the value of the nama property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNama(String value) {
        this.nama = value;
    }

    /**
     * Gets the value of the kodepos property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getKodepos() {
        return kodepos;
    }

    /**
     * Sets the value of the kodepos property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setKodepos(BigInteger value) {
        this.kodepos = value;
    }

}
