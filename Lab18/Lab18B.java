// Lab18bvst.java
// Merging 2 Lists Into 1
// This is the student, starting version of the Lab18b assignment.


import java.util.ArrayList;

public class Lab18B
{
    public static void main(String[] args)
    {
        int jsaList1[] = {101, 105, 115, 125, 145, 165, 175, 185, 195, 225, 235, 275, 305, 315, 325, 335, 345, 355, 375, 385};
        int jsaList2[] = {110, 120, 130, 140, 150, 160, 170, 180, 190, 200, 210, 220, 230, 240, 250, 270, 280, 320, 350, 400};

        Array list1 = new Array(jsaList1,"List #1");
        Array list2 = new Array(jsaList2,"List #2");
        Array list3 = new Array("Merged List");

        list3.merge(list1,list2);

        list1.display();
        list2.display();
        list3.display();

    }

}


class Array
{
    private ArrayList<Integer> list;
    private int size;
    private String listName;

    public Array(String ln)
    {
        list = new ArrayList<Integer>();
        size = 0;
        listName = ln;
    }

    public Array(int[] jsArray, String ln)
    {
        list = new ArrayList<Integer>();
        size = jsArray.length;
        listName = ln;
        for (int j = 0; j < size; j++)
            list.add( new Integer( jsArray[j] ));
    }

    public void display()
    {
        System.out.println("\n" + listName + ":\n");
        System.out.println(list + "\n");
    }

    public void merge(Array that, Array theOther)
    {
        ArrayList<Integer> a1 = that.list, a2 = theOther.list;
        int p1 = 0, p2 = 0;
        while(p1 != a1.size() || p2 != a2.size())  {
            if(p2 == a2.size() || (p1 != a1.size() && a2.get(p2) > a1.get(p1)) ) {
                this.list.add(a1.get(p1));
                ++p1;
            }
            else{
                this.list.add(a2.get(p2));
                ++p2;
            }

        }


    }


}
