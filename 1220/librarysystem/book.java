public class book implements borrowable{
}
public void borrow(){
    if(!isBorrowed){
        isBorrowed=true;
        system.out.print("您以借閱"+title+"作者"+author);
    }
    else{
        System.out.println(title+"此書已被借閱");
    }
}
public  void  returnitem(){
    if (isBorrowed){
        isBorrowed=false;
        system.out.print("您以歸還"+title+"作者"+author);
    }
    else{
        System.out.println(title+"此書未被借閱");
    }
    }
}