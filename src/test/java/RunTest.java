import org.junit.*;

public class RunTest {

    public static String s = "AAA";

    @Before
    public void BTest(){
        System.out.println("This method before test");
    }

    @Test
    public void Test1(){
        String s1 = "";
        for(int i=0;i<3;i++){
            s1+="A"; //псевдометод который генерирует текст исходя из определенных правил
        }

        Assert.assertEquals("s1!=s",s1,s);
        System.out.println("Good test");
    }

    @Test
    public void Test2(){

        String s1 = "";
        for(int i=0;i<5;i++){
            s1+="A";
        }

        Assert.assertEquals("s1!=s",s1,s);
        System.out.println("Bad test");
    }

    @After
    public void Atest(){
        System.out.println("This method after test");
    }
}
