package maratonajava.javacore.ZZGconcorrencia.dominio;

// storeName:price:discountCode:
public class Discount {
    public enum Code {
        NONE(0), SUPER_SAYAJIN(5), SUPER_SAYAJIN2(10), SUPER_SAYAJIN3(15);

        private final int percentege;

        Code(int percentege) {
            this.percentege = percentege;
        }

        public int getPercentege() {
            return percentege;
        }
    }
}
