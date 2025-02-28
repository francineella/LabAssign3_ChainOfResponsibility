
public class WasteManagementSystem {
    public static void main(String[] args) {
        WasteCollector organicCollector = new OrganicWasteCollector();
        WasteCollector recyclableCollector = new RecyclableWasteCollector();
        WasteCollector hazardousCollector = new HazardousWasteCollector();

        organicCollector.setNextCollector(recyclableCollector);
        recyclableCollector.setNextCollector(hazardousCollector);

        WasteContainer organicBin = new WasteContainer("organic", 50, 50);
        WasteContainer recyclableBin  = new WasteContainer("recyclable", 50, 40);
        WasteContainer hazardousBin = new WasteContainer("hazardous", 50, 35);
        WasteContainer unknownBin = new WasteContainer("electronic", 40, 40);

        System.out.println("Processing waste bins...");
        organicCollector.collectWaste(organicBin);
        organicCollector.collectWaste(recyclableBin);
        hazardousCollector.collectWaste(hazardousBin);
        organicCollector.collectWaste(unknownBin);
    }

}