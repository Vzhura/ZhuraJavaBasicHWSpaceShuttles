public class SpaceShuttles {
    public static void main(String[] args) {
        int allShuttles = 100;

        for (int shuttleNumber = 1; shuttleNumber <= allShuttles; shuttleNumber++) {
            if (!UnluckyNumbers(shuttleNumber)) {
                System.out.println("Space Shuttle number " + shuttleNumber);
            }
        }
    }
    public static boolean UnluckyNumbers(int number) {
        while (number > 0) {
            int anotherNumber = number % 10;
            if (anotherNumber == 4 || anotherNumber == 9) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}

