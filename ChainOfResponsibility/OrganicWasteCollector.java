

public class OrganicWasteCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return "organic".equalsIgnoreCase(container.getType());
    }
    @Override
    protected void handleCollection(WasteContainer container) {
        System.out.println("Organic waste disposed safely.");
    }
}