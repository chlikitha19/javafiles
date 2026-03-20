public class stirngmethods{
    public static void main(String args[]){
        String name = "likitha";
        System.out.println(name.length());//just to print the length of the given string
        System.out.println(name.charAt(3));
        System.out.println(name.indexOf("t"));
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());// there will no space return even you gave much space before the string ex like even you wrote title name 
// in the middle it will remove the extra space and print in the left
        System.out.println(name.replace("i","a"));// it will replace i's with a's
        System.out.println(name.isEmpty());//it will show false if the name is not empty shows true if name is empty
        System.out.println(name.contains("i"));//it sees if the given letter presents in the given word
        System.out.println(name.equals("likitha"));//it sees if the given name is equal to your given string
    }
    }
