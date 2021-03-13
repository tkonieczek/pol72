package wzorce2;

public class ReportPrinter {


    public void printReport(Report report, Format format) {
        upPrinter(report);
        if(format == Format.XML) {
            System.out.println("Printuje w formacie XML " + report.getContent());
        } else if(format == Format.PLAIN) {
            System.out.println("Printuje w formacie PLAIN " + report.getContent());
        } else if(format == Format.JSON) {
            System.out.println("Printuje w formacie JSON " + report.getContent());
        }
        downPrinter(report);
    }

    private void upPrinter(Report report) {
        System.out.println(report.getDate());
        System.out.println(report.getTitle());
    }

    private void downPrinter(Report report) {
        System.out.println(report.getAuthor());
    }

}
