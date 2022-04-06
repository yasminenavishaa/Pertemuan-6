public class PencarianMhs {
    Mahasiswa listMhs[];
    int idx;
    public int posisi;
    
    void tambah(Mahasiswa m){
        if(idx < listMhs.length){
            listMhs[idx] = m;
            idx++;
        }else{
            System.out.println("Data sudah penuh !!");
        }
    }
    void tampil(){
        for(Mahasiswa m : listMhs){
            m.tampil();
            System.out.println("-----------------------");
        }
    }
    public int findSeqSearch(String cari){
        int posisi = -1;
        for(int j=0; j < listMhs.length; j++){
            if(cari.equals(listMhs[j].nama)){
                posisi = j;
                break;
            }
        }
        return posisi;
    }
    public void Tampilposisi(String cari, int pos){
        if(pos != - 1){
        System.out.println("data : " +cari+ " ditemukan pada indeks " + pos);
        }else{           
        System.out.println("data " +cari+ "tidak ditemukan");
        }
    }
    public void TampilData(String cari, int pos){
        if(pos != -1){
            System.out.println("NIM\t : " + cari);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        }else{
            System.out.println("data " +cari+ "tidak ditemukan ");
        }
    }
}
