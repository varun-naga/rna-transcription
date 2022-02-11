class RnaTranscription {

    String transcribe(String dnaStrand) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String rna="";
        for(int i=0;i<dnaStrand.length();i++)
        {
            if(dnaStrand.charAt(i)=='G')
            {
                rna+="C";
                continue;
            }
            else if(dnaStrand.charAt(i)=='C')
            {
                rna+="G";
                continue;
            }
            else if(dnaStrand.charAt(i)=='T')
            {
                rna+="A";
                continue;
            }
            else if(dnaStrand.charAt(i)=='A')
            {
                rna+="U";
                continue;
            }
        }
        return rna;
    }

}
