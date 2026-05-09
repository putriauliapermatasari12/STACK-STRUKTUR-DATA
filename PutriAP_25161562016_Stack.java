
public class PutriAP_25161562016_Stack {
    //deklarasi stack
    static int size=10;
  static String[] stack = new String[size];//ini agar nanti bisa buat boolean isfull dan isempty,biar bisa manggil size nya
  static int top = -1;

 
 
public static void push (String tiket){
    //operasi stack
   //push itu untuk proses penumpukan ke dalam array(memasukkan nilai)
   //pengecekan overflow
   if(top==size-1){//index mulai dr 0 jd ktk top==size-1 itu = top=9(10-1),jd ini kondisi ktk tempat itu sudah full
       System.out.println("Stack penuh");
   }
   else{
       top++;//langsung masukkan rumus,berfungsi untuk menyiapkan tempat diatas elemen yg sdh ada
       stack[top]=tiket;//guna lgsg masukkan data
   }
}
public static String pop(){
    //pop adalah operasi utk menghilangkan atau menghapus elemen yg sdh masuk td (di push)
    if(top==-1){//pengecekan underflow
        return "Stack kosong";
    }
    else{
        String ambiltiket = stack[top];//memegang elemen paling atas di tumpukan
        top--;//utk mengurangi elemen dari tumpukan
        return ambiltiket;//mengambil elemen
    }
}
public static String peek(){
    //peek guna mengecek elemen di tumpukan itu apakah penuh atau kosong atau ada isinya
    if(top==-1){//mengembalikan elemen top tanpa menghapus
        return "Stack kosong";//mengembalikan jika stack kosong
    }
    else{
        return stack[top];//mengembalikan nilai top ke main krn tdk kosong
    }
}
public static boolean isEmpty(){
    return top==-1;
}
public static void tampilkanStack(){
    System.out.println("=== Isi Stack(TOP -> BOTTOM)===");
    for(int i=top;i>=0;i--){
        System.out.println("| "+stack[i]+" |");
    }
    System.out.println("===============================");
}
public static void hitungTotal(){
    int total = 0;//tempat nyimpen hasil dan knp 0? tentu karna biar ngitungnya mulai dari 0 dan tumpukan pertama jg ada di indeks 0n kann
    //pengulangan buat ngecek tumpukan dari elemen satu persatu
    for (int i=0;i<=top;i++){
        if(i==0){
            total=total+50000;// harga tiket indeks pertama (avengers)
        }
        else{
            total=total+45000;//harga tiket sisa atau yg berada di indeks ke2.ini jika if nya td salah maka ini yg beroperasi
        }
    }
    System.out.println("Total Harga Tiket: "+total);
}
public static void main(String[]args){
    push("Tiket-A01: Avangers Rp.50.000");
    push("Tiket-B02: Interstellar Rp.45.000");
    push("Tiket-C03: Inception Rp.45.000");
    
    tampilkanStack();
    System.out.println("Tiket terakhir masuk: "+peek());//tampilkan tiket paling atas
    System.out.println("Tiket dibatalkan: "+pop());//batalkan 1 transaksi dari atas (pop) dan tampilkan
    tampilkanStack();
    hitungTotal();
}
}
