import java.util.ArrayList;

public class ArrayListDemo
{
    public static void main(String[] args) {
        ArrayList list = new ArrayList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for(int i=0;i<list.size();i++)
        {
            System.out.println(i) ;
        }


    }

}
