package backhand.StockProjectJava.core.utilities.results;

public class SuccessResult extends Result{

	public SuccessResult(boolean success, String message) {
		super(success, message);
		
	}
	public SuccessResult(boolean success) {
		super(success);
	}

}
