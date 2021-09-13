package site.ycsb.generator;
import java.util.Random;

/**
 * Generates a sequence of values favoring lower value items.
 */
public class DisadvantageGenerator extends NumberGenerator {

  public DisadvantageGenerator() {
        
  }

  /**
   * Generate the next value in the distribution.
   */
  @Override
  public Long nextValue() {
    Random rand = new Random();

    long rand1 = (long) rand.nextInt(1000);
    long rand2 = (long) rand.nextInt(1000);
    long rand3 = (long) rand.nextInt(1000);
    long rand5 = (long) rand.nextInt(1000);
    long rand4 = (long) rand.nextInt(1000);

    return min(rand1, rand2, rand3, rand4, rand5);
  }

  private static long min(long a, long b, long c, long d, long e) {
    return Math.min(a, Math.min(b, Math.min(c, Math.min(d, e))));
  }

  @Override
  public double mean() {
    throw new UnsupportedOperationException("Can't compute mean of non-stationary distribution!");
  }
}
  