package mergesort;

public class Intercala {
    public void intercala(int X[], int inicio, int fim, int meio) {
        int aux[] = new int[X.length];
        int inicioVet1 = inicio;
        int inicioVet2 = meio + 1;
        int i =inicio;
        
        while(inicioVet1 <= meio && inicioVet2<= fim){
            
            if (X[inicioVet1] <= X[inicioVet2]){
                aux[i] = X[inicioVet1];
                inicioVet1++;
            }
                
            else{
                aux[i] = X[inicioVet2];
                inicioVet2++;
            }
                
            i++;               
        }
        
        for (int j = inicioVet1; j <= meio; j++) {
            aux[i] = X[inicioVet1];
            i++;
        }
        
        for (int j = inicioVet2; j <= fim; j++) {
            aux[i] = X[inicioVet2];
            i++;
        }
        
        for (int j = inicio; j <= fim; j++) {
            X[j] = aux[j];    
        }
    }
}
