
/**
 * Write a description of class Matematico here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Matematico{

    public String indicarNumero(int num1, int num2,int num3){
        String res;
        int mayor;
        int medio;
        int menor;

        if(num1>num2 && num1>num3){
            mayor = num1;

            if(num2>num3){
                medio=num2;
                menor=num3;
            }else{
                medio=num3;
                menor=num2;
            }
        }else{
            if(num2>num1 && num2>num3){
                mayor=num2;

                if(num2>num3){
                    medio=num1;
                    menor=num3;
                }else{
                    medio=num3;
                    menor=num1;
                }
            }else{
                mayor=num3;
                if(num2>num1){
                    medio=num2;
                    menor=num1;
                }else{
                    medio=num1;
                    menor=num2;
                }
            }
        }
        res ="numero mayor es"+ mayor + "numero medio  es"+ medio + "numero menor es"+ menor ;
        return res;
    }

    public double indicarArea( double base, double altura){
        double res;
        res=base*base;
        return res;

    }

    public double calcularDistancia(int xp1, int yp1,int xp2,int yp2){
        double res;
        

        res = Math.sqrt((Math.pow((xp2-xp1),2)+(Math.pow((yp2-yp1),2))));

        return res;

    }

    public String verificarCuadrante(int x1,int y1){
        String res;

        if(x1>0 && y1>0){
            res="punto en el primer cuadrante";
        }else{
            if(x1>0 && y1<0){
                res="punto en el segundo cuadrante";
            }else{
                if(x1<0 && y1<0){
                    res="punto en el tercero cuadrante";
                }else{
                    if(x1<0 && y1>0){
                        res="punto en el cuarto cuadrante";
                    }else{
                        res="punto en el origen";

                    }
                }
            }
        }
        return res;
    }
}
