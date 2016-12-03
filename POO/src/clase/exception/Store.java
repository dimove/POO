package clase.exception;

public class Store {
	private int products[];
	private int SIZE = 10;
	private int ocupation = 0;
	
	public Store(int size){
		SIZE = size;
		products = new int [SIZE];
				
	}
	
	public void add(int product) throws FullStoreException{
		this.checkFullOcupation();
		products[ocupation] = product;
		ocupation++;
	}
	
	private void checkFullOcupation() {
		if(ocupation == SIZE) throw new FullStoreException(null);
	}

	public void remove() throws EmptyStoreException{
		this.checkEmptyOcupation();
		
	}

	private void checkEmptyOcupation() {
		if(ocupation == 0) throw new EmptyStoreException(null);
	}
}
