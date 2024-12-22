
package proxy;

import java.math.BigDecimal;
import java.util.List;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;
import jakarta.xml.bind.annotation.XmlSeeAlso;
import jakarta.xml.ws.Action;
import jakarta.xml.ws.RequestWrapper;
import jakarta.xml.ws.ResponseWrapper;


/**
 * This class was generated by the XML-WS Tools.
 * XML-WS Tools 4.0.3
 * Generated source version: 3.0
 * 
 */
@WebService(name = "BankService", targetNamespace = "http://ws/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface BankService {


    /**
     * 
     * @param amount
     * @return
     *     returns java.math.BigDecimal
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "convertEuroToDh", targetNamespace = "http://ws/", className = "proxy.ConvertEuroToDh")
    @ResponseWrapper(localName = "convertEuroToDhResponse", targetNamespace = "http://ws/", className = "proxy.ConvertEuroToDhResponse")
    @Action(input = "http://ws/BankService/convertEuroToDhRequest", output = "http://ws/BankService/convertEuroToDhResponse")
    public BigDecimal convertEuroToDh(
        @WebParam(name = "amount", targetNamespace = "")
        double amount);

    /**
     * 
     * @return
     *     returns java.util.List<proxy.BankAccount>
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBankAccounts", targetNamespace = "http://ws/", className = "proxy.GetBankAccounts")
    @ResponseWrapper(localName = "getBankAccountsResponse", targetNamespace = "http://ws/", className = "proxy.GetBankAccountsResponse")
    @Action(input = "http://ws/BankService/getBankAccountsRequest", output = "http://ws/BankService/getBankAccountsResponse")
    public List<BankAccount> getBankAccounts();

    /**
     * 
     * @param code
     * @return
     *     returns proxy.BankAccount
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getBankAccount", targetNamespace = "http://ws/", className = "proxy.GetBankAccount")
    @ResponseWrapper(localName = "getBankAccountResponse", targetNamespace = "http://ws/", className = "proxy.GetBankAccountResponse")
    @Action(input = "http://ws/BankService/getBankAccountRequest", output = "http://ws/BankService/getBankAccountResponse")
    public BankAccount getBankAccount(
        @WebParam(name = "code", targetNamespace = "")
        int code);

}
