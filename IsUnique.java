//assuming that the string contains character from a to z

public class IsUnique {

    private int mask;
    public String testString;

    public IsUnique(String input){
        testString=input;
        mask=0;
    }

    public void setBit(int index){
       mask= mask|1<<index;
    }

    public boolean isAlreadySet(int index){
        if(((mask&(1<<index))>0)){
            return true;
        }
        return false;
    }

    public static void main(String[] args){

        boolean flag=false;
        IsUnique obj= new IsUnique(args[0]);
        String test=obj.testString;
        for(int i=0;i<test.length();i++){
            int index= test.charAt(i)-'a';
            if(obj.isAlreadySet(index)){
                flag=true;
                break;
            }else{
                obj.setBit(index);
            }
        }
        if(flag==true){
            System.out.println("Duplicate found in the string");
        }else{
            System.out.println("Duplicate not found in the string");
        }


    }
}
