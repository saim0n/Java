public class cycle {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
        System.out.println(i);
        }

        boolean isTrue = true;
        int j = 1;
        while (isTrue) {
            System.out.println(j);
            j *= 2;
            if (j >=1025)
                isTrue = false;
        }

    }
}

