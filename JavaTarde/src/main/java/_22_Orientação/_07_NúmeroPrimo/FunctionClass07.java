package _22_Orientação._07_NúmeroPrimo;

public class FunctionClass07 {
    public int num;
    public String aux;

    public String aux() {
        boolean primo = num > 1;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                primo = false;
                break;
            }
        }

        aux = (num + (primo ? " é primo" : " não é primo"));
return aux;
    }
}
