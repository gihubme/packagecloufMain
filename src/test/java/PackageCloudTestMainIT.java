import org.junit.jupiter.api.Test;
import org.nnn4eu.test.MainJavaSE;
import org.nnn4eu.test.model.Account;
import org.nnn4eu.test.service.AccountService;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class PackageCloudTestMainIT {
    @Test
    void justAnExample() {
        System.out.println("PackageCloudTestMainIT Application starting");
        MainJavaSE.initialize();
        AccountService service=MainJavaSE.getWeldContainer().select(AccountService.class).get();

        List<Account> accs=service.generateMany(3);
        assertEquals(accs.size(),3);
        assertTrue(accs.get(0).getAddresses().size()>0);
        System.out.println("MainJavaSE, 1st account: "+ accs.get(0));
    }
}
