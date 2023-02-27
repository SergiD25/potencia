public class Recursividad 
{
  public static int potencia(int base, int exponente)
  {
	if(exponente == 0)
	{ 
	  return 1;
	}else if (exponente % 2 == 0)
	 {
		int res = potencia(base,exponente / 2 );
		return res * res;		
	 }else
	  {
		return base * potencia(base,exponente - 1);
	  }
	
  }
}