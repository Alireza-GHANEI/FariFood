package ir.ac.kntu;
import java.util.*;


public class Sort {

    void sortRestaurantAscendingScore(ArrayList<Restaurant> restaurants){
        ArrayList<Double> scoreList = new ArrayList<>();
        for(int i=0;restaurants.size()>i;i++) {
            scoreList.add(restaurants.get(i).scoreRestaurant());
        }
        Collections.sort(scoreList);
        System.out.println(scoreList);
    }

    void sortRestaurantDescendingScore(ArrayList<Restaurant> restaurants){
        ArrayList<Double> scoreList = new ArrayList<>();
        for(int i=0;restaurants.size()>i;i++) {
            scoreList.add(restaurants.get(i).scoreRestaurant());
        }
        Collections.reverse(scoreList);
        System.out.println(scoreList);
    }

    /*void sortRestaurantAscendingComment(ArrayList<Restaurant> restaurants){

        ArrayList<Restaurant> restaurantss = new ArrayList<>();
        int min = restaurants.get(0).getCommentNumbers();

        Restaurant temp= new Restaurant();
        for(int i=0;i<restaurants.size()-1;i++){
            if(restaurants.get(i+1).getCommentNumbers() < restaurants.get(i).getCommentNumbers()){
                temp = new Restaurant()
                restaurants.get(i) = restaurants.get(i+1);
                restaurants.get(i+1)=temp;

            }
        }
        Collections.sort(restaurantss);
        System.out.println(restaurantss);


        //res1.getComm = 3     res2.getcomm = 2



        System.out.println(restaurantss);

        //          [rest2,res3]

        /*ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Food> foods = new ArrayList<>();

        for(int i=0;i<restaurants.size();i++) {
            foods = restaurants.get(i).getFood();
        }

        for(Restaurant restaurant : restaurants){
            list = restaurant.getCommentNumbers();
        }

        // int min = restaurants.get(0).getFood().get
        //ArrayList<Restaurant> restaurants = new ArrayList<>();
        /*String[] comments = new String[3];
        for(int i=0;restaurants.size()>i;i++) {
           // foods.add(restaurants.get(i).getMenu().;
        }
    }*/


    void sortRestaurantDescendingComment(){

    }


    public static void main(String[] args) {
        Initialize initialize = new Initialize();


    }
}
