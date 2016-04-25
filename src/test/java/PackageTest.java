import org.junit.*;
import static org.junit.Assert.*;

public class PackageTest {

  @Test
  public void PackageTest_InstantiatePackageWeight_int() {
    Package testPackage = new Package(2, 2, 2, 2);
    assertEquals(2, testPackage.getWeight());
  }
  @Test
  public void PackageTest_InstantiatePackageLength_int() {
    Package testPackage = new Package(2, 2, 2, 2);
    assertEquals(2, testPackage.getLength());
  }
  @Test
  public void PackageTest_InstantiatePackageWidth_int() {
    Package testPackage = new Package(2, 2, 2, 2);
    assertEquals(2, testPackage.getWidth());
  }
  @Test
  public void PackageTest_InstantiatePackageDepth_int() {
    Package testPackage = new Package(2, 2, 2, 2);
    assertEquals(2, testPackage.getDepth());
  }
  @Test
  public void PackageTest_FindPackageVolume_int() {
    Package testPackage = new Package(2, 2, 2, 2);
    assertEquals(8, testPackage.getVolume());
  }
  @Test
  public void PackageTest_FindPackageCost_String() {
    Package testPackage = new Package(2, 2, 2, 2);
    assertEquals("8.00", testPackage.getShipped());
  }


}
