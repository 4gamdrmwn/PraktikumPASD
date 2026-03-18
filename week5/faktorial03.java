package week5;

public class faktorial03 {

   

   int faktorialBF(int n) {
    int fakto = 1;
    int i = 1;
    do {
        fakto = fakto * i;
        i++;
    } while (i <= n);
    return fakto;
}

    int faktorialDC(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            int fakto = n * faktorialDC(n - 1);
            return fakto;
        }
    }

}  