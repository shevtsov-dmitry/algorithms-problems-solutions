import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

      void main() {
        convert("PAYPALISHIRING", 3);
    }
    public  void convert(String s, int rowsNum){

        int zigZagCharLength = rowsNum - 2;
        int columnsAmount = rowsNum - 1;
        List<LinkedList<Character>> list = new ArrayList<>();
        for (int i = 0; i < columnsAmount; i++) {
            list.add(new LinkedList<>());
        }

        int row = 0;
        for (int i = 0; i < s.length(); i++) {
            if(i == rowsNum + zigZagCharLength) {
                rowsNum+=rowsNum;
                zigZagCharLength+=zigZagCharLength;
                row++;
            }
            list.get(row).add(s.charAt(i));
        }
        System.out.println(list);
    }
