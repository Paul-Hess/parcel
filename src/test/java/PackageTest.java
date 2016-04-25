import org.junit.*;
import static org.junit.Assert.*;

public class PackageTest {
  @Test
  public void PackageTest_InstantiatePackage_int() {
    Package testPackage = new Package(2, 2, 2, 3);
    assertEquals(2, testTriangle.getWeight());
  }
}
