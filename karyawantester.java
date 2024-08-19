package siswa.siswa;

public class karyawantester {
    public static void main(String[] args) {
        // object
        // Class object = new Construction
        karyawan burhan = new karyawan(26,"burhan","TU","tulungAgung");
        karyawan melvin = new karyawan(21,"melvin","TU","malang");
        karyawan gilam = new karyawan(19,"gilam","Kesiswaan","papua");
        karyawan bintang = new karyawan(25,"bintang","Kurikulum","tulungagung");
        karyawan ibra = new karyawan(29,"ibra","Kesiswaan","lamongan");

        burhan.print();
        System.out.println();
        melvin.print();
        System.out.println();
        gilam.print();
        System.out.println();
        bintang.print();
        System.out.println();
        ibra.print();
    }
}
    

