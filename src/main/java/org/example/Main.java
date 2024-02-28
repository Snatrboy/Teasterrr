import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Main {
    public static void main(String[] args) {
        String name;
        String j;
        String L;

        Scanner cod = new Scanner(System.in);

        System.out.print("Masukkan Nama: ");
        name = cod.nextLine();

        System.out.print("Masukkan Jenis Kelamin (P/L): ");
        j = cod.next();

        if (j.equals("L")) {
            j = "Laki-Laki";
        } else if (j.equals("P")) {
            j = "Perempuan";
        } else {
            j = "Tidak Diketahui";
        }


        System.out.print("Masukkan Tanggal Lahir (yyyy-mm-dd): ");
        L = cod.next();

        LocalDate tanggalLahirObjek = LocalDate.parse(L);

        LocalDate sekarang = LocalDate.now();

        Period periode = Period.between(tanggalLahirObjek, sekarang);

        System.out.println("Nama: " + name);
        System.out.println("Jenis Kelamin: " + j);
        System.out.println("Umur Anda: " + periode.getYears() + " tahun, " + periode.getMonths() + " bulan, dan " + periode.getDays() + " hari");
    }
}
