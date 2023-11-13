import magazin.MagazinService;

public class Main {
    public static void main(String[] args) {
        MagazinService magazinService = new MagazinService();
        magazinService.addPret("Lapte", 15);
        magazinService.addPret("Cafea", 30);

        magazinService.vinde("Lapte");
        magazinService.vinde("Lapte");
        magazinService.vinde("Lapte");
        magazinService.vinde("Cafea");

        magazinService.afisareTranzactii();
        magazinService.afiseazaRaportNrVanzariPerProdus();
        magazinService.afisareSumaVanzariProdus("Lapte");

        magazinService.afisareProduse();
        magazinService.afiseazaNrVanzari();
    }
}