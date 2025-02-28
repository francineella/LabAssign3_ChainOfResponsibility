
public class HazardousWasteCollector extends WasteCollector {
    @Override
    protected boolean canHandle(WasteContainer container) {
        return "hazardous".equalsIgnoreCase(container.getType());
    }
    @Override
    protected void handleCollection(WasteContainer container) {
        System.out.println("Hazardous waste collected and processed.");
    }
}