package com.judell.playground.data_type_values;

public class MinMaxDataTypeValues {

    /**
     *Prints each data type bit size and min and max value
     */
    public static void main(String[] args) {
        displaySizeMinAndMax(Byte.TYPE, Byte.SIZE, Byte.MIN_VALUE, Byte.MAX_VALUE);
        displaySizeMinAndMax(Short.TYPE, Short.SIZE, Short.MIN_VALUE, Short.MAX_VALUE);
        displaySizeMinAndMax(Character.TYPE, Character.SIZE, (int) Character.MIN_VALUE, (int) Character.MAX_VALUE);
        displaySizeMinAndMax(Integer.TYPE, Integer.SIZE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        displaySizeMinAndMax(Long.TYPE, Long.SIZE, Long.MIN_VALUE, Long.MAX_VALUE);
        displaySizeMinAndMax(Float.TYPE, Float.SIZE, Float.MIN_VALUE, Float.MAX_VALUE);
        displaySizeMinAndMax(Double.TYPE, Double.SIZE, Double.MIN_VALUE, Double.MAX_VALUE);
    }

    /**
     *Formats the output
     */
    public static void displaySizeMinAndMax(Class<?> type, int size, Number min, Number max) {
        System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, max);
//        System.out.printf("type:%-6s size:%-2s min:%-20s max:%s\n", type, size, min, NumberFormat.getInstance().format(max));
    }
}
