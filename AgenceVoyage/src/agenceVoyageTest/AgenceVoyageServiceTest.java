package agenceVoyageTest;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domaine.Voyage;
import service.AgenceVoyageService;



public class AgenceVoyageServiceTest {
	private Voyage voyage;
	private AgenceVoyageService agence;
@BeforeEach
	public void setUp()
	{
		voyage = new Voyage();
		agence =new AgenceVoyageService();
		
	}
@Test 
public void testReserver()
{
	
	assertTrue(agence.reserver(voyage));
	
}


}
