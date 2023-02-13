package HackerRank;

public class ArrayLike {
    public static String whoLikesIt(String[] name){
        String c="";
        if(name!=null){
            for(int i=0;i<name.length;i++){
                if(name.length==1){
                    c+=name[i]+" likes this";
                }
                else if(name.length>1 && name.length<=3){
                    if(i==name.length-2){
                        c+=name[i]+" and ";
                    }
                    else if(i==name.length-1){
                        c+=name[i]+" like this";
                    }
                    else{
                        c+=name[i]+", ";
                    }
                }
                else{
                    if(i==0){
                        c+=name[i]+", ";
                    }
                    else{
                        c+=name[i]+" and "+(name.length-2)+" others like this";
                        break;
                    }
                }
            }
            return c;
        }
        else{
            return "no one likes this";
        }
    }
    public static void main(String[] args) {
        String[] str1=null;
        String[] str2=new String[]{"Peter"};
        String[] str3=new String[]{"Jacob", "Alex"};
        String[] str4=new String[]{"Max", "John", "Mark"};
        String[] str5=new String[]{"Alex", "Jacob", "Mark", "Max"};

        System.out.println(whoLikesIt(str1));
        System.out.println(whoLikesIt(str2));
        System.out.println(whoLikesIt(str3));
        System.out.println(whoLikesIt(str4));
        System.out.println(whoLikesIt(str5));

    }
}
