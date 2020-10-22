import java.util.Scanner;

class praktikumquiz{
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		String nama;
		char merek,tipe;
		int kembalian,totalharga,bayar,jumlahunit;
		int harga = 0;
		boolean loop = true;
		
	System.out.print("masukkan nama anda : ");
        nama = input.nextLine();
        
        System.out.print("Masukkan jumlah unit yang anda inginkan :");
        jumlahunit = input.nextInt();

while (loop){
	System.out.print("Merek yang anda cari(G/O) : ");
        merek= input.next().charAt(0);
       
	 if(merek == 'G'){
        	while(loop){
        		System.out.print("Masukkan Tipe nya (M/K/L) : ");
                        tipe= input.next().charAt(0);
        	switch(tipe){
            case 'M' :
                harga = 95000;
                System.out.println("harga : "+harga);
                loop = false;
                break;
            case 'K' :
               harga = 125000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
                case 'L' :
               harga = 450000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
            default :
                System.out.println("ndak ditemukan tipe yang anda cari");
                break;
        	}
        	
        }
    }
    else if(merek =='O'){
    	while(loop){
    		System.out.print("Masukkan Tipe nya(M/K/L) : ");
                tipe= input.next().charAt(0);
    	switch(tipe){
            case 'M' :
                harga = 115000;
                System.out.println("harga : "+harga);
                loop = false;
                break;
            case 'K' :
               harga = 135000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
                case 'L' :
               harga = 550000;
                 System.out.println("harga :" +harga);
                 loop = false;
                break;
            default :
                System.out.println("ndak ditemukan tipe yang anda cari");
                break;
    	}
    		
    	
    }
   	}else{
		
		System.out.print("tidak ditemukan merek yang anda cari");
	}
	
}
       
	totalharga = jumlahunit*harga;
	System.out.println("Total Harga    : "+totalharga);
	System.out.println();
	System.out.print("Masukkan Jumlah uang anda : ");
	bayar = input.nextInt();
	
	kembalian = bayar-totalharga;
	
	System.out.println("=============================");
	System.out.println("Nama pelanggan : " +nama);
	System.out.println("Total harga    : " +totalharga);
	System.out.println("Pembayaran     : " +bayar);
	System.out.println("Kembaliaan     : " +kembalian);
	System.out.println("=============================");
		
}
}