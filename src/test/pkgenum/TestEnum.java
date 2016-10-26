
package test.pkgenum;
 import static java.lang.System.out;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class TestEnum {

    
    public static void main(String[] args) {
        yearmanths manth= yearmanths.jan;
        System.out.println(manth.getnum());
        System.out.println(manth.ordinal()+1);
        System.out.println(manth.compareTo(yearmanths.may));
        System.out.println(manth.equals(yearmanths.jan));
       //firsttennum.x1.value=5;   // غيرت قيمة حاجة انت عاوزة ثابتة
       
       // فيه حلين الاول تعمل القيمة بريفت وبكدا محدش يقدر يغيرها 
       // التاني  تعملىالقيمة في الصل فاينال 
       one_of_firsttennum number;  // متغير سوف يشير الي احد الوبجيكت المعدودة سابقا خلال انشاء ال اينم number
       number= one_of_firsttennum.ten; // اشار الي ابجيكت اللي اسمه اكس عشرة
       System.out.println(one_of_firsttennum.one);
       // automatic un boxing to string value of object name.
       System.out.println(number);
       
       System.out.println(number.value);
       one_of_firsttennum.values();
       for (int i = 0; i <  one_of_firsttennum.values().length; i++) {
           
           System.out.println( one_of_firsttennum.values()[i]);}
        
     System.out.println(number.valueOf("two")) ;  // automatic autoboxing
      out.println (one_of_firsttennum.valueOf(new String("five"))); // اوبيجكيت مجهول الاسم مجهول الاسم من كلاس سترينج
      
     // one_of_firsttennum onenumber  =    one_of_firsttennum .valueOf(new Scanner(System.in).next());
     one_of_firsttennum onenumber  =    one_of_firsttennum .valueOf(JOptionPane.showInputDialog("from one to ten"));
     int h;
    switch(onenumber)
    {
                   case one :
                   System.out.println("the number is one") ;
                      h=1     ;
                   break;
                   case two :
                   System.out.println("the number is two")  ;
                   h=2;
                   break;
                   case three :
                   System.out.println("the number is three")  ;
                   h=3;
                   break;
                   case four :
                   System.out.println("the number is foue")  ;
                   h=4;
                   break;
                   case five :
                   System.out.println("the number is five")  ;
                   h=5;
                   break;
                   case six :
                   System.out.println("the number is six")  ;
                   h=6;
                   break;
                   case seven :
                   System.out.println("the number is seven")  ;
                   h=7;
                   break;
                   case eight :
                   System.out.println("the number is eight")  ;
                   h=8;
                   break;
                   case nine:
                   System.out.println("the number is nine")  ;
                   h=9;
                   break;
                   case ten :
                   System.out.println("the number is ten")  ;
                   h=10;
                   break;}
    
    //System.out.println(h); erorr 
    /*
    في احتمال اني ادخل نص عير من واحد لحد عشرة
    في هذه الحالة البرنامج المفروض يضرب اكسيشن
افرض ان انا مهندل الكسيشن دا  بجملة كاتش فاضية وممكن يقبل اي حاجة من غير ما يوقف البرنامج    
   في هذه الحالة ولا جملة من سويتش هتتنفذ واتش مش هتاخد قيمة 
    */
    
   System.out.println(number.ordinal());
   
   System.out.println(number.compareTo(onenumber));
   
   System.out.println(number.equals(onenumber));
   NewClass.fuckedshrmeet moza =  NewClass.fuckedshrmeet.maha;
  NewClass.fuckedshrmeet makna =  NewClass.fuckedshrmeet.marwa;
   moza.timesofifuchherpussy();
   makna.timesofifuchherpussy();
   moza.print();
   makna.print();
   NewClass.myinter fagra =  NewClass.fuckedshrmeet.maha;
   fagra.print();
   NewClass.myinter bigass =  NewClass.fuckedshrmeet.marwa;
   bigass.print();
   
   
}}
