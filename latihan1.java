public class latihan1 {
    public static void main(String[] args) {
        String data [][] = {{"Zhong Chenle","351756789","Shanghai","22 November 2001"
                            ,"laki-laki","SMK Telkom Malang","RPL", "Sawojajar", "Ngoding"}};
        
        for(int b = 0; b<data.length; b++){
            System.out.println("Nama : " + data [b][0]);
            System.out.println("NIS : " + data [b][1]);
            System.out.println("Tempat Lahir : " + data [b][2]);
            System.out.println("Tanggal Lahir : " + data [b][3]);
            System.out.println("Jenis Kelamin : " + data [b][4]);
            System.out.println("Asal Sekolah : " + data [b][5]);
            System.out.println("Pilihan Jurusan : " + data [b][6]);
            System.out.println("Alamat di Malang : " + data [b][7]);
            System.out.println("Bakat/Minat : " + data [b][8]);
        }
    }
}