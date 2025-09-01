public class ReportService {
    private Logger logger;

    public ReportService(Logger logger) {
        this.logger = logger; 
    }

    public void generate() {
        logger.log("Generating report...");
        System.out.println("Report contents...");
        logger.log("Report generated.");
    }
}