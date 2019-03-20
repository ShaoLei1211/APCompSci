import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
	ArrayList<Product> item = new ArrayList<>();
	item.add(new Cantared_Apple());
	item.add(new Yellow_Squash());

        System.out.println("Here are "+item.size()+" items created in total.\n");

        for (Product x :item){//every object is referred as x, so it can check
            if (x instanceof Cantared_Apple){
                x.showstats();
            }
        }
        for (Product x :item){//every object is referred as x, so it can check
            if (x instanceof Yellow_Squash){
                x.showstats();
            }
        }


    }
}
