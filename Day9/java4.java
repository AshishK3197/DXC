interface Phonenumber{
boolean numberFormat(String str);
}
    
    abstract  class country implements Phonenumber{
       public boolean numberFormat(){
           return false;
       }
    }
    
       class India extends country{
        public boolean numberFormat(String str){
        char[] c= str.toCharArray();
        
        if(c.length!= 14)
            return false;
        else
        {
            if(c[0]=='+' && c[1]== '9' && c[2]== '1' && c[3]== '-')
                return true;
            else
                return false;
        }
    }
  }

    class Brazil extends country{
     public boolean numberFormat(String str){
        char[] c= str.toCharArray();
        if(c.length!= 15)
            return false;
        else
        {
        if(c[0]=='+' && c[1]== '5' && c[2]== '5' && c[3]== '1' && c[4]=='5')
            return true;
            else
            return false;
        }
    }
}

class Qatar extends country{
    public boolean numberFormat(String str){
       char[] c= str.toCharArray();
       if(c.length!= 14)
           return false;
       else
       {
       if(c[0]=='+' && c[1]== '9' && c[2]== '7' && c[3]== '4' && c[4]==' ')
           return true;
           else
           return false;
       }
   }
}

 class Norway extends country {
	@Override
	public boolean numberFormat(String str)
{
	char[] c = str.toCharArray();
	int flag=0;
	if(c.length!=15)
		return false;
	else 
		
	{
		for(int i=c.length-1;i>=3;i--)
		{
			if((c[i]>=48 && c[i]<=57) || (i%3==0 && c[i]=='-'))
				flag=1;
			else 
			{
				flag=0;
			    break;
			}
		}
		if(c[0]=='+' && c[1] == '4' && c[2] == '7' && flag==1)
			return true;
		else
			return false;
	}
}

}

  class CountryService{
    public static void main(String[] args) {
        India india=new India();
        india.numberFormat("+91-9988776655");

        Brazil brazil=new Brazil();
        brazil.numberFormat("+551599999-9999");

        Qatar qatar=new Qatar();
        qatar.numberFormat("+47-49-99-99-99");

        Norway norway=new Norway();
        norway.numberFormat("+47-49-99-99-99");

        System.out.println("The format given by user is: " + " " + india.numberFormat("+91-9988776655")+ " " + brazil.numberFormat("+551599999-9999")+ " " + qatar.numberFormat("+974 3399-9999") + " " + norway.numberFormat("+47-49-99-99-99"));
        }
    }

