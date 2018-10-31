@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureStubRunner(ids = {"com.example:http-server:+:stubs:8080"}, stubsMode = StubRunnerProperties.StubsMode.LOCAL)
public class LoanApplicationServiceTests {

}