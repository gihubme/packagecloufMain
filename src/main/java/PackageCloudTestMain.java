import org.nnn4eu.test.MainJavaSE;
import org.nnn4eu.test.model.Account;
import org.nnn4eu.test.service.AccountService;

import javax.inject.Inject;
import java.util.List;

public class PackageCloudTestMain {
    public static void main(String[] args){
        System.out.println("PackageCloudTestMain Application starting");
        MainJavaSE.initialize();
        AccountService service=MainJavaSE.getWeldContainer().select(AccountService.class).get();
        dosome(service);
    }

    public static void dosome(AccountService service) {
        System.out.println("PackageCloudTestMain Application starting");

        // MyService object injected by CDI
        List<Account> accs=service.generateMany(3);
        assert(accs.size()==3 && accs.get(0).getAddresses().size()>0):"did not work";
        System.out.println("MainJavaSE, 1st account: "+ accs.get(0));
    }
}
