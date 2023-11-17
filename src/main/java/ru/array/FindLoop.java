package ru.array;

public class FindLoop {
    public static int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }

    public static int indexInRange(int[] data, int el, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
          if (el == data[i]) {
              result = i;
              break;
          }
        }
        return result;
    }
}
