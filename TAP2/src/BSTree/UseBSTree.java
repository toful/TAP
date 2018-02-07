package BSTree;

/**
 * Created by milax on 19/09/17.
 */
public class UseBSTree {
    public static void main(String args[]){
        BSTree<Integer> tree = new BSTree<Integer>(new Compare());
        tree.insert(5);
        tree.insert(3);
        tree.insert(6);
        tree.insert(1);
        tree.insert(4);
        System.out.println(tree.contains(4));
        System.out.println(tree.contains(8));
        for (Integer elem:tree)
            System.out.println(elem);

    }
}
