

public class RecyclableWasteCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return "recyclable".equalsIgnoreCase(container.getType());
    }
    @Override
    protected void handleCollection(WasteContainer container) {
        System.out.println("Recyclable waste collected and processed.");
    }
}