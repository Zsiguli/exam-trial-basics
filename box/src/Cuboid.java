public class Cuboid {
  int a;
  int b;
  int c;

  public Cuboid(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public int getSurface() {
    int surface;
    surface = 2 * (a * b + a * c + b * c);
    return surface;
  }

  public int getVolume() {
    int volume;
    volume = a * b * c;
    return volume;
  }
}
