public class Main {
    public static void main(String[] args) {
        try{
            int [] sayilar = new int[]{1, 2, 3};
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (StringIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println("Farklı Bir Hata Oluştu");
        }
        finally {
            System.out.println("her türlü çalışır");
        }
    }

}