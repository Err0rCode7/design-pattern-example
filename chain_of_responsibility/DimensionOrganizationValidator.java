package design.pattern.chain_of_responsibility;

import java.util.List;
import java.util.Map;

public class DimensionOrganizationValidator extends AbstractDimensionValidator {

    @Override
    protected void validate(Map<String, List<String>> dataset) {
        List<String> codeDataset = dataset.get("Org");

        if (codeDataset != null) {
            for (String data : codeDataset) {
                if (data != null) {
                    System.out.println("조직 " + data + "이(가) 검증되었습니다.");
                }
            }
        }
        this.executeNext(dataset);
    }
}
