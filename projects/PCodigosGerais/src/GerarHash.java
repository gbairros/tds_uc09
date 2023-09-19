import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class GerarHash {
    public static void main(String[] args) {
        MessageDigest md;
        String senhaTextoClaro = "SENAC 2023";
        try {
            md = MessageDigest.getInstance("MD5");
            BigInteger hash = new BigInteger(1, md.digest(senhaTextoClaro.getBytes()));
            String senhaCripto = hash.toString(16);
            System.out.println(senhaCripto);

        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }

    }

}
