public class homework2_4_temperature {
    public static void main(String[] args) {
        int t=143;
        if(t>-5){
            System.out.println("Тепло");
        }
        else if(t<=-5 && t>-20){
            System.out.println("Нормально");
        }
        else if(t<=-20){
            System.out.println("Холодно");
        }
    }
}
