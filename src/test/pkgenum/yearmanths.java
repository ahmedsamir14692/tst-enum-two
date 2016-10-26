
package test.pkgenum;


public enum yearmanths {
    jan(32),feb(28),mar(31),apr(30),may(),june;  // creation 0f objecrts
    
    private int num_of_days;
    private yearmanths ( int x){
this.num_of_days=x;


}

public int getnum ()
{
return this.num_of_days;

}
private yearmanths (){
    
    
}
public void any (){
    
    jan.getnum();
    
    
}

}
