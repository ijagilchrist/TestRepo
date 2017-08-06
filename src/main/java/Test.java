/**
 * Created by igilchrist on 06/08/17.
 */
public class Test {

    private static Test ourInstance = new Test();

    public static Test getInstance() {
        return ourInstance;
    }

    private Test() {
        System.out.println("Test()")
    }

}
