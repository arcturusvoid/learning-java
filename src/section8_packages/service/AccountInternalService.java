package section8_packages.service;


import java.util.UUID;

// Accessible only on the package
class AccountInternalService {
    public String generateAccountID(){
        return UUID.randomUUID().toString();
    }
}
