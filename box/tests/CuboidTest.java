import org.junit.Test;

import static org.junit.Assert.*;

public class CuboidTest {

  int a = 2;
  int b = 3;
  int c = 4;

  @Test
  public void testConstructor_a() throws Exception {
    int a = 2;
    Cuboid cuboid = new Cuboid(a, b, c);
    assertEquals(cuboid.a, a);
  }

  @Test
  public void testConstructor_b() throws Exception {
    Cuboid cuboid = new Cuboid(a, b, c);
    assertEquals(cuboid.b, b);
  }

  @Test
  public void testConstructor_c() throws Exception {
    Cuboid cuboid = new Cuboid(a, b, c);
    assertEquals(cuboid.c, c);
  }

  @Test
  public void getSurface() throws Exception {
  }

  @Test
  public void getVolume() throws Exception {
  }

}