import java.util.List;

public class BinarySearch<T extends Comparable<T>> {

    //TODO Compare with Collections.binarySearch
    public T search(List<T> list, T element) {
        int start = 0;
        int end = list.size();

        while (start <= end) {
            int middle = (end - start) / 2;
            int compare = element.compareTo(list.get(middle));
            if (compare == 0) {
                return list.get(middle);
            } else if (compare > 0) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }
        return null;
    }

    private T searchRecursive(List<T> list, T element) {
        if (list.isEmpty()) {
            return null;
        }
        int size = list.size();
        int middle = size / 2;

        int compare = element.compareTo(list.get(middle));
        if (compare == 0) {
            return list.get(middle);
        } else if (compare > 0) {
            return searchRecursive(list.subList(middle + 1, size), element);
        } else {
            return searchRecursive(list.subList(0, middle), element);
        }
    }

    //TODO: search with duplicates
}