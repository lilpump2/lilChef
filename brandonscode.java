		        String s = "The World is Full of Strangers.";
		        s = s + " "; 
		        int idxOfNextWord = 0;
		        for(int i = 0; i < s.length(); i++) 
		        {
		            if(s.charAt(i)== ' ') 
		            {
		                System.out.println(s.substring(idxOfNextWord, i));
		                idxOfNextWord = i+1;
		            }            
		        }
		    }
		
	    }
	
