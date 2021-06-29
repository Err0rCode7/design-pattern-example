package design.pattern.chain_of_responsibility;

import java.util.*;

public class ApplicationMain {

    /**
     *  Chain of Responsibility Example
     *
     *  데이터 업로드 시, 데이터의 정합성을 검증하는 프로세스 예제
     *  정합성에는 데이터의 정합성, 디멘션 코드 정합성, 손익 항목의 정합성이 검증 되어야한다.
     *  모든 검증은 업로드 되는 순간 모두 검증되어야 하며 검증 결과를 출력해야한다.
     */
    public static void main(String[] args) {

        Map<String, List<String>> dataset = makeTestData();
        List<String> uploadStatus = new ArrayList<>();

        AbstractDimensionValidator codeValidator = new DimensionCodeValidator();
        AbstractDimensionValidator plItemValidator = new DimensionPlItemValidator();
        plItemValidator.setNext(codeValidator);

        AbstractDimensionValidator organizationValidator = new DimensionOrganizationValidator();
        organizationValidator.setNext(plItemValidator);
        organizationValidator.setUploadStatus(uploadStatus);

        organizationValidator.validate(dataset);
    }

    public static Map<String, List<String>> makeTestData() {
        Map<String, List<String>> dataMap = new HashMap<>();

        dataMap.put("Code", Arrays.asList("C0201", "C0202", "C0203"));
        dataMap.put("Org", Arrays.asList("담당", "지역단", "본부"));
        dataMap.put("Pl", Arrays.asList("원수보험료", "손해액", "평가금액"));

        return dataMap;
    }
}
