import sid.BanqueService;
import sid.BanqueWS;
import sid.Compte;

public class Client {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(800));

        Compte compte = stub.getCompte(1);
        System.out.println(compte.getCode());
        System.out.println(compte.getSolde());

    }
}
