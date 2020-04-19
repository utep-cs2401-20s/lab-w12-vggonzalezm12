import org.junit.Test;

import static java.lang.System.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import static org.junit.Assert.*;

public class myBinarySearchTreeTester
{


        @Test
        public void test1()
                // test if the method insertion works when adding a new element that is located in the left side of 8.
                // no matter the order of the array
                //it did not pass since the order of hte array does matter to position the nodes
                // in the test myBSTN  the right of the root is 8 and in the expected the right of the truth is 7
        {
            int[] A = new int[]{4,2,8};
            int[] B = new int[]{4,2,7,8};
            myBinarySearchTreeNode test = new myBinarySearchTreeNode(A);
            myBinarySearchTreeNode expected = new myBinarySearchTreeNode(B);
            test.insert(7);
            assertEquals(expected.myValue, test.myValue );
            assertEquals(expected.left.myValue, test.left.myValue);
            assertEquals(expected.right.myValue, test.right.myValue);
            assertEquals(expected.right.left.myValue, test.right.left.myValue);

            assertNull(expected.left.right.myValue, test.left.right.myValue);
            assertNull(expected.left.left.myValue, test.left.left.myValue);
            assertNull(expected.right.right.myValue, test.right.right.myValue);
            assertNull(expected.right.left.right.myValue, test.right.left.right.myValue);
            assertNull(expected.right.left.left.myValue, test.right.left.left.myValue);
        }
    @Test
    public void test2()
    // test if the method insertion works when adding a new element that is already in the array.
    //it passed, since the arrays remain the same and the program didnt add node with a value that is already in the array
    {
        int[] A = new int[]{6,9,7};
        int[] B = new int[]{6,9,7};
        myBinarySearchTreeNode test2 = new myBinarySearchTreeNode(A);
        myBinarySearchTreeNode expected = new myBinarySearchTreeNode(B);
        test2.insert(7);
        assertEquals(expected.myValue, test2.myValue );
        assertEquals(expected.left.myValue, test2.left.myValue);
        assertEquals(expected.right.myValue, test2.right.myValue);

        assertNull(expected.left.right.myValue, test2.left.right.myValue);
        assertNull(expected.left.left.myValue, test2.left.left.myValue);
        assertNull(expected.right.right.myValue, test2.right.right.myValue);
        assertNull(expected.right.left.myValue, test2.right.left.myValue);
    }
    @Test
    public void test3()
    // test if the method size counts the repeated nodes.
    //it passed, because it doesnt count repeated values.
    //the numbers in the array are 9 and the expected size of the tree was 8
    {
        int[] A = new int[]{6,10,7,4,8,9,9,12,1};
        int expected = 8;
        myBinarySearchTreeNode test3 = new myBinarySearchTreeNode(A);
        assertEquals(expected, test3.size());

    }

    @Test
    public void test4()
    // test if the method height return the height of the tree even though there are 3 branches that have the same height.
    //it passed, because it doesnt matter that branches have the same height it sends it anyways
    //the expected height is 2.
    {
        int[] A = new int[]{6,7,10,4,8,9};
        int expected = 2;
        myBinarySearchTreeNode test3 = new myBinarySearchTreeNode(A);
        assertEquals(expected, test3.height());

    }

    @Test
    public void test5()
    // test if the method depth return the depth of the tree when we are looking to the root
    //it passed, because the number 6 is in the level 0.
    // expected int is 0.
    {
        int[] A = new int[]{6,7,10,4,8,9};
        int expected = 0;
        myBinarySearchTreeNode test5 = new myBinarySearchTreeNode(A);
        assertEquals(expected, test5.depth(6));

    }
}
