package check;

import constants.Constants;

public class Main {

    // 課題1
    private String firstName;
    private String lastName;

    public Main() {
        this.firstName = "久保田";
        this.lastName = "錬";
    }

    // 課題2
    private void printName(String firstName, String lastName) {
        String fullName = firstName + lastName;
        System.out.println("printNameメソッド" + " " + "→" + " " + fullName);
    }

     public static void main(String[] args) {
        Main main = new Main();
        
        main.printName(main.firstName, main.lastName);
        
        // 課題3
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);{
        	pet.introduce();
        	}
        
        RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);{
        	robotpet.introduce();
        }
    }      	
}








    	
