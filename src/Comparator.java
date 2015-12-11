public class Comparator implements java.util.Comparator{
    private  String alphabet = "abcdefghijklmnopqrstubvwxyz";
    public Comparator() {
    }
    public  int compare(Object o1, Object o2){
        if (alphabet.indexOf(o1.toString().trim().toLowerCase().substring(0, 1)) ==
                alphabet.indexOf(o2.toString().trim().toLowerCase().substring(0, 1))) {
            return 0;
        }else if (alphabet.indexOf(o1.toString().trim().toLowerCase().substring(0,1)) >
                alphabet.indexOf(o2.toString().trim().toLowerCase().substring(0,1))){
            return -1;
        }
        return 1;
    }
}
