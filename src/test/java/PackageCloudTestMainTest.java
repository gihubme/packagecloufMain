import org.junit.jupiter.api.Test;
import org.nnn4eu.test.MainJavaSE;
import org.nnn4eu.test.model.Account;
import org.nnn4eu.test.service.AccountService;
import org.nnn4eu.test.service.AccountServiceImpl;
import org.nnn4eu.test.service.EmailServiceImpl;
import org.nnn4eu.test.service.MAdressServiceImpl;

import javax.inject.Inject;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PackageCloudTestMainTest {

    AccountService service=new AccountServiceImpl(new EmailServiceImpl(),new MAdressServiceImpl());
    @Test
    void justAnExample() {
        System.out.println("PackageCloudTestMainIT Application starting");

        List<Account> accs=service.generateMany(3);
        assertEquals(accs.size(),3);
        assertTrue(accs.get(0).getAddresses().size()>0);
        System.out.println("MainJavaSE, 1st account: "+ accs.get(0));
    }
}
