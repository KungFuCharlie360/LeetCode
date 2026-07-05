package com.practice;

public class RobotBoundedCircle {
    public char getDirection(char currentDirection, char command) {
        if (command == 'L') {
            switch (currentDirection) {
                case 'N':
                    return 'W';
                case 'S':
                    return 'E';
                case 'E':
                    return 'N';
                case 'W':
                    return 'S';
            }
        } else {
            switch (currentDirection) {
                case 'N':
                    return 'E';
                case 'S':
                    return 'W';
                case 'E':
                    return 'S';
                case 'W':
                    return 'N';
            }
        }
        return '\n';
    }

    public boolean passInstructions(int x, int y, char d, String instructions) {

        for (int i = 0; i < instructions.length(); i++) {
            System.out.println("Robot at x: "+x+" y :"+y+" d: "+ d);
            char command = instructions.charAt(i);
            if (command == 'G') {
                switch (d) {
                    case 'N':
                        y++;
                        break;
                    case 'S':
                        y--;
                        break;
                    case 'E':
                        x++;
                        break;
                    case 'W':
                        x--;
                        break;
                }
            } else {
                d = getDirection(d, command);
            }
        }
        System.out.println("Robot end of cycle at x: "+x+" y :"+y+" d: "+ d);
        return (x==0&&y==0)||d!='N';
    }

    public boolean isRobotBounded(String instructions) {
        int x = 0;
        int y = 0;
        char d = 'N';
        return passInstructions(x, y, d, instructions);
    }

    public static void main(String[] args) {
        String instructions = "GGLLGG";
        RobotBoundedCircle r = new RobotBoundedCircle();
        System.out.println("Output : "+r.isRobotBounded(instructions));
    }

}
