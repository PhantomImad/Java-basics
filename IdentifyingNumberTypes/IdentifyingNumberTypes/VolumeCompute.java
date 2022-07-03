package IdentifyingNumberTypes;

import java.util.Scanner;

public class VolumeCompute {
    double vc, vs, vcd;

    void volumecube(int s) {
        vc = s * s * s;
        System.out.println("Volume of cube = " + vc);
    }

    void volumesphere(float r) {
        vs = 4 / 3 * 22 / 7 * r * r * r;
        System.out.println("Volume of sphere = " + vs);
    }

    void volumecuboid(int l, int b, int h) {
        vcd = l * b * h;
        System.out.println("Volume of cuboid = " + vcd);
    }

    public static void main(String args[]) {
        int s, l, b, h;
        float r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of side of a cube");
        s = sc.nextInt();
        System.out.println("Enter the value of radius of a circle");
        r = sc.nextFloat();
        System.out.println("Enter the length of the cuboid");
        l = sc.nextInt();
        System.out.println("Enter the breadth of the cuboid");
        b = sc.nextInt();
        System.out.println("Enter the height of the cuboid");
        h = sc.nextInt();
        VolumeCompute obj = new VolumeCompute();
        obj.volumecube(s);
        obj.volumesphere(r);
        obj.volumecuboid(l, b, h);
    }
}
