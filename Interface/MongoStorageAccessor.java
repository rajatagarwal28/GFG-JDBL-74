package Interface;

public class MongoStorageAccessor extends clientManagement implements GetDataI, DeleteDataI  {

    @Override
    public String deleteData(String data) {
        return "";
    }

    @Override
    public String getDataFromStorage() {
        return "";
    }

    @Override
    void getClient() {
        return;
    }
}
