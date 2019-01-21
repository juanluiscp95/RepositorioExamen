
import Sleer2.SLeer2;
/**
 * 
 * @author juanl
 */
public class Examen {
/**
 * 
 * @param args 
 */
    public static void main(String[] args) {
        int codigo, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0, cont6 = 0, cont7 = 0, cont8 = 0, bebidas=0, comidas=0, consumiciones=0;
        double precio1=0, precio2=0, precio3=0, precio4=0, precio5=0, precio6=0, precio7=0, precio8=0;
        codigo = SLeer2.datoInt("Inserte el codigo del producto (0 para salir): ");
        while (codigo != 0) {
            switch (codigo) {
                case 1:
                    System.out.println("Producto: coca cola");
                    System.out.println("Importe: 2,00€");
                    precio1 = 2.00;
                    cont1++;
                    bebidas++;
                    consumiciones++;
                    break;
                case 2:
                    System.out.println("Producto: agua");
                    System.out.println("Importe: 1,50€");
                    precio2 = 1.50;
                    cont2++;
                    bebidas++;
                    consumiciones++;
                case 3:
                    System.out.println("Producto: cerveza");
                    System.out.println("Importe: 2,50€");
                    precio3 = 2.50;
                    cont3++;
                    bebidas++;
                    consumiciones++;
                    break;
                case 4:
                    System.out.println("Producto: hamburguesa");
                    System.out.println("Importe: 6,00€");
                    precio4 = + 6.00;
                    cont4++;
                    comidas++;
                    consumiciones++;
                    break;
                case 5:
                    System.out.println("Producto: bocadillo");
                    System.out.println("Importe: 5,00€");
                    precio5 = 5.00;
                    cont5++;
                    comidas++;
                    consumiciones++;
                    break;
                case 6:
                    System.out.println("Producto: ensalada");
                    System.out.println("Importe: 4,00€");
                    precio6 = 4.00;
                    comidas++;
                    consumiciones++;
                    break;
                case 7:
                    System.out.println("Producto: arroz");
                    System.out.println("Importe: 7,50€");
                    precio7 = 7.50;
                    cont7++;
                    comidas++;
                    consumiciones++;
                    break;
                case 8:
                    System.out.println("Producto: carrillada");
                    System.out.println("Importe: 12,00€");
                    precio8 = 12.00;
                    cont8++;
                    comidas++;
                    consumiciones++;
                    break;
            }
        codigo = SLeer2.datoInt("Inserte el codigo del producto (0 para salir): ");
        }
        
    double total1 = cont1*precio1;
    double total2 = cont2*precio2;
    double total3 = cont3*precio3;
    double total4 = cont4*precio4;
    double total5 = cont5*precio5;
    double total6 = cont6*precio6;
    double total7 = cont7*precio7;
    double total8 = cont8*precio8;
    
    double beneficio = total1+total2+total3+total4+total5+total6+total7+total8;
    double porcentaje_bebidas = bebidas*100 / consumiciones;
    double porcentaje_comidas = comidas*100 / consumiciones;
    
    System.out.println("Has vendido " +cont1+ " unidades del producto 1 a " +precio1+ " € cada una." );
    System.out.println("Total = " +total1+ " €");
    System.out.println();
    System.out.println("Has vendido " +cont2+ " unidades del producto 2 a " +precio2+ " € cada una." );
    System.out.println("Total = " +total2+ " €");
    System.out.println();
    System.out.println("Has vendido " +cont3+ " unidades del producto 3 a " +precio3+ " € cada una." );
    System.out.println("Total = " +total3+ " €");
    System.out.println();
    System.out.println("Has vendido " +cont4+ " unidades del producto 4 a " +precio4+ " € cada una." );
    System.out.println("Total = " +total4+ " €");
    System.out.println();
    System.out.println("Has vendido " +cont5+ " unidades del producto 5 a " +precio5+ " € cada una." );
    System.out.println("Total = " +total5+ " €");
    System.out.println();
    System.out.println("Has vendido " +cont6+ " unidades del producto 6 a " +precio6+ " € cada una." );
    System.out.println("Total = " +total6+ " €");
    System.out.println();
    System.out.println("Has vendido " +cont7+ " unidades del producto 7 a " +precio7+ " € cada una." );
    System.out.println("Total = " +total7+ " €");
    System.out.println();
    System.out.println("Has vendido " +cont8+ " unidades del producto 8 a " +precio8+ " € cada una." );
    System.out.println("Total = " +total8+ " €");
    System.out.println();
    System.out.println("Beneficio total = " +beneficio+ " €");
    System.out.println("Has vendido un total de " +consumiciones+ " productos");
    System.out.println("Has vendido " +bebidas+ " bebidas ("+porcentaje_bebidas+"%)");
    System.out.println("Has vendido " +comidas+ " comidas ("+porcentaje_comidas+"%)");  
    }
}
