package home.library.entities;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

/**
 * List of World Cat ID numbers, basically a wrapper around a List
 * @author Sebastian Greenholtz
 */
public class OclcNumbers implements List {

    private List<String> oclcNumberList;

    private OclcNumbers(List<String> oclcNumberList){
        this.oclcNumberList = oclcNumberList;
    }

    /**
     * Takes in the string returned by WorldCat of numbers
     * and returns the instantiated OclcNumbers instance
     * @param oclcNums returned from WorldCat xml
     * @return OclcNumbers instance
     */
    public static OclcNumbers parseOclcNumbers(String oclcNums) {
        String token = "\\s";
        return new OclcNumbers(Arrays.asList(oclcNums.split(token)));
    }

    @Override
    public int size() {
        return oclcNumberList.size();
    }

    @Override
    public boolean isEmpty() {
        return oclcNumberList.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return oclcNumberList.contains(o);
    }

    @Override
    public Iterator iterator() {
        return oclcNumberList.iterator();
    }

    @Override
    public void forEach(Consumer consumer) {

    }

    @Override
    public Object[] toArray() {
        return oclcNumberList.toArray();
    }

    @Override
    public boolean add(Object o) {
        return oclcNumberList.add((String) o);
    }

    @Override
    public boolean remove(Object o) {
        return oclcNumberList.remove(o);
    }

    @Override
    public boolean addAll(Collection collection) {
        return oclcNumberList.addAll(collection);
    }

    @Override
    public boolean removeIf(Predicate predicate) {
        return oclcNumberList.removeIf(predicate);
    }

    @Override
    public boolean addAll(int i, Collection collection) {
        return oclcNumberList.addAll(i, collection);
    }

    @Override
    public void replaceAll(UnaryOperator unaryOperator) {
        oclcNumberList.replaceAll(unaryOperator);
    }

    @Override
    public void sort(Comparator comparator) {
        oclcNumberList.sort(comparator);
    }

    @Override
    public void clear() {
        oclcNumberList.clear();
    }

    @Override
    public Object get(int i) {
        return oclcNumberList.get(i);
    }

    @Override
    public Object set(int i, Object o) {
        return oclcNumberList.set(i, (String) o);
    }

    @Override
    public void add(int i, Object o) {
        oclcNumberList.add(i, (String)o);
    }

    @Override
    public Object remove(int i) {
        return oclcNumberList.remove(i);
    }

    @Override
    public int indexOf(Object o) {
        return oclcNumberList.indexOf(o);
    }

    @Override
    public int lastIndexOf(Object o) {
        return oclcNumberList.lastIndexOf(o);
    }

    @Override
    public ListIterator listIterator() {
        return oclcNumberList.listIterator();
    }

    @Override
    public ListIterator listIterator(int i) {
        return oclcNumberList.listIterator();
    }

    @Override
    public List subList(int i, int i1) {
        return null;
    }

    @Override
    public Spliterator spliterator() {
        return null;
    }

    @Override
    public Stream stream() {
        return null;
    }

    @Override
    public Stream parallelStream() {
        return null;
    }

    @Override
    public boolean retainAll(Collection collection) {
        return false;
    }

    @Override
    public boolean removeAll(Collection collection) {
        return false;
    }

    @Override
    public boolean containsAll(Collection collection) {
        return false;
    }

    @Override
    public Object[] toArray(Object[] objects) {
        return new Object[0];
    }
}
