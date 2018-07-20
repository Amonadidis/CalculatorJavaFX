package calculator.model;

public class ArithmeticOperations
{
    	public enum Operator
	{
	    ADDITION, SUBTRACTION, MULTIPLICATION, DIVISION;
	}
	
	private Operator operator = null;
	
	private long storage;
	private long memory;
	
	private boolean hasResult = false;
	private boolean hasOperator = false;

	public ArithmeticOperations()
	{
	    
	}
	
	public String clear()
	{
	    operator = null;
	    
	    hasOperator = false;
	    hasResult = false;
	    
	    storage = 0;
	    memory = 0;
	    
	    return Long.toString(storage);
	}
	
	public String equals()
	{
	    switch(operator)
	    {
	    case ADDITION:
		storage += memory;
		break;
	    case SUBTRACTION:
		storage -= memory;
		break;
	    case MULTIPLICATION:
		storage *= memory;
		break;
	    case DIVISION:
		try
		{
		    storage = (int) storage / memory;
		    break;
		}
		catch(java.lang.ArithmeticException e)
		{
		    memory = 0;
		    return "ERR " + e.getMessage();
		}
	    default:
		break;
	    }
	    
	    hasResult = true;
	    hasOperator = false;
	    
	    return Long.toString(storage);
	}
	
	public void operator(Operator operator)
	{
	    if(hasOperator)
	    {
		equals();
	    }
	    
	    switch(operator)
	    {
	    case ADDITION:
		this.operator = Operator.ADDITION;
		break;
	    case SUBTRACTION:
		this.operator = Operator.SUBTRACTION;
		break;
	    case MULTIPLICATION:
		this.operator = Operator.MULTIPLICATION;
		break;
	    case DIVISION:
		this.operator = Operator.DIVISION;
		break;
	    default:
		this.operator = null;
		break;
	    }
	    
	    if(hasResult || hasOperator)
	    {
		memory = 0;
		hasResult = false;
	    }
	    
	    else
	    {
		storage = memory;
		memory = 0;
	    }
	    
	    hasOperator = true;
	}
	
	public String digitInput(int zahl)
	{
	    memory = memory * 10 + zahl;
	    return Long.toString(memory);
	}
}
