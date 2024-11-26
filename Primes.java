public class Primes {
    public static void main(String[] args) {
        int number = Integer.parseInt(args[0]);
        boolean[] isPrime= new boolean[number + 1];
        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }
        for (int i = 2; i < Math.sqrt(number); i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i + 1; j < isPrime.length; j++) {
                if (isPrime[j] && j % i == 0) {
                    isPrime[j] = false;
                }
            }
        }
        System.out.printf("Prime numbers up to %d:\n", number);
        int counter = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.println(i);
                counter++;
            }
        }
        int percentage = 100 * counter / number;
        System.out.printf("There are %d primes between 2 and %d (%d%% are primes)", counter, number, percentage);

    }
}