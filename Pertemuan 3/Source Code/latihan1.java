public class latihan1{
    String nama;
    int hargaSatuan,jumlah;

    int hitungHargaTotal(){
      return hargaSatuan*jumlah;
    }
    int hitungDiskon(){
        int totalDiskon=0;
        if(hitungHargaTotal()>100000){
            totalDiskon=hitungHargaTotal()*10/100;
        }
        else if(hitungHargaTotal()>50000 && hitungHargaTotal()<=100000){
            totalDiskon=hitungHargaTotal()*5/100;
        }
        else{
        }
        return totalDiskon;
    }
    int hitungHargaBayar(){
    	return hitungHargaTotal()-hitungDiskon();
    }
}