//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.11.05 at 06:58:12 AM ICT 
//


package generated;

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
 *         &lt;element ref="{}pencarian"/>
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
    "pencarian"
})
@XmlRootElement(name = "daftarKelurahanRequest")
public class DaftarKelurahanRequest {

    @XmlElement(required = true)
    protected Pencarian pencarian;

    /**
     * Gets the value of the pencarian property.
     * 
     * @return
     *     possible object is
     *     {@link Pencarian }
     *     
     */
    public Pencarian getPencarian() {
        return pencarian;
    }

    /**
     * Sets the value of the pencarian property.
     * 
     * @param value
     *     allowed object is
     *     {@link Pencarian }
     *     
     */
    public void setPencarian(Pencarian value) {
        this.pencarian = value;
    }

}
