
public class Store {
    //definimos constantes
    public static final int[] PRODUCT_PRICES =(15, 10, 5);
    private static final int[] PRODUCT_QUANTITIES = (2, 3, 4);
    private static final int[] SALES_THRESHOLD = 50;
    public static void main(String[] args) {
        //SI LOS ARRAY NO TIENEN LA MISMA LONGITUD
        if (PRODUCT_PRICES.length!= PRODUCT_QUANTITIES.length);
        System.out.println(error);
        int p1 = 15;
        int p2 = 10;
        int p3 = 5;
        //creamos un contador para el total
        int totalSales= 0;
        

        int total1 = p1 * 2;
        int total2 = p2 * 3;
        int total3 = p3 * 4;

        int totalSales = total1 + total2 + total3;

        if (totalSales > 50) {
            System.out.println("Good sales performance");
        } else {
            System.out.println("Low sales performance");
        }
    }
}