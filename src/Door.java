public class Door {
    private String password;
    private boolean isOpen = false;

    public void checkPassword(String input){
        if(input.equals(password)){
            isOpen = true;
        } else isOpen = false;
    }
}
