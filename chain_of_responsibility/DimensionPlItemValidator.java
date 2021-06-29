package design.pattern.chain_of_responsibility;

import java.util.List;
import java.util.Map;

public class DimensionPlItemValidator extends AbstractDimensionValidator {

    @Override
    protected void validate(Map<String, List<String>> dataset) {
        List<String> codeDataset = dataset.get("Pl");
        if (codeDataset != null) {
            for (String data : codeDataset) {
                if (data != null) {
                    System.out.println("손잉항목 " + data + "이(가) 검증되었습니다.");
                }
            }
        }
        this.executeNext(dataset);
    }
}
