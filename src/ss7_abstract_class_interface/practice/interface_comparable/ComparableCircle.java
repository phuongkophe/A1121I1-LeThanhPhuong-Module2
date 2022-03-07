package ss7_abstract_class_interface.practice.interface_comparable;

import ss6_inheritance.practice.he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if (getRadius() > o.getRadius()){
            return 1;
        }
        else if (getRadius() < o.getRadius()){
            return -1;
        }
        else {
            return 1;
        }
    }
}
