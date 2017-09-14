import PageFactory.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class LoginTest {
    WebDriver driver;
    private LoginPage loginPage;

    public LoginTest() {
    }

    @BeforeTest
    public void setUp() throws Exception {
        //System.setProperty("webdriver.chrome.driver","C:/Program Files/JetBrains/IntelliJ IDEA Community Edition 2017.1.4/plugins/chromedriver_win32");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://sso.symbotic.com/adfs/ls/?client-request-id=85d8acc1-fdff-40e1-a628-3a8e7b8828f3&username=vitalii_tkachov%40symbotic.com&wa=wsignin1.0&wtrealm=urn%3afederation%3aMicrosoftOnline&wctx=estsredirect%3d2%26estsrequest%3drQIIAXXRPWzTQAAF4Dhpo7ZCUDFUnVAHhqpSnLv4Jz9SJdw2TUJiuy12InuJHPscX-rzufZVacyMxIS6IbHBwFAxMSE21k4dEEJsICZGWFgQpBJiY3nTG56-t1WAPGzcrVWhCyDwSxKSYUn0R7BUExy3VK_JEDhVVIcQ3C9KAIiSkNxeWX336uOj378-33u52Xjy8PHmjwtuPWAsThvlshPHfEynKBlh3qWk_IbjrjjuIp_KgixIUqUqizVRhKAuVXmbHAVaZs7UTGUWOTrWMAB6yxR6Rkh0o8O0PY-orWamZtqxTbSJPTChZrhA2xszzegT-wEAdsvKesb4TDMUpg5sbBuKZBlWRd1Tp5_yt3TllAWV66AJztD3_LJPEzKMacqeFZ5yeoyijrdLowi5jL-uoYhh12GYRgcJjVHCMEq3zbNOnU08r-30ekMGBrDfPvVOTHcsOjslV8kmvqgGIUq6dckb0ZkdNEe0ng47fuLtQ9-S3UDQsVCLSORI5kEw6KsHmikTLJxRRsx9n7Yqh2HUDHeGcbvfC_cvCpv_PCMnnKU45ac48ug05SPEyn-B59j4daE4ZyY0uizcnO-NsLcRJ9THIbpa4L4t3ACFxtLSympuPbeR-7nAvVic3zdY-4q-5HeV59adrQ_vldzlYjk2ulSCekJOAsSUlPQVvU9hbIldcixZzelOvJu12azXHR9uCw14XuTOi8W3y_-9_Q81&popupui=");
    }

    @Test
    public void verifyLogin() {
        this.loginPage = (LoginPage)PageFactory.initElements(this.driver, LoginPage.class);
        this.loginPage.logIn("vitalii_tkachov@symbotic.com", "marynka!1");
    }

    @AfterTest
    public void tearDown() throws Exception {
    }
}