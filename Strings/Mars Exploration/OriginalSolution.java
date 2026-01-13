    public static int marsExploration(String s) {
    // Write your code here
        int numberOfDifference = 0;
        for(int i =0; i< (s.length()+1)/3;i+=3){
            if(!s.substring(i, i+2).equalsIgnoreCase("SOS")){
                   if(s.charAt(i)!= 'S')
                        numberOfDifference++;
                   if(s.charAt(i+1)!= 'O')
                        numberOfDifference++;
                   if(s.charAt(i+2)!= 'S')
                        numberOfDifference++; 
            }
        }
        return numberOfDifference;
    }

