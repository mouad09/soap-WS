package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

@WebService (serviceName = "BankWS")
public class BankService {
    @WebMethod
    public BigDecimal convertEuroToDh(@WebParam(name = "amount") double amount){
        double euroPrice = 10.47;
        double result = amount * euroPrice;
        return new BigDecimal(result).setScale(2, RoundingMode.HALF_UP);
    }

    @WebMethod
    public BankAccount getBankAccount(@WebParam(name = "code") int code){
        return new BankAccount(code, Math.random() * 5426);
    }
    @WebMethod
    public List<BankAccount> getBankAccounts(){
        return List.of(
                new BankAccount(1, Math.random() * 5426),
                new BankAccount(2, Math.random() * 5426),
                new BankAccount(3, Math.random() * 5426));
    };
}