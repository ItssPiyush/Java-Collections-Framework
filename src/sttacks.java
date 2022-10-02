import java.util.Stack;

public class sttacks {
    public static void main(String []args){

        Stack<String> birds = new Stack<>();

        birds.push("peacock");
        birds.push("crow");
        birds.push("crain");
        birds.push("eagle");
        birds.push("pegion");

        System.out.println("Stacks:"+ birds);

        System.out.println(birds.peek());

        birds.pop();

        System.out.println(birds);


    }
}
