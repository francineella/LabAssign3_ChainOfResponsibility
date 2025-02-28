
abstract class WasteCollector {
    protected WasteCollector nextCollector;

    public void setNextCollector (WasteCollector nexCollector) {
        this.nextCollector = nextCollector;
    }

    public void collectWaste (WasteContainer container) {
        if (canHandle(container)){
            handleCollection(container);
        } else if  (nextCollector != null) {
            nextCollector.collectWaste(container);
        } else {
            System.out.println("No collector available.");
        }
    }
        protected abstract boolean canHandle(WasteContainer container);

        protected abstract void handleCollection(WasteContainer container);
}