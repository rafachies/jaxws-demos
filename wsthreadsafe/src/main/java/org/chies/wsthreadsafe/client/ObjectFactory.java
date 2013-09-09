
package org.chies.wsthreadsafe.client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.rchies package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetHouse_QNAME = new QName("rchies.org", "getHouse");
    private final static QName _GetCompanyResponse_QNAME = new QName("rchies.org", "getCompanyResponse");
    private final static QName _GetCarResponse_QNAME = new QName("rchies.org", "getCarResponse");
    private final static QName _GetCompany_QNAME = new QName("rchies.org", "getCompany");
    private final static QName _GetHouseResponse_QNAME = new QName("rchies.org", "getHouseResponse");
    private final static QName _GetCar_QNAME = new QName("rchies.org", "getCar");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.rchies
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompany }
     * 
     */
    public GetCompany createGetCompany() {
        return new GetCompany();
    }

    /**
     * Create an instance of {@link GetHouseResponse }
     * 
     */
    public GetHouseResponse createGetHouseResponse() {
        return new GetHouseResponse();
    }

    /**
     * Create an instance of {@link GetCar }
     * 
     */
    public GetCar createGetCar() {
        return new GetCar();
    }

    /**
     * Create an instance of {@link GetHouse }
     * 
     */
    public GetHouse createGetHouse() {
        return new GetHouse();
    }

    /**
     * Create an instance of {@link GetCompanyResponse }
     * 
     */
    public GetCompanyResponse createGetCompanyResponse() {
        return new GetCompanyResponse();
    }

    /**
     * Create an instance of {@link GetCarResponse }
     * 
     */
    public GetCarResponse createGetCarResponse() {
        return new GetCarResponse();
    }

    /**
     * Create an instance of {@link Car }
     * 
     */
    public Car createCar() {
        return new Car();
    }

    /**
     * Create an instance of {@link Company }
     * 
     */
    public Company createCompany() {
        return new Company();
    }

    /**
     * Create an instance of {@link House }
     * 
     */
    public House createHouse() {
        return new House();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHouse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "rchies.org", name = "getHouse")
    public JAXBElement<GetHouse> createGetHouse(GetHouse value) {
        return new JAXBElement<GetHouse>(_GetHouse_QNAME, GetHouse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompanyResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "rchies.org", name = "getCompanyResponse")
    public JAXBElement<GetCompanyResponse> createGetCompanyResponse(GetCompanyResponse value) {
        return new JAXBElement<GetCompanyResponse>(_GetCompanyResponse_QNAME, GetCompanyResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCarResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "rchies.org", name = "getCarResponse")
    public JAXBElement<GetCarResponse> createGetCarResponse(GetCarResponse value) {
        return new JAXBElement<GetCarResponse>(_GetCarResponse_QNAME, GetCarResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompany }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "rchies.org", name = "getCompany")
    public JAXBElement<GetCompany> createGetCompany(GetCompany value) {
        return new JAXBElement<GetCompany>(_GetCompany_QNAME, GetCompany.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetHouseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "rchies.org", name = "getHouseResponse")
    public JAXBElement<GetHouseResponse> createGetHouseResponse(GetHouseResponse value) {
        return new JAXBElement<GetHouseResponse>(_GetHouseResponse_QNAME, GetHouseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "rchies.org", name = "getCar")
    public JAXBElement<GetCar> createGetCar(GetCar value) {
        return new JAXBElement<GetCar>(_GetCar_QNAME, GetCar.class, null, value);
    }

}
