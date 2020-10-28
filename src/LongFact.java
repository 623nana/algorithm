import java.math.BigInteger;

/* 2020-10-28 */
public class LongFact {
  public static void main(String[] args) {
    //long 보다 큰,,,BigInteger 쓰는 법!
    BigInteger answer = new BigInteger("1");

    for(int i = 25 ; i >= 1; i--) {
      answer = answer.multiply(BigInteger.valueOf(i));
    }
    System.out.print(answer);
  }
}
