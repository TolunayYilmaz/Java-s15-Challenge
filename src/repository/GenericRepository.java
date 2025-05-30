package repository;

import utils.interfaces.Identify;

import java.util.List;
import java.util.TreeMap;

public class GenericRepository<T extends Identify> {

    protected TreeMap<Integer, T> objects=new TreeMap<>();

    public T getById(int id){
        if (objects.get(id) == null) {
            throw new RuntimeException("Böyle bir kitap bulunamamaktadır");
        }
        return objects.get(id);
    }

    public List<T> getAll() {
        return objects.values().stream().toList();
    }
    public T create(T book) {
        if(book!=null){
            objects.put(book.getID(), book);
        }

        return book;
    }
    public void delete(int bookId){
        objects.remove(bookId);
    }
}
