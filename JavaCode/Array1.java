public class Array1 {
    public static void array(){
        int marks[] = new int[5];

        int numbers[] = {1, 2, 3, 4, 5};

        float morenumbers[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};

        String fruits[] = {"Apple", "Banana", "Orange", "Grapes", "Mango"};

        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int i = 0; i < morenumbers.length; i++){
            System.out.println(morenumbers[i]);
        }

        for(int i = 0; i < fruits.length; i++){
            System.out.println(fruits[i]);
        }
    }

    public static void main(Strings [] args){
        array();
    }
}
