public class Hanoi {
    public void solveHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + from + " to " + to);
            return;
        }
        solveHanoi(n - 1, from, aux, to);
        System.out.println("Move disk " + n + " from " + from + " to " + to);
        solveHanoi(n - 1, aux, to, from);
    }
    public static void main(String[] args) {
        Hanoi hanoi = new Hanoi();
        int n = 3; // number of disks
        hanoi.solveHanoi(n, 'A', 'C', 'B'); // A is source, C is target, B is auxiliary
    }
}
