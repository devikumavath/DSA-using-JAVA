
public class shortestPath {
    
    public static double getShortestPath(String path) {   // 0(n)

        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {

            char dir = path.charAt(i);
            // north
            if (dir == 'N') {
                y++;
            }
            // south
            else if (dir == 'S') {
                y--;
            }

            else if (dir == 'E') {
                x++;

            }

            else {
                x--;
            }

        }

        System.out.println(x + " " + y);

        double x2 = x * x;
        double y2 = y * y;

        return Math.sqrt(x2 + y2);

    }

    public static void main(String[] args) {
        /*
         * n - north(up) y+1
         * s - south(down) y-1
         * e - east(right) x+1
         * w - west(left) x-1
         * displacement formula for shortest path
         */

        String path = "WNEENESENNN";

        System.out.println(getShortestPath(path));
    }

}
