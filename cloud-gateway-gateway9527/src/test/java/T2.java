import java.time.ZonedDateTime;

/** @Author seapein */
public class T2 {
  public static void main(String[] args) {
    ZonedDateTime zbj = ZonedDateTime.now(); // 默认时区
    System.out.println(zbj);
    // 2020-05-06T17:26:08.110+08:00[Asia/Shanghai]
  }
}
