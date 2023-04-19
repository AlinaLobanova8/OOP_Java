package OOP_Java.lesson_4;

public class MainProgram {
    public static void main(String[] args) {

        VendingMachine<Tea> hotDrinksTea = new VendingMachine<>();
        VendingMachine<Coffee> hotDrinksCoffee = new VendingMachine<>();
        VendingMachine<Cocao> hotDrinksCocao = new VendingMachine<>();
        hotDrinksTea.addProduct(new Tea("Black tea", 150, 75));
        hotDrinksCoffee.addProduct(new Coffee("Capuchinno", 250, 95));
        hotDrinksCocao.addProduct(new Cocao("Cocao", 200, 80));

        System.out.println(hotDrinksTea.getProducts().get(0).toString());
        System.out.println(hotDrinksCoffee.getProducts().get(0).toString());
        System.out.println(hotDrinksCocao.getProducts().get(0).toString());

        System.out.println(hotDrinksTea .getProduct("Ice tea", 250, 15));
        System.out.println(hotDrinksCoffee.getProduct("Capuchinno", 250,95));
    }
}
