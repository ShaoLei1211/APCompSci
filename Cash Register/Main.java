import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	ArrayList<Product> product = new ArrayList<>();
	product.add(new Cantared_Apple());

        System.out.println(product.size());
        for (Product x :product){//every object is referred as x, so it can check
            if (x instanceof Cantared_Apple){
                x.showstats();
            }
        }


    }
}
