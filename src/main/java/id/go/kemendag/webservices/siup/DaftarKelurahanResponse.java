//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.05 at 11:59:20 AM ICT 
//


package id.go.kemendag.webservices.siup;

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
 *         &lt;element ref="{http://kemendag.go.id/webservices/siup}daftarKelurahan"/>
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
    "daftarKelurahan"
})
@XmlRootElement(name = "daftarKelurahanResponse")
public class DaftarKelurahanResponse {

    @XmlElement(required = true)
    protected DaftarKelurahan daftarKelurahan;

    /**
     * Gets the value of the daftarKelurahan property.
     * 
     * @return
     *     possible object is
     *     {@link DaftarKelurahan }
     *     
     */
    public DaftarKelurahan getDaftarKelurahan() {
        return daftarKelurahan;
    }

    /**
     * Sets the value of the daftarKelurahan property.
     * 
     * @param value
     *     allowed object is
     *     {@link DaftarKelurahan }
     *     
     */
    public void setDaftarKelurahan(DaftarKelurahan value) {
        this.daftarKelurahan = value;
    }

}
