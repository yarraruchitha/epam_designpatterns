package chain_of_rsponsibility_pattern;

public interface Chain {
	 public abstract void setNext(Chain nextInChain); 
	    public abstract void process(Number request); 
}
