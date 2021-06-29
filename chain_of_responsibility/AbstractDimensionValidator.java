package design.pattern.chain_of_responsibility;

import java.util.List;
import java.util.Map;

public abstract class AbstractDimensionValidator {
    private AbstractDimensionValidator next;

    private List<String> uploadStatus;

    private boolean hasNext() {
        return this.next != null;
    }

    protected void setNext(AbstractDimensionValidator next) {
        this.next = next;
    }

    protected  void setUploadStatus(List<String> uploadStatus) {
        this.uploadStatus = uploadStatus;
    }

    protected void executeNext(Map<String, List<String>> dataset) {
        if (hasNext()) {
            this.next.setUploadStatus(uploadStatus);
            this.next.validate(dataset);
        }
    }

    protected abstract void validate(Map<String, List<String>> dataset);
}
