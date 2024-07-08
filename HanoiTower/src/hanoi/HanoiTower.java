package hanoi;

public class HanoiTower {
public static void solveHanoi(int disks, char startRod, char tempRod, char endRod) {
    if (disks == 1) {
        System.out.println("Move disk 1 from " + startRod + " to " + endRod);
        return;
    }
    solveHanoi(disks - 1, startRod, endRod, tempRod);
    System.out.println("Move disk " + disks + " from " + startRod + " to " + endRod);
    solveHanoi(disks - 1, tempRod, startRod, endRod);
}

public static void main(String[] args) {
    int numberOfDisks = 3;
    solveHanoi(numberOfDisks, 'X', 'Y', 'Z');
}
}