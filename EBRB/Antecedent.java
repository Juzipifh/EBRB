package keel.Algorithms.Fuzzy_Rule_Learning.AdHoc.EBRB;

public class Antecedent {
    Fuzzy [] ante;
    double [] beliefDeg;
    int n_labels;

    public Antecedent (int variables){
        n_labels=variables;
        ante=new Fuzzy[n_labels];
        beliefDeg=new double[n_labels];
    }

    public Antecedent (Fuzzy[] RefValues){
        ante=RefValues;
        n_labels=ante.length;
        beliefDeg=new double[ante.length];
    }

    public void comBelief(double X){
        for (int i=0;i<n_labels;i++){
            beliefDeg[i]=ante[i].Fuzzify(X);
        }
    }
    public double[] matchVector(double X){
        double[] matchV=new double [n_labels];
        for (int i=0;i<n_labels;i++){
            matchV[i]=ante[i].Fuzzify(X);
        }
        return matchV;
    }
    public String printString(){
        String anteString="";
        for(int i=0;i<n_labels;i++){
            anteString+=ante[i].name+":"+beliefDeg[i];
        }
        return anteString;
    }
}
