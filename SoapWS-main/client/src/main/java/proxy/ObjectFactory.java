
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ConvertEuroToDh_QNAME = new QName("http://ws/", "convertEuroToDh");
    private static final QName _ConvertEuroToDhResponse_QNAME = new QName("http://ws/", "convertEuroToDhResponse");
    private static final QName _GetBankAccount_QNAME = new QName("http://ws/", "getBankAccount");
    private static final QName _GetBankAccountResponse_QNAME = new QName("http://ws/", "getBankAccountResponse");
    private static final QName _GetBankAccounts_QNAME = new QName("http://ws/", "getBankAccounts");
    private static final QName _GetBankAccountsResponse_QNAME = new QName("http://ws/", "getBankAccountsResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ConvertEuroToDh }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDh }
     */
    public ConvertEuroToDh createConvertEuroToDh() {
        return new ConvertEuroToDh();
    }

    /**
     * Create an instance of {@link ConvertEuroToDhResponse }
     * 
     * @return
     *     the new instance of {@link ConvertEuroToDhResponse }
     */
    public ConvertEuroToDhResponse createConvertEuroToDhResponse() {
        return new ConvertEuroToDhResponse();
    }

    /**
     * Create an instance of {@link GetBankAccount }
     * 
     * @return
     *     the new instance of {@link GetBankAccount }
     */
    public GetBankAccount createGetBankAccount() {
        return new GetBankAccount();
    }

    /**
     * Create an instance of {@link GetBankAccountResponse }
     * 
     * @return
     *     the new instance of {@link GetBankAccountResponse }
     */
    public GetBankAccountResponse createGetBankAccountResponse() {
        return new GetBankAccountResponse();
    }

    /**
     * Create an instance of {@link GetBankAccounts }
     * 
     * @return
     *     the new instance of {@link GetBankAccounts }
     */
    public GetBankAccounts createGetBankAccounts() {
        return new GetBankAccounts();
    }

    /**
     * Create an instance of {@link GetBankAccountsResponse }
     * 
     * @return
     *     the new instance of {@link GetBankAccountsResponse }
     */
    public GetBankAccountsResponse createGetBankAccountsResponse() {
        return new GetBankAccountsResponse();
    }

    /**
     * Create an instance of {@link BankAccount }
     * 
     * @return
     *     the new instance of {@link BankAccount }
     */
    public BankAccount createBankAccount() {
        return new BankAccount();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDh }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDh }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertEuroToDh")
    public JAXBElement<ConvertEuroToDh> createConvertEuroToDh(ConvertEuroToDh value) {
        return new JAXBElement<>(_ConvertEuroToDh_QNAME, ConvertEuroToDh.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDhResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertEuroToDhResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertEuroToDhResponse")
    public JAXBElement<ConvertEuroToDhResponse> createConvertEuroToDhResponse(ConvertEuroToDhResponse value) {
        return new JAXBElement<>(_ConvertEuroToDhResponse_QNAME, ConvertEuroToDhResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAccount }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankAccount }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBankAccount")
    public JAXBElement<GetBankAccount> createGetBankAccount(GetBankAccount value) {
        return new JAXBElement<>(_GetBankAccount_QNAME, GetBankAccount.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAccountResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankAccountResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBankAccountResponse")
    public JAXBElement<GetBankAccountResponse> createGetBankAccountResponse(GetBankAccountResponse value) {
        return new JAXBElement<>(_GetBankAccountResponse_QNAME, GetBankAccountResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAccounts }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankAccounts }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBankAccounts")
    public JAXBElement<GetBankAccounts> createGetBankAccounts(GetBankAccounts value) {
        return new JAXBElement<>(_GetBankAccounts_QNAME, GetBankAccounts.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetBankAccountsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetBankAccountsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getBankAccountsResponse")
    public JAXBElement<GetBankAccountsResponse> createGetBankAccountsResponse(GetBankAccountsResponse value) {
        return new JAXBElement<>(_GetBankAccountsResponse_QNAME, GetBankAccountsResponse.class, null, value);
    }

}
