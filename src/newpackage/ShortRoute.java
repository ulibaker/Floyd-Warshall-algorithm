package newpackage;
/*
    Hecho por el equipo conformado por:
    
        Perla Liliana Covarrubias Pérez  -   (20550202)
        Marilee Armenta Acosta           -   (20550227)
        Gisely Mayram Terán Ramírez      -   (20550225)
        Nubia Estefany Castro Martinez   -   (20550210)  
        María Kassandra Lara Aguirre     -   (20550213)
        René Ulises Delgado García       -   (20550195)

        El 19 de Junio del 2021.
*/
public class ShortRoute {
    
    public String floydAlgorithm( long [][] mAd, int x){
    
        int vertex = x;
        long matrixAd[][] = mAd;
        String routes[][] = new String[vertex][vertex];
        String auxRoutes[][]=new String[vertex][vertex];
        String travRoutes ="", str="", littlePath="";
        int i, j, k;
        float temp1, temp2, temp3, temp4, min;
        for(i = 0 ; i < vertex ; i++) {
            for(j = 0 ; j < vertex ; j++){
                routes[i][j] = "";
                auxRoutes[i][j] = "";
            }
        }
        
        for(k = 0 ; k < vertex ; k++){
            for(i = 0 ; i < vertex ; i++){
               for (j = 0 ; j < vertex ; j++){
                   
            temp1 = matrixAd[i][j];
            temp2 = matrixAd[i][k];
            temp3 = matrixAd[k][j];
            temp4 = temp2 + temp3;
            min = Math.min(temp1, temp4);
            if(temp1 != temp4){
                if(min == temp4){
                    travRoutes = "";
                    auxRoutes[1][j] = k + "";
                    routes[i][j] = routeR(i,k,auxRoutes, travRoutes) + (k+1);
                          
                }
            }
            matrixAd[i][j] = (long) min;
               }
            }
        }
    for(i = 0 ; i < vertex ; i++) {
            for(j = 0 ; j < vertex ; j++){
                str = str+"["+matrixAd[i][j]+"]";
            }
            str = str+"\n";
        }
    for(i = 0 ; i < vertex ; i++) {
            for( j = 0 ; j < vertex ; j++){
                if(matrixAd[i][j] != 1000000000){
                    if(i != j){
                        if(routes[i][j].equals("")){
                            littlePath += "de ("+ (i+1)+" -> "+(j+1)+") ir por...("+(i+1)+", "+(j+1)+")\n";
                        }else{ littlePath +="de ("+ (i+1)+" -> "+(j+1)+") ir por...("+(i+1)+", "+routes[i][j] + ", " +(j+1)+")\n";
                    }
                }
            }
        }
    }
    
    return "La matriz de caminos mas cortos entre los diferentes vertices es: \n" +str+
            "\n Los caminos más cortos entre nodos son:\n"+littlePath;
    }
    public String routeR(int i, int k, String[][] auxRoutes, String travRoute) {
        if(auxRoutes[i][k].equals("")){
            return "";
         }else{
            travRoute = travRoute + routeR(i, Integer.parseInt(auxRoutes[i][k].toString()), auxRoutes, travRoute)+(Integer.parseInt(auxRoutes[i][k].toString())+1)+", ";
            return travRoute;
        }
    }
}
