package home.library.entities;

import java.util.*;
import java.util.function.Consumer;

/**
 * Wrapper class around a Set to represent tags assigned to a given
 * book
 * @author Sebastian Greenholtz
 */
public class Tags implements Set<String> {

    private Set<String> tags;

    public Tags() {
        tags = new HashSet<>();
    }

    @Override
    public int size() {
        return tags.size();
    }

    @Override
    public boolean isEmpty() {
        return tags.isEmpty();
    }

    @Override
    public boolean contains(Object o) {
        return tags.contains(o);
    }

    @Override
    public Iterator<String> iterator() {
        return tags.iterator();
    }

    @Override
    public void forEach(Consumer<? super String> consumer) {
        tags.forEach(consumer);
    }

    @Override
    public Object[] toArray() {
        return tags.toArray();
    }

    @Override
    public <T> T[] toArray(T[] ts) {
        return tags.toArray(ts);
    }

    @Override
    public boolean add(String s) {
        return tags.add(s);
    }

    @Override
    public boolean remove(Object o) {
        return tags.remove(o);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return tags.containsAll(collection);
    }

    @Override
    public boolean addAll(Collection<? extends String> collection) {
        return tags.addAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        Boolean bool = null;
        return bool;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return tags.removeAll(collection);
    }

    @Override
    public void clear() {
        tags.clear();
    }

    @Override
    public Spliterator<String> spliterator() {
        return tags.spliterator();
    }
}
