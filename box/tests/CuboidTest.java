import org.junit.Test;

import static org.junit.Assert.*;

public class CuboidTest {

  int a = 2;
  int b = 3;
  int c = 4;
  int surface = 2 * (a * b + b * c + c * a);
  int volume = 2 * 3 * 4;

  Cuboid cuboid = new Cuboid(a, b, c);

  @Test
  public void testConstructor_a() throws Exception {
    assertEquals(cuboid.a, a);
  }

  @Test
  public void testConstructor_b() throws Exception {
    assertEquals(cuboid.b, b);
  }

  @Test
  public void testConstructor_c() throws Exception {
    assertEquals(cuboid.c, c);
  }

  @Test
  public void getSurface() throws Exception {
    assertEquals(cuboid.getSurface(), surface);
  }

  @Test
  public void getVolume() throws Exception {
  }

}