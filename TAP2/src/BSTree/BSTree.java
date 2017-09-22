package BSTree;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by milax on 15/09/17.
 */
public class BSTree<T> implements Iterable<T>{
    T data;
    BSTree<T> right, left;
    Comparator<T> comp;

    public BSTree(Comparator<T> comp) {
        this.comp=comp;
        this.data = null;
        this.right = null;
        this.left = null;
    }

    public BSTree(Comparator<T> comp, T data) {
        this.comp=comp;
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public void insert(T d){
        if(data==null)data=d;
        else if(comp.compare(d, this.data)>0){
                if(right==null) right=new BSTree<T>(comp, d);
                else right.insert(d);
            }
            else{
                if(left==null) left=new BSTree<T>(comp, d);
                else left.insert(d);
            }
    }

    public boolean contains(T d){
        if(/*comp.compare(this.data, data)==0*/this.data.equals(d)) {
            return true;
        }
        else{
            if(comp.compare(d, this.data)>0){
                if(right!=null) return right.contains(d);
                else return false;
            }
            else{
                if(left !=null) return left.contains(d);
                else return false;
            }
        }
    }

    public T getData(){
        return data;
    }

    public BSTree<T> getRight(){
        return right;
    }

    public BSTree<T> getLeft() {
        return left;
    }

    public Iterator<T> iterator(){
        LinkedList<T> list = new LinkedList<T>();
        BSTree.treeToList(this, list);
        return list.iterator();
    }

    public static <T> void treeToList(BSTree<T> tree, List<T> list){
        if(!tree.getData().equals(null)){
            list.add(tree.getData());
            if(tree.getRight()!=null) BSTree.treeToList(tree.getRight(), list);
            if(tree.getRight()!=null) BSTree.treeToList(tree.getLeft(), list);
        }
    }

}
