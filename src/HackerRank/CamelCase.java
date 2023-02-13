package HackerRank;

public class CamelCase {
    //"the-stealth-warrior" gets converted to "theStealthWarrior"
    //"The_Stealth_Warrior" gets converted to "TheStealthWarrior"
    static String toCamelCase(String s){
        String c="";
        String[] h=s.split("-|_");
        for(int i=0;i<h.length;i++){

            if(i>0){
                c+=h[i].toLowerCase().substring(0,1).toUpperCase()+h[i].substring(1);
            }
            else{
                if(h[i].substring(0,1).equals(h[i].substring(0,1).toUpperCase())){
                    c+=h[i].toLowerCase().substring(0,1).toUpperCase()+h[i].substring(1);
                }
                else{
                    c+=h[i].toLowerCase();
                }
            }
        }
        return c;
    }
    public static void main(String[] args) {
        String str1="the-stealth-warrior";
        String str2="The_Stealth_Warrior";
        //toCamelCase(str1);
        String z=str1.toLowerCase().substring(0,1);
        System.out.println(z);
        System.out.println(toCamelCase(str1));
        System.out.println(toCamelCase(str2));
    }
}
