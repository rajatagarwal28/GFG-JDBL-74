package ErrorAndExceptions;

public class StorageAccessor {
    DB db = new DB();

    public void updateOrWriteData(String key, String newValue) {
        try {
            db.updateData(key, newValue);
        } catch (DBNotFoundException e) {
            db.writeData(key, newValue);
        }
    }
}
