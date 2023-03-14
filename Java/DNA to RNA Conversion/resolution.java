public class Bio {
    public String dnaToRna(String dna) {
        
        String[] arrayDna = dna.split("");
      
        for(int i =0; i <arrayDna.length; i++){

            if(arrayDna[i].equals("T")){

                arrayDna[i] = "U";
            
            }
        }

        return String.join("",arrayDna);
    } 
}