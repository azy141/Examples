package mockitoStorageExample;

public interface Storage{
	
	void store(Object object);
	Object retrieve(String id);
	
}