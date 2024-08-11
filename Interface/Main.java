package Interface;

public class Main {
    public static void main(String[] args) {
        MongoStorageAccessor mongoStorageAccessor = new MongoStorageAccessor();
        mongoStorageAccessor.getDataFromStorage();
        mongoStorageAccessor.deleteData("Sa");

        SQLStorageAccessor sqlStorageAccessor = new SQLStorageAccessor();
        sqlStorageAccessor.getDataFromStorage();


    }
}
