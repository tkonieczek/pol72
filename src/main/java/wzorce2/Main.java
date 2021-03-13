package wzorce2;

import java.util.Date;

public class Main {



    public static void main(String[] args) {
        Report report = new Report("Maniek", "Raportcik", new Date(), "Tresc raportu");
        ReportPrinter reportPrinter = new ReportPrinter();
        reportPrinter.printReport(report, Format.PLAIN);
        reportPrinter.printReport(report, Format.XML);
        reportPrinter.printReport(report, Format.JSON);
        reportPrinter.printReport(report, Format.JSON);
    }
}
