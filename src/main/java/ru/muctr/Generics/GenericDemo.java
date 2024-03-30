package ru.muctr.Generics;

/**
 * @author Evgenia Skichko
 */
public class GenericDemo {
    public static void main(String[] args) {
//        SimpleBox sbox1 = new SimpleBox(5);
//        SimpleBox sbox2 = new SimpleBox("Java");
//        System.out.println((int)sbox1.getObj() * 2);
//        System.out.println((int)sbox2.getObj() * 2);

        GenericBox<Integer> intBox = new GenericBox<>(5);
        GenericBox<Double> doubleBox = new GenericBox<>(5.0);
        GenericBox<?> numBox = new GenericBox<>(5.0);
        numBox = intBox;
        getNumberSum(intBox, doubleBox);

    }

    private static Number getNumberSum(GenericBox<?> intBox, GenericBox<?> doubleBox) {
        return intBox.getObj().doubleValue() + doubleBox.getObj().doubleValue();
    }


}
