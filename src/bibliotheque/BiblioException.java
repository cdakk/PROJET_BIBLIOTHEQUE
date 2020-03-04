package bibliotheque;

public class BiblioException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public BiblioException()
	{
		super("Probleme bibliotheque");
	}
	
	public BiblioException(String message)
	{
		super(message);
	}
}