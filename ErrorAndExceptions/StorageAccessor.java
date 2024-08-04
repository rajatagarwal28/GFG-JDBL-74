package ErrorAndExceptions;

public class StorageAccessor {
    DB db = new DB();

    public void updateOrWriteData(String key, String newValue) throws Exception {

        db.updateData(key, newValue);
        try {
            db.updateData(key, newValue);
        } catch (DBNotFoundException e) {
            db.writeData(key, newValue);
        } catch (Exception e) {
            System.out.println("exception");
            throw new Exception("key doesnt exist");
        } finally {
            // it says i will be executed no matter what
        }

    }
}
