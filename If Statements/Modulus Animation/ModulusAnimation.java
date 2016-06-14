public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
        System.out.println();
        
		for ( int i=0; i<80; i++ )
		{
			if ( i%18 == 0 )
				System.out.print( "(o'.')c|=>         (o'_')o \r");
            else if ( i%18 == 1 || i%18 == 17 )
				System.out.print( "(o'.')c|==>        (o'_')o \r");
            else if ( i%18 == 2 || i%18 == 16 )
				System.out.print( "(o'.')c|===>       (o'_')o \r");
            else if ( i%18 == 3 || i%18 == 15 )
				System.out.print( "(o'.')c|====>      (o'_')o \r");
            else if ( i%18 == 4 || i%18 == 14 )
				System.out.print( "(o'.')c|=====>     (o'_')o \r");
            else if ( i%18 == 5 || i%18 == 13 )
				System.out.print( "(o'.')c|======>    (o'_')o \r");
            else if ( i%18 == 6 || i%18 == 12 )
				System.out.print( "(o'.')c|=======>   (o'_')o \r");
            else if ( i%18 == 7 || i%18 == 11 )
				System.out.print( "(o'.')c|========>  (o'_')o \r");
            else if ( i%18 == 8 || i%18 == 10 )
				System.out.print( "(o'.')c|=========> (o'_')o \r");
            else if ( i%18 == 9 )
				System.out.print( "(o'.')c|==========>(T'_')T \r");


			Thread.sleep(200);
		}
        System.out.println();
	}
}
