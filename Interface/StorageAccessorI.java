package Interface;

public interface StorageAccessorI {
    //prototype
    public String getDataFromStorage();

    public  String removeDataFromStorage();

    default String removeDataFromStorage(String data) {
        return removeDataFromStorage();
    }
}
