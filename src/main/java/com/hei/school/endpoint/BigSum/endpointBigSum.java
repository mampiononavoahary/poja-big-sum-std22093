import java.math.BigInteger;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import poja.big.sum.service.event.BigSumService;@RestController
@AllArgsConstructor
public class BigSumController {
    private final BigSumService service;
    @GetMapping("/big-sum")
    public BigInteger add(@RequestParam(name = "a") String a,
                          @RequestParam(name = "b") String b) {
        return service.add(a, b);
    }
}
service :
        import java.math.BigInteger;
        import org.springframework.stereotype.Service;
@Service
public class BigSumService {
    public BigInteger add(String a, String b) {
        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);
        return bigA.add(bigB);
    }
}