public class RestaurantTest {
    public static void main(String[] args) {
        RestaurantDish dish = new RestaurantDish(900, "more food");
//        dish.costInCents = 50;
//        dish.nameOfDish = "Food";
//        dish.wouldRecommend = true;
        dish.setCostInCents(800);
        System.out.println(dish.getCostInCents());
        dish.setNameOfDish("Food");
        System.out.println(dish.getNameOfDish());
    }
}
//    Create another class called RestaurantTest
//        Add a main method to...
//        1) instantiate a RestaurantDish object called "dish"
//        2) assign values creative to each of the properties
//        3) print out each of the property values
//        4) test the eat() method by calling it