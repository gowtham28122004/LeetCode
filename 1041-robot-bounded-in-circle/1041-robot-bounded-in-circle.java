public class Solution {
    public boolean isRobotBounded(String instructions) {
        int left[] = new int[]{-1,0};
        int right[] = new int[]{1,0};
        int up[] = new int[]{0,1};
        int down[] = new int[]{0,-1};

        int[] currentDirection = new int[]{0,1};
        int currentX = 0;
        int currentY = 0;

        for(int i = 0; i < instructions.length(); i++) {
            char c = instructions.charAt(i);

            if(c == 'G') {
                currentX += currentDirection[0];
                currentY += currentDirection[1];
            } else if(c == 'L') {
                if(Arrays.equals(currentDirection, up)) currentDirection = left;
                else if(Arrays.equals(currentDirection, left)) currentDirection = down;
                else if(Arrays.equals(currentDirection, down)) currentDirection = right;
                else if(Arrays.equals(currentDirection, right)) currentDirection = up;
            } else if(c == 'R') {
                if(Arrays.equals(currentDirection, up)) currentDirection = right;
                else if(Arrays.equals(currentDirection, left)) currentDirection = up;
                else if(Arrays.equals(currentDirection, down)) currentDirection = left;
                else if(Arrays.equals(currentDirection, right)) currentDirection = down;
            }
        }
        if((currentX == 0 && currentY == 0) || !Arrays.equals(currentDirection, up))
            return true;
        return false;
    }
}
