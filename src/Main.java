public class Main {
    public static void main(String[] args) throws MyExeption {
   myExeptionTester(1);
    }

    private static String fun(String k){
        if(k.equals("k")){
            try {
                throw new MyExeption("k!=k");
            } catch (MyExeption myExeption) {
                myExeption.printStackTrace();
            }
        }
        return  null;
    }
    static String myExeptionTester(int ricxvi) throws MyExeption {
        if(ricxvi!=0){
            throw new MyExeption("ricxvi unda iyos nulis toli");
        }
        return null;
    }

}
