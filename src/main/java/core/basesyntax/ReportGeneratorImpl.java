package core.basesyntax;

import java.util.Map;

public class ReportGeneratorImpl implements ReportGenerator {
    private static final String REPORT_HEADER = "fruit,quantity";

    @Override
    public String gerReport() {
        StringBuilder reportBuilder = new StringBuilder();
        reportBuilder.append(REPORT_HEADER);

        for (Map.Entry<String, Integer> entry : Storage.fruitModels.entrySet()) {
            reportBuilder.append(System.lineSeparator())
                    .append(entry.getKey())
                    .append(",")
                    .append(entry.getValue());
        }
        return reportBuilder.toString();
    }
}
