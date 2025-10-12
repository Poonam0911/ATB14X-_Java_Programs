package IfCondition;

public class Lab01_If {
    public static void main(String[] args) {
        String user_input = args[0];
        //System.out.println(user_input);
        int age = Integer.parseInt(user_input);
        //System.out.println(age);
        if(age < 80)
            System.out.println("You can Vote");
        else
            System.out.println("You can not vote");
    }
}
